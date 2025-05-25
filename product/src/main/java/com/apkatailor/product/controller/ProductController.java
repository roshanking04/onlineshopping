package com.apkatailor.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apkatailor.product.entity.Product;
import com.apkatailor.product.repository.GeoLocationRepository;
import com.apkatailor.product.repository.ProductCategoryRepository;
import com.apkatailor.product.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductCategoryRepository categoryRepository;

    @Autowired
    private GeoLocationRepository geoLocationRepository;

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryRepository.findAll());
        model.addAttribute("locations", geoLocationRepository.findAll());
        return "product-register";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute Product product) {
        productService.saveProduct(product);
        return "redirect:/products/register?success";
    }
}

