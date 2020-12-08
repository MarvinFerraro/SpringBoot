package com.example.SpringBoot.web.controller;

import com.example.SpringBoot.dao.PersonnageDao;
import com.example.SpringBoot.model.Personnage;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController

public class PersonnageController {

    @Autowired
    private PersonnageDao IPersonnageDao;


    @RequestMapping(value = "/personnages", method = RequestMethod.GET)

    public List<Personnage> PersonnageList() {

        return IPersonnageDao.FindAll();

    }


    //Récupérer un Personnage par son Id

    @GetMapping(value = "/personnages/{id}")

    public Personnage DisplayPersonnage(@PathVariable int id) {

        return IPersonnageDao.PersonnageFindById(id);
    };

};


