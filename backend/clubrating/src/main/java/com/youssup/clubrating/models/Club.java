package com.youssup.clubrating.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//club model
@Document(collection = "clubs")
public class Club {
    @Id
    private int id;
    private String name;
    private String description;
    private double rating;

    // club constructors
    public Club(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rating = (Double) null;
    }

    public Club() {
        this.id = -1;
        this.name = null;
        this.description = null;
        this.rating = (Double) null;
    }

    //getter and setter methods
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}