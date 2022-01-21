package com.example.Recruiting_Office.model.Entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String subject;
    private String description;


    @ManyToOne
    @JoinColumn(name = "user_ID" ,referencedColumnName = "id")
    private User user;

//    @OneToOne//(cascade = CascadeType.ALL)
//    @JoinColumn(name ="services_id" )
//    private Services services;
@ManyToOne
@JoinColumn(name ="services_id",referencedColumnName = "id")
private Services services;

    public Feedback() {
    }


    public Feedback(String subject, String description, User user, Services services) {
        this.subject = subject;
        this.description = description;
        this.user = user;
        this.services = services;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
