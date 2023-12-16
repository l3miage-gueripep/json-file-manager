package fr.uga.miage.m1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.json.JsonArray;
import javax.json.JsonObject;
import java.util.Arrays;
import fr.uga.miage.m1.model.ShapeData;

public class ExportToolTest {

    @Test
    public void testCreateJsonShapesArray() {
        ExportTool exportTool = new ExportTool();

        ShapeData shape1 = new ShapeData();
        shape1.setId(1);
        shape1.setType("circle");
        shape1.setX(10);
        shape1.setY(20);

        ShapeData shape2 = new ShapeData();
        shape2.setId(2);
        shape2.setType("square");
        shape2.setX(30);
        shape2.setY(40);

        JsonArray jsonArray = exportTool.createJsonShapesArray(Arrays.asList(shape1, shape2)).build();

        JsonObject shape1Json = jsonArray.getJsonObject(0);
        assertEquals(1, shape1Json.getInt("id"));
        assertEquals("circle", shape1Json.getString("type"));
        assertEquals(10, shape1Json.getInt("x"));
        assertEquals(20, shape1Json.getInt("y"));

        JsonObject shape2Json = jsonArray.getJsonObject(1);
        assertEquals(2, shape2Json.getInt("id"));
        assertEquals("square", shape2Json.getString("type"));
        assertEquals(30, shape2Json.getInt("x"));
        assertEquals(40, shape2Json.getInt("y"));
    }
}