package fr.uga.miage.m1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import fr.uga.miage.m1.model.Export;

public class ImportTool {
    public static Export getExport(String filepath) throws FileNotFoundException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = new File(filepath);
            return objectMapper.readValue(file, Export.class);
        } catch (IOException e) {
            throw new FileNotFoundException("File not found");
        }
    }
}
