package com.example.SpringBoot.model;

public class Character {

    public int id;
    public String name;
    public String type;

    public Character() {

    }

    public Character(int id, String name, String pClass) {
        this.id = id;
        this.name = name;
        this.type = pClass;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
