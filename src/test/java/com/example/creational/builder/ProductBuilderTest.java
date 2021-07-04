package com.example.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductBuilderTest {

    @Test
    void testBuilder() {
        Product product = new ProductBuilder()
                .setId("id")
                .setName("name")
                .setPrice(2_5000_000L)
                .setSku("iPhone")
                .build();

        Product productCustom = new ProductBuilder()
                .setId("id")
                .setPrice(2_5000_000L)
                .build();

        System.out.println(product);
        System.out.println(productCustom);
    }
}