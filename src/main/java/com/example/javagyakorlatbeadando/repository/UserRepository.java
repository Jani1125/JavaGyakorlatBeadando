package com.example.javagyakorlatbeadando.repository;

import java.util.Optional;

import com.example.javagyakorlatbeadando.entity.User;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<User, Integer>
{
    Optional<User> findByEmail(String email); // email alapján lesz a bejelentkezés
}
