package com.example.SpringBoot.dao;

import com.example.SpringBoot.model.Personnage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonnageDaoImpl implements PersonnageDao{

    public static List<Personnage> ListAllPerso = new ArrayList<Personnage>();
    static {
        ListAllPerso.add(new Personnage(1, "Patrick","Guerrier"));
        ListAllPerso.add(new Personnage(2, "Edouard","Guerrier"));
        ListAllPerso.add(new Personnage(3, "ElChapo","Sorcier"));
    }

    @Override
    public List<Personnage> FindAll() {
      return ListAllPerso;
    }

    @Override
    public  Personnage PersonnageFindById(int id) {

        for(Personnage personnage : ListAllPerso) {
            if(personnage.getId() == id) {
                return personnage;
            }
        }
        return null;
    }

    @Override
    public Personnage PersonnageSave(Personnage personnage) {
        ListAllPerso.add(personnage);
        return personnage;
    }

}
