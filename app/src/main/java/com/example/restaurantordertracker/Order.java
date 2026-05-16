package com.example.restaurantordertracker;

public class Order {

    String customerName;
    String restaurantName;
    String status;

    public Order(String customerName, String restaurantName, String status){
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.status = status;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getRestaurantName(){
        return restaurantName;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
