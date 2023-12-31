package com.example.dndCharCreator.entity.enums;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonDeserialize(using = RaceDeserializer.class)
@JsonSerialize(using = RaceSerializer.class)
public enum Race {
    ELF,
    GNOME,
    DRAGONBORN,
    DWARF,
    HALF_ELF,
    HUMAN,
    HALF_ORC,
    HALFLING,
    TIEFLING,
    EMPTY;


    public static Race fromString(String raceString) {
        if (raceString == null || raceString.isEmpty()) {
            return EMPTY;
        }
        return Race.valueOf(raceString.toUpperCase());
    }
}
