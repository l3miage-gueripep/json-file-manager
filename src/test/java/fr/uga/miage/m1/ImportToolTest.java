package fr.uga.miage.m1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import fr.uga.miage.m1.model.Export;

public class ImportToolTest {

    @Test
    public void testGetExport() {
        String filepath = "export/export.json";
        try {
            Export export = ImportTool.getExport(filepath);
            assertNotNull(export, "Export object should not be null");
            // Add more assertions here to check the properties of the Export object
        } catch (FileNotFoundException e) {
            fail("File should be found");
        }
    }

    @Test
    public void testGetExportFileNotFound() {
        String filepath = "path/to/non/existent/file.json";
        assertThrows(FileNotFoundException.class, () -> {
            ImportTool.getExport(filepath);
        });
    }
}