package com.shahriar.training;
public class Driver {
    public static void main(String[] args) {

        IAddress homeAddress = new HomeAddress("123 Main St, Springfield");

        Customer customer = new Customer(homeAddress);
        customer.getAddress();
        System.out.println(customer.getAddress().getAddressInfo());
    }
}

