package com.example.gccoffee1.service;

import com.example.gccoffee1.model.Order;
import com.example.gccoffee1.model.OrderItem;

import java.util.List;

public interface OrderService {

    Order createOrder(String email, String address, String postcode, List<OrderItem> orderItems);

    List<Order> getOrdersByEmail(String email);
    List<Order> getAllOrders();
}
