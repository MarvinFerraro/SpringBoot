/*package com.example.SpringBoot.web.controller;

import com.example.SpringBoot.dao.CharacterDao;
import com.example.SpringBoot.model.Character;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api( description="CRUD for all CharacterController")
@Controller
@RequestMapping(path = "")

public class CharacterController_old {

    @Autowired
    private CharacterDao<Character> ICharacterDao;

    private final String BASE_URL = "/personnages";

    @ApiOperation(value = "Get list of all Character")
    @GetMapping(value = BASE_URL)
    public ResponseEntity<List<Character>> DisplayCharacter() {
        return new ResponseEntity<>(ICharacterDao.findAll(), HttpStatus.OK);
    }

    @ApiOperation(value = "Get Character by id")
    @GetMapping(value = BASE_URL + "/{id}")
    public ResponseEntity<Character> DisplayById(@PathVariable("id") int id) {

        Character response = ICharacterDao.findById(id);

        if( response != null) {
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation(value = "Add new Character")
    @PostMapping(value = BASE_URL)
    public ResponseEntity<Character> CreateCharacter(@RequestBody Character characterInput) {
        return new ResponseEntity<>(ICharacterDao.save(characterInput), HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a Character")
    @DeleteMapping(value = BASE_URL + "/{id}")
    public ResponseEntity<Void> Delete(@PathVariable int id) {
        Boolean CharacterDelete = ICharacterDao.delete(id);

        if(CharacterDelete) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation(value = "Update a Character")
    @PutMapping(value = BASE_URL + "/{id}")
    public ResponseEntity<Character> Udpate(@PathVariable int id, @RequestBody Character characterInput) {

        Character response = ICharacterDao.findById(id);

        if( response != null) {
            response = ICharacterDao.update(id, characterInput);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
};

*/
