package com.example.dndCharCreator.entity.enums;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.util.StringUtils;

import java.io.IOException;

public class RaceSerializer extends JsonSerializer<Race> {
    @Override
    public void serialize(Race race, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

        jsonGenerator.writeString(StringUtils.capitalize(race.toString().replaceAll("_", "-").toLowerCase()));
    }
}
