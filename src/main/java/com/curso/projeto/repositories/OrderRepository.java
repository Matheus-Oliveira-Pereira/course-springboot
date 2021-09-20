package com.curso.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
