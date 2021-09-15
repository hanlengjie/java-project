package com.zj.entity;

import java.util.Date;

public class Emp {
    private Integer id;
    private String name;
    private int age;
    private Date bir;
    private String address;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bir=" + bir +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Emp() {
    }

    public Emp(Integer id, String name, int age, Date bir, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bir = bir;
        this.address = address;
    }
}
