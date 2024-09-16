package com.exercise.library_demo.service;

import com.exercise.library_demo.entity.Book;
import com.exercise.library_demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    BookRepository repository;

    public Book findBook(int id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Book> allBooks() {
        return repository.findAll();
    }

    public long countBook(String a, String t) {
        return repository.countByAuthorAndTitle(a, t);
    }

}
