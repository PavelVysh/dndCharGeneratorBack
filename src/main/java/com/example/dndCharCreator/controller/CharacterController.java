package com.example.dndCharCreator.controller;

import com.example.dndCharCreator.entity.Character;
import com.example.dndCharCreator.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping("/{name}")
    public void save(@PathVariable String name) {
        Character character = new Character();
        character.setName(name);
        characterService.save(character);
    }
}
