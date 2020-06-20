package com.cambalache.entryservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String entryTitle;
    private String entryDescription;
    private ArrayList<String> entryWants;
    private ArrayList<Category> entryCategories;
    // Faltan Imagenes, Owner y Localizaciones.

    protected Entry() {}

    public Entry(String entryTitle, String entryDescription, ArrayList<String> entryWants, ArrayList<Category> entryCategories){
        this.entryTitle = entryTitle;
        this.entryDescription = entryDescription;
        this.entryWants = entryWants;
        this.entryCategories = entryCategories;
    }

    public Long getId(){
        return id;
    }

    public String getEntryTitle(){
        return entryTitle;
    }

    public String getEntryDescription(){
        return entryDescription;
    }

    public ArrayList<String> getEntryWants(){
        return entryWants;
    }
    public ArrayList<Category> getEntryCategories(){
        return entryCategories;
    }
}
