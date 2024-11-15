package com.example.demo;
import java.util.List;

import org.springframework.stereotype.Service;

//composant de service géré par Spring.
@Service
public class ProductService {

    private final ProductRepository productRepository; //interface qui gère l'intéraction avec la base de données pour l'entité Product.

    // constructeur pour initialiser productRepository.
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProductsByColor(String color) {
        return productRepository.findByColor(color);
    }

    public List<Product> getProductsByCategoryName(String categoryName) { //méthode pour retourner une liste de prodits en fonction du nom d'un category.
        return productRepository.findByCategoryName(categoryName);
    }

    public List<Product> getProductsCheaperThan(double price) { //méthode qui retourne une liste de produits dont le prix est inférieur à price.
        return productRepository.findByPriceLessThan(price);
    }
}
