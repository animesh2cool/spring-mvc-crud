package com.spring_rest.springrestapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
    //save a product
    @PostMapping("/product")
    public String saveProduct(@RequestBody Product p){
        //logic to save database
        System.out.println(p);
        return "product Saved";
    }

    //get a single product
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable Integer id ){
        Product p = null;
        if(id == 100){
            p = new Product(100, "Mouse", 300.50);
        } else if(id ==101){
            p = new Product(101,"Hard Disk", 3000.67);
        }
        return p;
    }

    //get a list of products
    @GetMapping("/products")
    public List<Product> getProducts(){
        Product p1 = new Product(100, "Mouse", 300.50);
        Product p2 = new Product(101,"Hard Disk", 3000.67);
        List<Product> products = Arrays.asList(p1,p2);
        return products;
    }
}
