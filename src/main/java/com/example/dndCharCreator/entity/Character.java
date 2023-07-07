package com.example.dndCharCreator.entity;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("dndChars")
@Data
public class Character {
    
    private String name;
}
