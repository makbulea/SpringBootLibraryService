package com.library.libraryServer.controller;

import com.library.libraryServer.dto.BookDto;
import com.library.libraryServer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/book")
    public ResponseEntity<List<BookDto>> getAllUser() {
        return ResponseEntity.ok(bookService.getAllUser());
    }

    @GetMapping("book/{id}")
    public ResponseEntity<BookDto> getUserById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(bookService.getBookById(id));
    }

    @PostMapping("/book")
    public ResponseEntity<BookDto> createUser(@RequestBody BookDto book) {
        return ResponseEntity.ok(bookService.createUser(book));
    }

    @PutMapping("book/{id}")
    public ResponseEntity<BookDto> updateUser(@PathVariable Long id,
                                              @RequestBody BookDto book) {
        return ResponseEntity.ok(bookService.updateUser(id,book));
    }
}
