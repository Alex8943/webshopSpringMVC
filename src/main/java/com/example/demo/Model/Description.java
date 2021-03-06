package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "Descriptions")
public class Description {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String description;

    public Description(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Description(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
