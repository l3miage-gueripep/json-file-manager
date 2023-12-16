package fr.uga.miage.m1;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.uga.miage.m1.model.ShapeData;


public class ShapeDataTest {

    @Test
    public void testId() {
        int id = 1;

        ShapeData shapeData = new ShapeData();
        shapeData.setId(id);

        assertEquals(id, shapeData.getId());
    }

    @Test
    public void testType() {
        String type = "circle";

        ShapeData shapeData = new ShapeData();
        shapeData.setType(type);

        assertEquals(type, shapeData.getType());
    }

    @Test
    public void testX() {
        int x = 10;

        ShapeData shapeData = new ShapeData();
        shapeData.setX(x);

        assertEquals(x, shapeData.getX());
    }

    @Test
    public void testY() {
        int y = 20;

        ShapeData shapeData = new ShapeData();
        shapeData.setY(y);

        assertEquals(y, shapeData.getY());
    }
}