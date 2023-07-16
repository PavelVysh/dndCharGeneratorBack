package com.example.dndCharCreator.controller;

import com.example.dndCharCreator.entity.Character;
import com.example.dndCharCreator.repository.CharacterRepo;
import com.example.dndCharCreator.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/character")
@CrossOrigin(origins = "*")
public class CharacterController {

    private final CharacterService characterService;
    private final Logger logger = LoggerFactory.getLogger(CharacterController.class);

    @PostMapping
    public void save(@RequestBody Character character) {

        characterService.save(character);

        logger.debug("{} saved", character);
    }
    
    @GetMapping("/{id}")
    public Character getById(@PathVariable String id) {
        return characterService.findById(id);
    }
    @GetMapping
    public ResponseEntity<Page<Character>> getAll(Pageable pageable) {

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Access-Control-Allow-Origin", "*");
        responseHeaders.set("Access-Control-Allow-Methods", "*");
        responseHeaders.set("Access-Control-Allow-Headers", "*");
        responseHeaders.set("Access-Control-Expose-Headers", "*");
        responseHeaders.set("Access-Control-Allow-Credentials", "true");

        return ResponseEntity.ok()
                .headers(responseHeaders)
                .body(characterService.getAll(pageable));

    }
}
