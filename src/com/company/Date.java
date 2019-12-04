package com.company;

public class Date
{
    int day, month, year;

    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getInfo()
    {
        return this.year + " " + this.month+ " "+ this.day;
    }
}
