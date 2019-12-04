package com.company;

import java.util.Arrays;

public class TravelOffice {
    static int Count = 0;
    Customer customers[] = new Customer[2];

    public static void main(String[] args) {

        TravelOffice newOffice = new TravelOffice();
        newOffice.AddCustomer("Duprim", new Trip(new Date(19,11,2019),new Date(19,12,2019),"Brooklyn"), new Address("Gangsta","89-969","Metropolice"));
        newOffice.AddCustomer("Larry", new Trip(new Date(19,7,2019),new Date(125,12,2019),"Norwegia"), new Address("Norweska","66-661","Metropolice"));
        newOffice.AddCustomer("Duprim", new Trip(new Date(9,12,2019),new Date(29,12,2019),"Metropolice"), new Address("Gangsta","99-999","Siłownice"));
        System.out.println(String.format("Ilosc klientow: %d",newOffice.getCustomerCount()));
        System.out.println(newOffice.getInfo());

/*
        Address address1= new Address("Mokrax","95-200","Pabianice");
        Customer customer1 = new Customer("Stefan");
        Trip trip1 = new Trip(new Date(2019,11,20),new Date(2019,12,20),"Tokyo");
        customer1.setAddress(address1);
        customer1.assignTrip(trip1);
        System.out.println(customer1.getInfo());
 */
    }

    public void AddCustomer(String name, Trip trip, Address adress) {
        Count++;
        if (customers.length < Count)
            customers = Arrays.copyOf(customers, customers.length + 1);
        customers[Count - 1] = new Customer(name);
        customers[Count - 1].assignTrip(trip);
        customers[Count - 1].setAddress(adress);
    }

    public int getCustomerCount() {
        return Count;
    }

    public String getInfo() {
        StringBuilder allInfo = new StringBuilder();
        for (Customer c : customers) {
            allInfo.append(c.getInfo()+"\n");
    }
        return allInfo.toString();
    }


}
