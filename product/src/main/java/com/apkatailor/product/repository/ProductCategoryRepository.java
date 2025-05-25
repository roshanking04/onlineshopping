package com.apkatailor.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apkatailor.product.entity.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}