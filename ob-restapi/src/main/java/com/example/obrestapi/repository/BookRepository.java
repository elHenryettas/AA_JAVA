package com.example.obrestapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.obrestapi.models.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {  
}
