package com.example.SpringBoot.model;

import java.util.UUID;

public class Personnage {

    public int id;
    public String name;
    public String pclass;

    public Personnage(int id, String name, String pClass) {
        this.id = id;
        this.name = name;
        this.pclass = pClass;
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

    public String getPclass() {
        return pclass;
    }

    public void setPclass(String pclass) {
        this.pclass = pclass;
    }
}
