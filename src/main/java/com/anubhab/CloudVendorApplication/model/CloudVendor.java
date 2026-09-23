package com.anubhab.CloudVendorApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name=" cloud_vendor_info")
public class CloudVendor {
    @Id
    private String id;
    private String name;
    private String address;
    private String phonenumber;

    public CloudVendor() {
    }

    public CloudVendor(String phonenumber, String address, String name, String id) {
        this.phonenumber = phonenumber;
        this.address = address;
        this.name = name;
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
