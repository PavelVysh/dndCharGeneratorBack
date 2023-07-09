package com.example.dndCharCreator.entity.enums;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class AlignmentDeserializer extends JsonDeserializer<Alignment> {
    @Override
    public Alignment deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String alignment = jsonParser.getText();
        return Alignment.fromString(alignment.replaceAll(" ", "_"));
    }
}
