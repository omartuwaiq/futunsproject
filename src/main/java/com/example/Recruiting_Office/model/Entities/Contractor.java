package com.example.Recruiting_Office.model.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Contractor {
    @Id
    private int id ;
    private String name;
    private int phone;
    private String Address;
    private String Nationality;
    private String category;
    @OneToMany(mappedBy = "contractor")
    @JsonIgnore
    private List<Services> items = new ArrayList<>();

    public Contractor(int id, String name, int phone, String address, String nationality, String category, List<Services> items) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        Address = address;
        Nationality = nationality;
        this.category = category;
        this.items = items;
    }

    public Contractor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Services> getItems() {
        return items;
    }

    public void setItems(List<Services> items) {
        this.items = items;
    }
}
