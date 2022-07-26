package com.example.obrestapi.services;

import com.example.obrestapi.models.Book;

public class bookPriceCalculator {
    public double calculatePrice(Book book){
        double price = book.getPrice();
        double shipping = 3.99;
        
        if(book.getPages() > 300){
            price += 4.99;
        }

        price += shipping;

        return price;

    }
}
