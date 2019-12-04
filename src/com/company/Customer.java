package com.company;

public class Customer {
    String name;
    Address address;
    Trip trip;


    public Customer(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void assignTrip(Trip trip) {
        this.trip = trip;
    }

    String getInfo() {
        return String.format("Imie: %s\nDane adresowe:\n%s\nDane wycieczkowe: %s", this.name, this.address.getInfo(), this.trip.getInfo());
    }
}
