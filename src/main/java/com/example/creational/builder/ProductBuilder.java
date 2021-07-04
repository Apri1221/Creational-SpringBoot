package com.example.creational.builder;


// kalau secara manual di implementasikan (developer manual buatin)
// Builder pattern bisa dibantu dengan library Lombok, anotasi @Builder pada kelas kompleksnya
public class ProductBuilder {

    private String id;

    private String name;

    private String sku;

    private Long price;


    // dibuat kaya gini biar bisa chaining, dia gak void
    public ProductBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public ProductBuilder setPrice(Long price) {
        this.price = price;
        return this;
    }

    public Product build() { // <--- di akhir di chaining dengan ini
        return new Product(id, name, price, sku);
    }
}
