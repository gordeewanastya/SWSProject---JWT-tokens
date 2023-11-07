package com.gordeeva.ShoesWebStore.security;

import com.gordeeva.ShoesWebStore.dto.security.AuthenticationRequest;
import com.gordeeva.ShoesWebStore.dto.security.AuthenticationResponse;
import com.gordeeva.ShoesWebStore.dto.security.RegisterRequest;
import com.gordeeva.ShoesWebStore.model.Role;
import com.gordeeva.ShoesWebStore.model.UserEntity;
import com.gordeeva.ShoesWebStore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authManager;

    public AuthenticationResponse register(RegisterRequest request) {
        var user = UserEntity.builder()
                .emailAddress(request.getEmailAddress())
                .phoneNumber(request.getPhoneNumber())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();

        userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);

        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmailAddress(),
                        request.getPassword()
                )
        );

        var user = userRepository.findByEmailAddress(request.getEmailAddress())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
