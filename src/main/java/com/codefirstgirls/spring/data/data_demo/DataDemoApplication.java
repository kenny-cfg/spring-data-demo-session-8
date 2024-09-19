package com.codefirstgirls.spring.data.data_demo;

import com.codefirstgirls.spring.data.data_demo.model.Book;
import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class DataDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataDemoApplication.class, args);

        val book = Book.builder()
                .title("The Title")
                .year(1969)
                .author("May Dupp")
                .price(BigDecimal.TEN)
                .build();
        val amendedBook = book.toBuilder()
                .author("Mary Ann")
                .build();

        System.out.println("First book author: " + book.getAuthor());
        System.out.println("Second book author: " + amendedBook.getAuthor());
    }

}
