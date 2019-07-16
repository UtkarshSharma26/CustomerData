package com.sample.demo.model;

import org.springframework.data.annotation.Id;


public class Customer {
    @Id
    private String Id;
        private String firstname;
        private String lastname;

    public Customer() {
    }

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String toString(){
        return ("Id = " + Id +"firstName = "+ firstname +"lastName = "+ lastname);
    }
}
