package com.example.SpringBoot.dao;
import java.util.List;

public interface CharacterDao<T> {

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
