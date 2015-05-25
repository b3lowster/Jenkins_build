package com.max.domain;

/**
 * @author tsv@ciklum.com
 */
public class Address {

    private String street;
    private String apt;
    private Type type;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApt() {
        return apt;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", apt='" + apt + '\'' +
                ", type=" + type +
                '}';
    }
}
