package com.example.Recruiting_Office.model.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String name;
    private String password;
    private String email;
    private String city;
    private int phone;


    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Feedback> items = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Services> items1 = new ArrayList<>();

    public User(String name, String password, String email, String city, int phone, List<Feedback> items, List<Services> items1) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.city = city;
        this.phone = phone;
        this.items = items;
        this.items1 = items1;
    }

    public User() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public List<Feedback> getItems() {
        return items;
    }

    public void setItems(List<Feedback> items) {
        this.items = items;
    }

    public List<Services> getItems1() {
        return items1;
    }

    public void setItems1(List<Services> items1) {
        this.items1 = items1;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", phone=" + phone +
                ", items=" + items +
                ", items1=" + items1 +
                '}';
    }
}