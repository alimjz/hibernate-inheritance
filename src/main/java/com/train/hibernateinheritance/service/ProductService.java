package com.train.hibernateinheritance.service;

import com.train.hibernateinheritance.entity.singletable.Book;
import com.train.hibernateinheritance.entity.singletable.Product;
import com.train.hibernateinheritance.entity.singletable.Table;
import com.train.hibernateinheritance.repository.BookRepository;
import com.train.hibernateinheritance.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;
    private final BookRepository bookRepository;

    public ProductService(ProductRepository repository, BookRepository bookRepository) {
        this.repository = repository;
        this.bookRepository = bookRepository;
        // Product Id should be unique since all objects are saved in same table.
        this.repository.save(new Book(1,"Walking on the moon with Einestein","Joshua Fuer"));
        this.repository.save(new Book(2,"Give and Take","Adam Grant"));
        this.repository.save(new Table(3, "Squar Table", "Brown"));
        this.repository.save(new Table(4, "Circle Table", "Black"));
    }

    public List<Product> findAllProducts(){
        return repository.findAll();
    }

    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }
}
