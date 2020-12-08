package com.example.SpringBoot.model;

public class Personnage {

    public int Id;
    public String Name;
    public String Pclass;

    public Personnage(int id, String name, String pClass) {
        Id = id;
        Name = name;
        Pclass = pClass;
    }

    public String ToString() {
        return "id :" + Id + ", class :"+ Pclass + ", name :"+ Name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPclass() {
        return Pclass;
    }

    public void setPclass(String pClass) {
        Pclass = pClass;
    }


}
