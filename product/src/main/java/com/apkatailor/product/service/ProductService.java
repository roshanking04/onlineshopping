package com.apkatailor.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apkatailor.product.entity.Product;
import com.apkatailor.product.entity.ProductDetails;
import com.apkatailor.product.entity.ProductItem;
import com.apkatailor.product.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        for (ProductItem item : product.getItems()) {
            item.setProduct(product);
        }
        for (ProductDetails detail : product.getDetails()) {
            detail.setProduct(product);
        }
        return productRepository.save(product);
    }
}