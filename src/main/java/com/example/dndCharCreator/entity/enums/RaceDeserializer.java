package com.example.dndCharCreator.entity.enums;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class RaceDeserializer extends JsonDeserializer<Race> {
    @Override
    public Race deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String raceString = jsonParser.getText();
        return Race.fromString(raceString.replaceAll("-", "_"));
    }
}
