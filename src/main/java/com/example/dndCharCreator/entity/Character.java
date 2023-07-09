package com.example.dndCharCreator.entity;


import com.example.dndCharCreator.entity.enums.Alignment;
import com.example.dndCharCreator.entity.enums.CharClass;
import com.example.dndCharCreator.entity.enums.Race;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("chars")
public class Character {

    private String name;
    private Integer level;
    private Race race;
    private CharClass charClass;
    private Alignment alignment;
    private String background;
    private List<String> equipment;

}
