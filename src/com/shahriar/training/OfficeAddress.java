package com.shahriar.training;

public class OfficeAddress implements IAddress{
    private String officeAddress;

    public OfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    @Override
    public String getAddressInfo() {
        return officeAddress;
    }
}
