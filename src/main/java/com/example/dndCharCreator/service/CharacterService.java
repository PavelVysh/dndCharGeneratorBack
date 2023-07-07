package com.example.dndCharCreator.service;

import com.example.dndCharCreator.entity.Character;
import com.example.dndCharCreator.repository.CharacterRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepo repo;

    public void save(Character character) {
        repo.save(character);
    }

}
