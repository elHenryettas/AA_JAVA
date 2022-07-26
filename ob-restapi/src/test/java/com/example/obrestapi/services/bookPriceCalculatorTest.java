package com.example.obrestapi.services;

import org.junit.jupiter.api.Test;

import com.example.obrestapi.models.Book;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class bookPriceCalculatorTest {
    
    @Test
    void calculatePriceTest(){
        // ↓ Figuracion de la prueba ↓
        Book book = new Book(1L, "ABC", "123", 340, 29.99,LocalDate.now(), true);
        bookPriceCalculator calculator = new bookPriceCalculator();
        // ↓ Comportamiento a testear ↓
        double price = calculator.calculatePrice(book);
        System.out.println(price);
        // ↓ Aserciones o comprobaciones ↓
        assertTrue(price > 0);
        assertEquals(38.97,price);


    }
}
