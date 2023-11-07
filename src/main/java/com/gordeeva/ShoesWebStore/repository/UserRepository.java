package com.gordeeva.ShoesWebStore.repository;

import com.gordeeva.ShoesWebStore.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmailAddress(String email);
}
