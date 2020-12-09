package com.example.SpringBoot.dao;
import java.util.List;
import java.util.UUID;

import com.example.SpringBoot.model.Personnage;

public interface PersonnageDao<T> {

    //GET
    List<T> findAll();

    //GETBYID
    T findById(int id);

    //POST
    T save(T personnage);

    //PUT
    T update(int id,T input);

    //DELETE
    boolean delete(int id);
}
