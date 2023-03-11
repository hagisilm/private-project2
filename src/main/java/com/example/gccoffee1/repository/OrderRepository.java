package com.example.gccoffee1.repository;

import com.example.gccoffee1.model.Order;

import java.util.List;

public interface OrderRepository {
    Order insert(Order order);

    List<Order> findByEmail(String email);

    List<Order> findAll();
}
