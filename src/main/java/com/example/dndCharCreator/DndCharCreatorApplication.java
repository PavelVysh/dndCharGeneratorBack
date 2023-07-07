package com.example.dndCharCreator;

import com.example.dndCharCreator.entity.Character;
import com.example.dndCharCreator.repository.CharacterRepo;
import com.example.dndCharCreator.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DndCharCreatorApplication {


	public static void main(String[] args) {
		SpringApplication.run(DndCharCreatorApplication.class, args);

	}

}
