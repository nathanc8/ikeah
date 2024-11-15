package com.example.demo;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//interface pour gérer les accès aux données de Product sans écrire de requetes SQL.
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p")
    default List<Product> findWithLimit(int limit) {
        return findAll(PageRequest.of(0, limit)).getContent();
    }

    @Query("SELECT p FROM Product p WHERE p.id = :id")
    Product findProductById(@Param("id") int id);

    @Query("SELECT p FROM Product p JOIN p.color c WHERE c.name = :color")
    List<Product> findByColor(@Param("color") String color);

    @Query("SELECT p FROM Product p  JOIN p.category c WHERE c.name = :categoryName")
    List<Product> findByCategoryName(@Param("categoryName") String categoryName);

    @Query("SELECT p FROM Product p WHERE p.price < :price")
    List<Product> findByPriceLessThan(@Param("price") Double price);
}
