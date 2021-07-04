package com.example.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductLombokTest {

    @Test
    void testLombokBuilder() {
        ProductLombok android = ProductLombok.builder()
                .id("id")
                .name("android")
                .sku("xxx")
                .build();

        System.out.println(android);

        ProductLombok iPhone = new ProductLombok.ProductLombokBuilder()
                .id("id")
                .name("iPhone")
                .price(2_500_000L)
                .build();

        System.out.println(iPhone);
    }

}