package com.company;

public class Trip {
    private Date start, end;
    private String destination;
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Trip(Date start, Date end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }

    @Override
    public String toString() {
        {
            return String.format("Podróż do %s\nStart: %s\nKoniec: %s\nCena: %.2f",this.destination, this.start.toString(), this.end.toString(),getPrice());
        }
    }
}
