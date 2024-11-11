package com.shahriar.training;
public class HomeAddress extends EditableAddress {

    private String homeAddress;

    public HomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String getAddressInfo() {
        return "Home Address: " + homeAddress;
    }

    @Override
    public void setAddressInfo(String address) {
        this.homeAddress = address;
    }
}

