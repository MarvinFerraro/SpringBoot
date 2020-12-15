/*package com.example.SpringBoot.dao;

import com.example.SpringBoot.model.Character;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CharacterDaoImpl implements CharacterDao<Character> {

    public static List<Character> ListAllPerso = new ArrayList<Character>();

    static {
        ListAllPerso.add(new Character(1, "Patrick", "Guerrier"));
        ListAllPerso.add(new Character(2, "Edouard", "Guerrier"));
        ListAllPerso.add(new Character(3, "ElChapo", "Sorcier"));
    }
    private int counter = 4;

    @Override
    public List<Character> findAll() {
        return ListAllPerso;
    }

    @Override
    public Character findById(int id) {

        Character characterRet = null;

        for (Character character : ListAllPerso) {
            if (character.getId() == id) {
                characterRet = character;
            }
        }
        return characterRet;
    }

    @Override
    public Character save(Character character) {
        Character newCharacter = new Character(counter++, character.getName(), character.getType());
        ListAllPerso.add(newCharacter);
        return newCharacter;
    }

    @Override
    public Character update(int id, Character input) {

        Character putCharacter = findById(id);

        if (putCharacter != null) {
            putCharacter.setName(input.getName());
            putCharacter.setType(input.getType());
        }
        return putCharacter;
    }

    @Override
    public boolean delete(int id) {
        Boolean isDeleted = false;
        Character removeCharacter = findById(id);

        if (removeCharacter != null) {
            ListAllPerso.remove(removeCharacter);
            isDeleted = true;
        }
        return removeCharacter != null;
    }
}
*/