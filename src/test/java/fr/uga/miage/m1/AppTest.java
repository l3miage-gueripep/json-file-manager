package fr.uga.miage.m1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AppTest {

    @Test
    public void testMain() {
        String[] args = {};
        App.main(args);

        // Check that the export file was created
        File exportFile = new File("export/export.json");
        assertTrue(exportFile.exists(), "Export file should exist");

        // Check that the export file is not empty
        long fileSize = 0;
        try {
            fileSize = Files.size(Paths.get("export/export.json"));
        } catch (IOException e) {
            fail("Failed to get the size of the export file");
        }
        assertTrue(fileSize > 0, "Export file should not be empty");
    }
}