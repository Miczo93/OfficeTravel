package com.company;

public class DomesticTrip extends Trip {

    private float ownArrivalDiscount;

    public void setOwnArrivalDiscount(float ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    public DomesticTrip(Date start, Date end, String destination) {
        super(start, end, destination);
    }

    @Override
    public float getPrice() {
        return super.getPrice()-ownArrivalDiscount;
    }
}
