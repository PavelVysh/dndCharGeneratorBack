package com.example.dndCharCreator.entity.enums;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.util.StringUtils;

import java.io.IOException;

public class CharClassSerializer extends JsonSerializer<CharClass> {
    @Override
    public void serialize(CharClass charClass, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(StringUtils.capitalize(charClass.toString().toLowerCase()));
    }
}
