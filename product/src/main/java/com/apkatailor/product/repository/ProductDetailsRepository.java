package com.apkatailor.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apkatailor.product.entity.ProductDetails;

public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Long> {
}