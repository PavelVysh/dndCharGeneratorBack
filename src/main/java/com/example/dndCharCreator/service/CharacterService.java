package com.example.dndCharCreator.service;

import com.example.dndCharCreator.entity.Character;
import com.example.dndCharCreator.repository.CharacterRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepo repo;

    public void save(Character character) {
        repo.save(character);
    }

    public Character findById(String id) {
        return repo.findById(id).get();
    }

    public Page<Character> getAll(Pageable pageable) {
        return repo.findAll(pageable);
    }
}
