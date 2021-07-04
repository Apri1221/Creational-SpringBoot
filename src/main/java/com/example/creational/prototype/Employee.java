package com.example.creational.prototype;


/**
 * biasanya kita akan bikin new Employee utk objek baru (karyawan baru)
 * posisi manager
 * set salary, dst...
 *
 * misal di kasus kita posisi dan salary selalu sama -> maka kita pakai prototype pattern
 * ada prototype untuk tiap tiap posisi -> tentukan salarynya (krn data selalu sama)
 *
 * @Bean defaultnya singleton, tp kalau mau diubah jadi prototype tinggal ditambah @Scope("prototype")
 * Dia akan buat bean baru, copy. Bukan sama objectnya
 */
public class Employee {
    
    private String id;

    private String name;

    private Position position;

    private Long salary;

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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
