package com.train.hibernateinheritance.repository;

import com.train.hibernateinheritance.entity.singletable.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
