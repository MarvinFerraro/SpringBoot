package com.example.SpringBoot.model;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CharacterRepository extends CrudRepository<Character, Integer> {

    Iterable<Character> findAll();

    Optional<Character> findById(Integer integer);

    <S extends Character> S save(S s);

    void deleteById(Integer integer);
}
