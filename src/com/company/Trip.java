package com.company;

public class Trip
{
    Date start, end;
    String destination;

    public Trip(Date start, Date end, String destination)
    {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }

    String getInfo()
    {
        return String.format("Start: %s\nKoniec: %s",this.start.getInfo(),this.end.getInfo());
    }
}
