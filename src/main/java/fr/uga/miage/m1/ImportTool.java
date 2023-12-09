package fr.uga.miage.m1;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ImportTool {
    public static Export getExport(String filepath){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = new File(filepath);
            return objectMapper.readValue(file, Export.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
