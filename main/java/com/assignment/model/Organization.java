package com.assignment.model;



public class Organization {

    private String name;

    private String address;

    private String town;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town == null? "N/a" :town.toUpperCase();
    }

    public void setTown(String town) {
        this.town = town;
    }
}


