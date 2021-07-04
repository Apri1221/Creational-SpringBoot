package com.example.creational.prototype;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PrototypeApplication {
    /**
     *
     * terlalu banyak bean akan merasa bingung Springnya
     * oleh karena itu nama methodnya harus beda beda
     * dan karena itu nama beannya ikutan beda
     * nama bean = nama method
     *
     */

    @Bean
    @Scope("prototype")
    public Employee employeeStaff() {
        Employee employee = new Employee();
        // nilainya ini sudah tetap, jadi waktu create objek gak perlu inisiasikan 2 nilai ini
        // dan ini dicopy / dibuat baru
        // jadi seperti template/ boilerplate
        employee.setPosition(Position.STAFF);
        employee.setSalary(10_000_000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeManager() {
        Employee employee = new Employee();
        employee.setPosition(Position.MANAGER);
        employee.setSalary(20_000_000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeVicePresident() {
        Employee employee = new Employee();
        employee.setPosition(Position.VICE_PRESIDENT);
        employee.setSalary(30_000_000L);
        return employee;
    }


    @Bean
    @Scope("prototype")
    public Employee employeeCLevel() {
        Employee employee = new Employee();
        employee.setPosition(Position.C_LEVEL);
        employee.setSalary(40_000_000L);
        return employee;
    }
}
