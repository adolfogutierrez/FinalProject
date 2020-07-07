package com.walmart.utils;

public class Producto {
    String name;
    String brand;
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public Producto(String name, String brand, double price)
    {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

}
