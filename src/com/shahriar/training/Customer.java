package com.shahriar.training;

public class Customer {
    private IAddress address;

    public Customer(IAddress address) { // Constructor (Dependency Injection)
        this.address = address;
    }

    public IAddress getAddress() {
        return this.address;
    }
}

