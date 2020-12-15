package com.example.SpringBoot.web.controller;

import com.example.SpringBoot.model.Character;
import com.example.SpringBoot.model.CharacterRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping(path = "/characters")

public class CharacterController {

    @Autowired
    private CharacterRepository ICharacterRepo;

    @GetMapping
    public Iterable<Character> getAllCharacters() {
        return ICharacterRepo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Character> getCharacterById(@PathVariable int id) {
        return ICharacterRepo.findById(id);
    }

    @PostMapping
    public void createCharacter(@RequestBody Character character) {
        ICharacterRepo.save(character);
    }

    @PutMapping(value = "/{id}")
    public void updatePerson(@PathVariable int id, @RequestBody Character character) {

        Optional<Character> test = ICharacterRepo.findById(id);
        test.get().setName(character.getName());
        test.get().setType(character.getType());
        ICharacterRepo.save(test.get());
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCharacter(@PathVariable int id) {
        ICharacterRepo.deleteById(id);
    }

}


