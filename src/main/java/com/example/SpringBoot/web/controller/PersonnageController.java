package com.example.SpringBoot.web.controller;

import com.example.SpringBoot.dao.PersonnageDao;
import com.example.SpringBoot.model.Personnage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api( description="API pour les CRUD des personnages")
@RestController

public class PersonnageController {

    @Autowired
    private PersonnageDao<Personnage> IPersonnageDao;

    private final String BASE_URL = "/personnages";

    @ApiOperation(value = "Get list of all personnage")
    @GetMapping(value = BASE_URL)
    public ResponseEntity<List<Personnage>> DisplayPersonnage() {
        return new ResponseEntity<>(IPersonnageDao.findAll(), HttpStatus.OK);
    }

    //Récupérer un Personnage par son Id
    @GetMapping(value = BASE_URL + "/{id}")
    public ResponseEntity<Personnage> DisplayById(@PathVariable("id") int id) {

        Personnage response = IPersonnageDao.findById(id);

        if( response != null) {
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = BASE_URL)
    public ResponseEntity<Personnage> CreatePersonnage(@RequestBody Personnage input) {
        return new ResponseEntity<>(IPersonnageDao.save(input), HttpStatus.OK);
    }

    @DeleteMapping(value = BASE_URL + "/{id}")
    public ResponseEntity<Void> Delete(@PathVariable int id) {
        Boolean PersonnageDelete = IPersonnageDao.delete(id);

        if(PersonnageDelete) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping(value = BASE_URL + "/{id}")
    public ResponseEntity<Personnage> Udpate(@PathVariable int id, @RequestBody Personnage input) {

        Personnage response = IPersonnageDao.findById(id);

        if( response != null) {
            response = IPersonnageDao.update(id, input);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
};


