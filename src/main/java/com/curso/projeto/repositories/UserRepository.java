package com.curso.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
