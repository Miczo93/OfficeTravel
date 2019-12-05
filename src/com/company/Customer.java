package com.company;

public class Customer {
    private String name;
    private Address address;
    private Trip trip;

    public Trip getTrip() {
        return trip;
    }




    public Customer(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void assignTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public String toString() {
        return String.format("Imie: %s\nDane adresowe:\n%s\nDane wycieczkowe: %s", this.name, this.address.toString(), this.trip.toString());
    }
}
