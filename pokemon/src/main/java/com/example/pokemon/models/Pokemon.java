package com.example.pokemon.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;



@EntityScan
public class Pokemon {
    
   
    @ID
    @GeneratedValue
    private Long id;

    private String name;
    private String imageUrl;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
