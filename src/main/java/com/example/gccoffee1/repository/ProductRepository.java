package com.example.gccoffee1.repository;

import com.example.gccoffee1.model.Category;
import com.example.gccoffee1.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository {

    List<Product> findAll();

    Product insert(Product product);

    Product update(Product product);

    Optional<Product> findById(UUID productId);

    Optional<Product> findByName(String productName);

    List<Product> findByCategory(Category category);

    void deleteById(UUID uuid);
}
