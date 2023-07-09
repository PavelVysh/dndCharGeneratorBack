package com.example.dndCharCreator.entity.enums;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = AlignmentDeserializer.class)
public enum Alignment {
    LAWFUL_GOOD,
    NEUTRAL_GOOD,
    CHAOTIC_GOOD,
    LAWFUL_NEUTRAL,
    NEUTRAL,
    CHAOTIC_NEUTRAL,
    LAWFUL_EVIL,
    NEUTRAL_EVIL,
    CHAOTIC_EVIL,
    EMPTY;

    public static Alignment fromString(String raceString) {
        if (raceString == null || raceString.isEmpty()) {
            return EMPTY;
        }
        return Alignment.valueOf(raceString.toUpperCase());
    }
}
