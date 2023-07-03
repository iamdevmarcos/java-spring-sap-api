package com.marcosmendes.demo.controller;

import com.marcosmendes.demo.entities.Departament;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @GetMapping
    public Departament getProducts() {
        return new Departament(1L, "Tech Departament");
    }
}
