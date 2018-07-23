package com.example.getdevicelocation.Model;

public class User {
    private String Name;
    private String Phone;
    private String Product;
    private String Quantity;
    private String Location;


    public User() {
    }

    public User(  String name, String phone, String product, String quantity, String location) {
        Name = name;
        Phone = phone;
        Product = product;
        Quantity = quantity;
        Location = location;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
