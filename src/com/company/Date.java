package com.company;

public class Date
{
    private int day, month, year;

    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.year + " " + this.month+ " "+ this.day;
    }
}
