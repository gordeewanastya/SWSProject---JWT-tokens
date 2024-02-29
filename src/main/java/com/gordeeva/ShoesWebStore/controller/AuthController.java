package com.gordeeva.ShoesWebStore.controller;

import com.gordeeva.ShoesWebStore.dto.security.AuthenticationRequest;
import com.gordeeva.ShoesWebStore.dto.security.RegisterRequest;
import com.gordeeva.ShoesWebStore.security.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationService authService;

//    @GetMapping("/login")
//    public String login(Model model){
//        model.addAttribute("authRequest", new AuthenticationRequest());
//        return "login";
//    }
//
    @PostMapping("/login")
    public String doLogin(@ModelAttribute("authRequest") AuthenticationRequest request){
        authService.authenticate(request);
        return "redirect:/";
    }

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("registerRequest", new RegisterRequest());
        model.addAttribute("authRequest", new AuthenticationRequest());
        return "login";
    }

    @PostMapping("/register")
    public String doRegister(@ModelAttribute("registerRequest") RegisterRequest request){
        authService.register(request);
        return "redirect:/";
    }
}
