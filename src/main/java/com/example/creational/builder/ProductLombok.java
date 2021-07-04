package com.example.creational.builder;

import lombok.Builder;

@Builder
public class ProductLombok {
    private String id;

    private String name;

    private Long price;

    private String sku;

    public ProductLombok(String id, String name, Long price, String sku) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "ProductLombok{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sku='" + sku + '\'' +
                '}';
    }
}
