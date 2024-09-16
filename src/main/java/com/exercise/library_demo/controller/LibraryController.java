package com.exercise.library_demo.controller;

import com.exercise.library_demo.dto.BookRequest;
import com.exercise.library_demo.entity.Book;
import com.exercise.library_demo.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    LibraryService service;

    @GetMapping("book/{id}")
    public Book findBook(@PathVariable int id) {
        return service.findBook(id);
    }

    @GetMapping("books")
    public List<Book> findAll() {
        return service.allBooks();
    }

    @PostMapping("/book/count")
    public long countBook(@RequestBody BookRequest bookRequest) {
        return service.countBook(bookRequest.getAuthor(), bookRequest.getTitle());
    }

}
