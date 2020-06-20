package com.cambalache.imageservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String imageUrl;

    protected Image(){}

    public Image(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getId(){
        return id;
    }

    public String getUrl(){
        return imageUrl;
    }
}
