package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // Récupérer tous les produits
    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/productId/{productId}")
    public Product getSingleProducts(@PathVariable int productId) {
        return productRepository.findProductById(productId);
    }

    @GetMapping("/{limit}")
    public List<Product> getSomeProducts(@PathVariable int limit) {
        return productRepository.findWithLimit(limit);
    }

    // Récupérer les produits par couleur
    @GetMapping("/color/{color}")
    public List<Product> getProductsByColor(@PathVariable String color) {
        return productRepository.findByColor(color);
    }

    // Récupérer les produits par category
    @GetMapping("/category/{categoryName}")
    public List<Product> getProductsByCategoryName(@PathVariable String categoryName) {
        return productRepository.findByCategoryName(categoryName);
    }

    // Récupérer les produits par prix inférieur
    @GetMapping("/price/{price}")
    public List<Product> getProductsByPriceLessThan(@PathVariable Double price) {
        return productRepository.findByPriceLessThan(price);
    }
}
