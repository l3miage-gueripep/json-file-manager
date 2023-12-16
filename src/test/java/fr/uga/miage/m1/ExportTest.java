package fr.uga.miage.m1;

import fr.uga.miage.m1.model.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ExportTest {

    @Test
    public void testShapes() {
        ShapeData shape1 = new ShapeData();
        ShapeData shape2 = new ShapeData();
        List<ShapeData> shapes = Arrays.asList(shape1, shape2);

        Export export = new Export();
        export.setShapes(shapes);

        assertEquals(shapes, export.getShapes());
    }

    @Test
    public void testGroups() {
        GroupData group1 = new GroupData();
        GroupData group2 = new GroupData();
        List<GroupData> groups = Arrays.asList(group1, group2);

        Export export = new Export();
        export.setGroups(groups);

        assertEquals(groups, export.getGroups());
    }
}