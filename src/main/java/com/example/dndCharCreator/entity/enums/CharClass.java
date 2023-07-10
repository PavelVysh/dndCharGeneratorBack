package com.example.dndCharCreator.entity.enums;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonDeserialize(using = CharClassDeserializer.class)
@JsonSerialize(using = CharClassSerializer.class)
public enum CharClass {
    BARBARIAN,
    BARD,
    CLERIC,
    DRUID,
    FIGHTER,
    MONK,
    PALADIN,
    RANGER,
    ROGUE,
    SORCERER,
    WARLOCK,
    WIZARD,
    EMPTY;


    public static CharClass fromString(String raceString) {
        if (raceString == null || raceString.isEmpty()) {
            return EMPTY;
        }
        return CharClass.valueOf(raceString.toUpperCase());
    }
}
