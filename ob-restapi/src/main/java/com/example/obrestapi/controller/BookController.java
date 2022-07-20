package com.example.obrestapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.obrestapi.models.Book;
import com.example.obrestapi.repository.BookRepository;

@RestController
public class BookController {

    // atributos
    private BookRepository bookRepository;

    // constructores

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/api/getBooks")
    public List<Book> findAll(){
        return bookRepository.findAll();
    }
    
    /* @GetMapping("/api/getBooks/{id}")
    public Book findById(@PathVariable Long id){
        Optional<Book> bookOpt = bookRepository.findById(id);
        // Opcion fachera
        // return bookOpt.orElse(null);
        // Otra Opcion 
        if(bookOpt.isPresent())
            return bookOpt.get();
        else 
            return null;
        
    } */
    @GetMapping("/api/getBooks/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id){
        Optional<Book> bookOpt = bookRepository.findById(id);
        // Opcion fachera
        // return bookOpt.orElse(null);
        // Otra Opcion 
        if(bookOpt.isPresent())
            return ResponseEntity.ok(bookOpt.get());
        else 
            return ResponseEntity.notFound().build();
        
    }
    @PostMapping("/api/create")
    public Book create(@RequestBody Book body){
       return bookRepository.save(body);
    }

    /* @PutMapping("/api/update")
    public ResponseEntity<Book> updateById(@PathVariable Long id, @RequestBody Book body){
        Optional<Book> bookOpt = bookRepository.findById(id);
        if(bookOpt.isPresent())
            Book book = bookOpt.get();

            System.out.println(body); 
            return ResponseEntity.ok(body);
            
    }  */


    /* public String updateBook(){
        
    }

    public String deleteBook(){
        
    } */
}
    