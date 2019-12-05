package com.company;

public class Test {
    public static void main(String[] args) {

        TravelOffice newOffice = new TravelOffice();
        /*
        newOffice.AddCustomer("Duprim", new Trip(new Date(19,11,2019),new Date(19,12,2019),"Brooklyn"), new Address("Gangsta","89-969","Metropolice"));
        newOffice.AddCustomer("Larry", new Trip(new Date(19,7,2019),new Date(125,12,2019),"Norwegia"), new Address("Norweska","66-661","Metropolice"));
        newOffice.AddCustomer("Duprim", new Trip(new Date(9,12,2019),new Date(29,12,2019),"Metropolice"), new Address("Gangsta","99-999","Siłownice"));
        System.out.println(String.format("Ilosc klientow: %d",newOffice.getCustomerCount()));
        System.out.println(newOffice.toString());
        */

        newOffice.AddCustomer("Duprim", new AbroadTrip(new Date(19,11,2019),new Date(19,12,2019),"Brooklyn"), new Address("Gangsta","89-969","Metropolice"));
        newOffice.AddCustomer("Larry", new DomesticTrip(new Date(19,7,2019),new Date(125,12,2019),"Norwegia"), new Address("Norweska","66-661","Metropolice"));
        newOffice.AddCustomer("Crowbar Gary", new Trip(new Date(9,12,2019),new Date(29,12,2019),"Metropolice"), new Address("Gangsta","99-999","Siłownice"));

        newOffice.customers[0].getTrip().setPrice(5000);
        newOffice.customers[1].getTrip().setPrice(5000);
        newOffice.customers[2].getTrip().setPrice(5000);

        for (Customer c : newOffice.customers)
        {
            System.out.println("\n");
            if (c.getTrip() instanceof  AbroadTrip)
            {
                ((AbroadTrip)  c.getTrip()).setInsurance(200);
            }else if(c.getTrip() instanceof  DomesticTrip)
            {
                ((DomesticTrip)  c.getTrip()).setOwnArrivalDiscount(50);
            }
            System.out.println(String.format(c.getTrip().toString()));
        }
        /*
        Address address1= new Address("Mokrax","95-200","Pabianice");
        Customer customer1 = new Customer("Stefan");
        Trip trip1 = new Trip(new Date(2019,11,20),new Date(2019,12,20),"Tokyo");
        customer1.setAddress(address1);
        customer1.assignTrip(trip1);
        System.out.println(customer1.getInfo());
 */
    }
}
