package com.company;

public class AbroadTrip extends Trip{

    private float insurance;

    public void setInsurance(float insurance) {
        this.insurance = insurance;
    }

    public AbroadTrip(Date start, Date end, String destination) {
        super(start, end, destination);
    }

    @Override
    public float getPrice() {
        return super.getPrice()+insurance;
    }


}
