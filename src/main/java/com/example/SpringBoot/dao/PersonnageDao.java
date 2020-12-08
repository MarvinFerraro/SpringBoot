package com.example.SpringBoot.dao;
import java.util.List;

import com.example.SpringBoot.model.Personnage;

public interface PersonnageDao {

    List<Personnage> FindAll();

    Personnage PersonnageFindById(int id);

    Personnage PersonnageSave(Personnage personnage);
}
