package controller;

import entities.Departament;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @GetMapping
    public static Departament getProducts() {
        Departament techDepartament = new Departament();
        techDepartament.setId(1L);
        techDepartament.setName("TechDepartament");

        return techDepartament;
    }
}
