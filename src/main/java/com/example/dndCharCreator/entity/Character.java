package com.example.dndCharCreator.entity;


import com.example.dndCharCreator.entity.enums.Alignment;
import com.example.dndCharCreator.entity.enums.CharClass;
import com.example.dndCharCreator.entity.enums.Race;
import com.example.dndCharCreator.entity.parts.*;
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
    private Integer armorClass;
    private Integer maxHp;
    private Integer currentHp;
    private Integer tempHp;
    private Integer totalHitDice;
    private DeathSaves deathSaveSuccesses;
    private DeathSaves deathSaveFailures;
    private List<Weapon> weapons;
    private List<String> equipment;
    private Integer copper;
    private Integer silver;
    private Integer gold;
    private Integer platinum;
    private List<String> traits;
    private List<String> ideals;
    private List<String> flaws;
    private List<String> bonds;
    private List<String> features;
}
