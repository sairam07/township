package com.vesa.township.township.pojos;

public class Address {
    public String Street;
    public City cityName;
    public State staeName;
    public Country countryName;
    public String zipCode;

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public City getCityName() {
        return cityName;
    }

    public void setCityName(City cityName) {
        this.cityName = cityName;
    }

    public State getStaeName() {
        return staeName;
    }

    public void setStaeName(State staeName) {
        this.staeName = staeName;
    }

    public Country getCountryName() {
        return countryName;
    }

    public void setCountryName(Country countryName) {
        this.countryName = countryName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
