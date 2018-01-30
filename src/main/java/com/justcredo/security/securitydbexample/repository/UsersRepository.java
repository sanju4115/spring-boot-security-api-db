package com.justcredo.security.securitydbexample.repository;

import com.justcredo.security.securitydbexample.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
