package com.example.SpringBoot.dao;

import com.example.SpringBoot.model.Personnage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class PersonnageDaoImpl implements PersonnageDao<Personnage> {

    public static List<Personnage> ListAllPerso = new ArrayList<Personnage>();

    static {
        ListAllPerso.add(new Personnage(1, "Patrick", "Guerrier"));
        ListAllPerso.add(new Personnage(2, "Edouard", "Guerrier"));
        ListAllPerso.add(new Personnage(3, "ElChapo", "Sorcier"));
    }
    private int counter = 4;

    @Override
    public List<Personnage> findAll() {
        return ListAllPerso;
    }

    @Override
    public Personnage findById(int id) {

        Personnage personnageRet = null;

        for (Personnage personnage : ListAllPerso) {
            if (personnage.getId() == id) {
                personnageRet = personnage;
            }
        }
        return personnageRet;
    }

    @Override
    public Personnage save(Personnage personnage) {
        Personnage NewPersonnage = new Personnage(counter++, personnage.getName(), personnage.getPclass());
        ListAllPerso.add(NewPersonnage);
        return NewPersonnage;
    }

    @Override
    public Personnage update(int id, Personnage input) {

        Personnage PutPersonnage = findById(id);

        if (PutPersonnage != null) {
            PutPersonnage.setName(input.getName());
            PutPersonnage.setPclass(input.getPclass());
        }
        return PutPersonnage;
    }

    @Override
    public boolean delete(int id) {
        Boolean isDeleted = false;
        Personnage RemovePersonnage = findById(id);

        if (RemovePersonnage != null) {
            ListAllPerso.remove(RemovePersonnage);
            isDeleted = true;
        }
        return RemovePersonnage != null;
    }
}
