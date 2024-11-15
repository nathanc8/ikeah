package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

import static com.example.demo.IKeyAhApplication.giveAllFurniture;
import static com.example.demo.IKeyAhApplication.giveOneFurniture;


// RestController combine les fonctionnalités des annotations Controller et ResponseBody
// Permet de simplifier la création de contrôleur qui renvoient les données au client.
@RestController
public class HelloResource {

    // methode get de springboot
    @GetMapping("/hello")
    public String hello(String param){
        return "Hello " + param;
    }

    // méthode temporaire pour afficher nos données
    @GetMapping(value = "/meuble/{id}")
    public String OneFurniture(@PathVariable("id") Integer id){
        return String.valueOf(Objects.requireNonNull(giveOneFurniture(id)));
    }
    @GetMapping(value = "/meuble/all")
    public String allFurniture(){
        return String.valueOf(Objects.requireNonNull(giveAllFurniture()));
    }
}