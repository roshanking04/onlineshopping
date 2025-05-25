package com.apkatailor.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apkatailor.product.entity.ProductItem;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}