package com.codefirstgirls.spring.data.data_demo.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder(toBuilder = true)
@Data
public class Book {
    private final String title;
    private final int year;
    private final String author;
    private final BigDecimal price;
}
