package com.codefirstgirls.spring.data.data_demo;

import com.codefirstgirls.spring.data.data_demo.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class DataDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataDemoApplication.class, args);

		/*
		var book = new Book(
		"The Title",
		1969,
		"May Dupp",
		BigDecimal.TEN
		)
		 */
		var book = Book.builder()
				.title("The Title")
				.year(1969)
				.author("May Dupp")
				.price(BigDecimal.TEN)
				.build();

		System.out.println(book);
	}

}
