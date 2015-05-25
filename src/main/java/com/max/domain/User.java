package com.max.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ilya on 06.03.2015.
 */
public class User implements Serializable {
    private int userid;
    private String firstName;
    private String lastName;
    private String email;
    private List<Address> addresses;
    private List<Long> accounts;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Long> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Long> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "User [userid=" + userid + ", firstName=" + firstName
                + ", lastName=" + lastName + ", email="
                + email +
                ", addresses' list size is = " + (addresses != null ? addresses.size() : "null") +
                " " + (addresses != null ? getAddressesString(addresses) : "") +"]" +
                ", accounts' list size is = " + (accounts != null ? accounts.size() : "null") +
                " " + (accounts != null ? getAccountString(accounts) : "") +"]";
    }

    private String getAccountString(List<Long> accounts) {
        StringBuilder sb = new StringBuilder("Accounts [");
        if (accounts != null) {
            for (Long account : accounts) {
                sb.append(String.valueOf(account))
                .append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private String getAddressesString(List <Address> addresses) {
        StringBuilder sb = new StringBuilder("Addresses [");
        if (accounts != null) {
            for (Address address : addresses) {
                sb.append(address.toString())
                        .append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
