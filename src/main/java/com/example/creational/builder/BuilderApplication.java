package com.example.creational.builder;


/**
 * Kalau objeknya sedikit kompleks, disarankan gunakan ini
 * contoh kasus: data product, attribute nya banyak dalam sebuah objek
 * properti yg harus disiapkan untuk objek baru tersebut (ciri ciri: banyak attribute yg perlu di set)
 *
 * pembuatannya : ada kelas namanya Kompleks, dan ada di sebelahnya KompleksBuilder
 *
 * KompleksBuilder gunanya untuk konstruksi pembuatan kelas yang telah ditentukan
 *
 * Client menggunakan buildernya untuk membuat objek
 * Ada kelas yang meminta 20 parameter, dengan adanya builder lebih mudah
 * Diharapkan builder bisa chaining
 *
 * Builder Pattern sangat ribet / terlalu banyak hal yang dilakukan
 * Misal 1 kelas punya 10 atribute, kita buat builder dengan 10 method
 *
 * Di Spring dipermudah dengan library Lombok, DENGAN menambahkan @Builder pada kelas kompleksnya (minimal 1 property)
 *
 * Bisa diimplementasikan di DTO
 */
public class BuilderApplication {
    /**
     * kita akan buat aplikasi toko online
     *
     * punya produk
     * produk bisa punya 100 field
     *
     * kita harus buat constructor 100 param, atau getter setter 100 buah
     */


}
