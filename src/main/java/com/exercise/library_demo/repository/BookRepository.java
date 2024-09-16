package com.exercise.library_demo.repository;

import com.exercise.library_demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    long countByAuthorAndTitle(String author, String title);
}