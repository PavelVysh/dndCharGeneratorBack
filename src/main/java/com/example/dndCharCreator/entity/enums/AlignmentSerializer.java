package com.example.dndCharCreator.entity.enums;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.util.StringUtils;

import java.io.IOException;

public class AlignmentSerializer extends JsonSerializer<Alignment> {
    @Override
    public void serialize(Alignment alignment, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(StringUtils.capitalize(alignment.toString().toLowerCase().replaceAll("_", " ")));
    }
}
