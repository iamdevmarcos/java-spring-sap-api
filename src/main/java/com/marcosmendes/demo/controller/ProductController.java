package com.marcosmendes.demo.controller;

import com.marcosmendes.demo.entities.Departament;
import com.marcosmendes.demo.entities.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @GetMapping
    public List<Product> getProducts() {
        Departament techDepartament = new Departament(1L, "Tech Departament");
        Departament petDepartament = new Departament(2L, "Pet Departament");

        Product macbookPro = new Product(1L, "Macbook Pro", 4500.0, techDepartament);
        Product pcGamer = new Product(2L, "PC Gamer", 9430.0, techDepartament);
        Product petHouse = new Product(3L, "Pet House", 250.0, petDepartament);

        return Arrays.asList(macbookPro, pcGamer, petHouse);
    }
}
