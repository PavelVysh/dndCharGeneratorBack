package com.example.dndCharCreator.entity;


import com.example.dndCharCreator.entity.enums.CharClass;
import com.example.dndCharCreator.entity.enums.Race;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("chars")
public class Character {

    private String name;
    private Integer level;
    private Race race;
    private CharClass charClass;

}
