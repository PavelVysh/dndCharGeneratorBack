package com.example.dndCharCreator.entity.enums;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class CharClassDeserializer extends JsonDeserializer<CharClass>{
    @Override
    public CharClass deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String charClass = jsonParser.getText();
        return CharClass.fromString(charClass);
    }

}
