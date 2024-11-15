package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.fasterxml.jackson.core.io.NumberInput.parseInt;

@SpringBootApplication
public class IKeyAhApplication {

	public static void main(String[] args) {
		SpringApplication.run(IKeyAhApplication.class, args);
	}
	// fonction qui permet de nous donner un meuble avec son id
	// lire le json qui est dans assets avec la méthode fileReader
	// meuble qui est parse par la méthode JSON pour retourner un meuble objet
	// retourne un tableau json du fichier parser
	// a l'aide de l'index on recupère toutes les informations du meuble

	public static String giveOneFurniture(Integer idFurniture){
		try {
			int i = parseInt(String.valueOf(idFurniture));
			FileReader furnitureFile = new FileReader("assets/theMeuble.json");
			Object furnitureObject = new JSONParser().parse(furnitureFile);
			JSONArray furnitureJSONArray = (JSONArray) furnitureObject;
			Object furnitureParam = furnitureJSONArray.get(i);
			return furnitureParam.toString();
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e.getMessage());
		} catch (IOException e) { //Exception threw by .parse()
			System.err.println("I/O error occurred: " + e.getMessage());
		} catch (org.json.simple.parser.ParseException e) {
            throw new RuntimeException(e);
        }
        return null;
	}

	// idem mais pour tous sans l'ID
	public static String giveAllFurniture(){
		try {
			FileReader furnitureFile = new FileReader("assets/theMeuble.json");
			Object furnitureObject = new JSONParser().parse(furnitureFile);
			JSONArray furnitureJSONArray = (JSONArray) furnitureObject;
			return furnitureJSONArray.toString();
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("I/O error occurred: " + e.getMessage());
		} catch (org.json.simple.parser.ParseException e) {
			throw new RuntimeException(e);
		}
		return null;
	}
}
