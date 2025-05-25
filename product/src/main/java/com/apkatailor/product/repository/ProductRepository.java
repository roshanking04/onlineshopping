package com.apkatailor.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apkatailor.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}