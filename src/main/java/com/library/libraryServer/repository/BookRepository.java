package com.library.libraryServer.repository;

import com.library.libraryServer.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository  extends JpaRepository<Book,Long> {
}
