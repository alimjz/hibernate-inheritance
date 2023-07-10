package com.train.hibernateinheritance.controller;

import com.train.hibernateinheritance.entity.singletable.Book;
import com.train.hibernateinheritance.entity.singletable.Product;
import com.train.hibernateinheritance.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> findAllEmployees(){
        return service.findAllProducts();
    }
    @GetMapping("/book")
    public List<Book> findAllBooks(){
        return service.findAllBooks();
    }
}
