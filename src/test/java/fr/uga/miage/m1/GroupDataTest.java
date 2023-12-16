package fr.uga.miage.m1;

import fr.uga.miage.m1.model.GroupData;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class GroupDataTest {

    @Test
    public void testId() {
        int id = 1;

        GroupData groupData = new GroupData();
        groupData.setId(id);

        assertEquals(id, groupData.getId());
    }

    @Test
    public void testShapes() {
        List<Integer> shapes = Arrays.asList(1, 2, 3);

        GroupData groupData = new GroupData();
        groupData.setShapes(shapes);

        assertEquals(shapes, groupData.getShapes());
    }
}