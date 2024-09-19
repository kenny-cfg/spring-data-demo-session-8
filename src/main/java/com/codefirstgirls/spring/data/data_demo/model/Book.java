package com.codefirstgirls.spring.data.data_demo.model;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public class Book {
    private String title;
    private int year;
    private String author;
    private BigDecimal price;
}
