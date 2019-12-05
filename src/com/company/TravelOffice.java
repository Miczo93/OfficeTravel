package com.company;

import java.util.Arrays;

public class TravelOffice {
    static int Count = 0;
    Customer customers[] = new Customer[2];

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

    @Override
    public String toString() {
        {
            StringBuilder allInfo = new StringBuilder();
            for (Customer c : customers) {
                allInfo.append(c.toString() + "\n");
            }
            return allInfo.toString();
        }
    }
}
