package com.example.dndCharCreator.repository;

import com.example.dndCharCreator.entity.Character;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterRepo extends MongoRepository<Character, String> {
}
