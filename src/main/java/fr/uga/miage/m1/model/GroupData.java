package fr.uga.miage.m1.model;


import java.util.List;

public class GroupData {
    private int id;
    private List<Integer> shapes;

    public GroupData() {
    }

    public GroupData(int id, List<Integer> shapes) {
        this.id = id;
        this.shapes = shapes;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<Integer> getShapes() {
        return shapes;
    }
    public void setShapes(List<Integer> shapes) {
        this.shapes = shapes;
    }
}
