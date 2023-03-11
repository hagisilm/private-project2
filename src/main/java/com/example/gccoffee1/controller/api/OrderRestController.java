package com.example.gccoffee1.controller.api;

import com.example.gccoffee1.controller.CreateOrderRequest;
import com.example.gccoffee1.model.Order;
import com.example.gccoffee1.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderRestController {

    private final OrderService orderService;

    public OrderRestController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/api/v1/orders")
    public Order createOrder(@RequestBody CreateOrderRequest orderRequest) {
        return orderService.createOrder(
                orderRequest.email(),
                orderRequest.address(),
                orderRequest.postcode(),
                orderRequest.orderItems()
        );
    }
    @GetMapping("/api/v1/order")
    public List<Order> searchItem(@RequestParam Optional<String> email) {
        return email
                .map(orderService::getOrdersByEmail)
                .orElse(orderService.getAllOrders());
    }
}
