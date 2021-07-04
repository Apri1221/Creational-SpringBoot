package com.example.creational.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Singleton ini digunakan untuk membuat objek yang sama, hanya 1, di seluruh aplikasi
 * seperti koneksi database
 * ketika dirubah, semua client yg mengkonsumsi objek mendapat perubahan, tidak dirubah manual objek yg di inisiasi
 *
 * Sebaiknya singleton application harus immutable, tidak bisa dirubah, menghindari race condition
 *
 * Singleton object otomatis di sharing kan ke client
 */

@SpringBootApplication
public class SingletonApplication {


    @Bean // Object ini akan di return dan ini akan diregistrasikan ke Bean
    public Counter counter() {
        return new Counter();
    }

    // Method ini akan di test di UnitTest, shift command T (mac) / ctrl shift T (windows)
}
