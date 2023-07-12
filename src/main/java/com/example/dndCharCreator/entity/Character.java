package com.example.dndCharCreator.entity;


import com.example.dndCharCreator.entity.enums.Alignment;
import com.example.dndCharCreator.entity.enums.CharClass;
import com.example.dndCharCreator.entity.enums.Race;
import com.example.dndCharCreator.entity.parts.SavingThrows;
import com.example.dndCharCreator.entity.parts.Skills;
import com.example.dndCharCreator.entity.parts.Stats;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("chars")
public class Character {
    @Id
    private String name;
    private Integer level;
    private Race race;
    private CharClass charClass;
    private Alignment alignment;
    private String background;
    private String playerName;
    private Integer experience;
    private Stats stats;
    private SavingThrows savingThrows;
    private String proficiency;
    private String inspiration;
    private Skills skills;
    private Integer passiveWisdom;
    private List<String> languages;

}
