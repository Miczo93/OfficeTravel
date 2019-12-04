package com.company;

public class Address
{
    String street,zip,city;

    public Address(String street, String zip, String city) {
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    String getInfo()
    {
        return String.format("Ulica: %s\nKod pocztowy: %s\nMiasto: %s",this.street,this.zip,this.city);
    }
}
