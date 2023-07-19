package com.example.dndCharCreator.repository;

import com.example.dndCharCreator.entity.Character;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterRepo extends MongoRepository<Character, String> {
    Page<Character> findAllByNameLikeIgnoreCase(String name, Pageable pageable);
}
