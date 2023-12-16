package fr.uga.miage.m1.model;

import java.util.List;

public class Export {
    private List<ShapeData> shapes;
    private List<GroupData> groups;

    public Export() {
    }

    public Export(List<ShapeData> shapes, List<GroupData> groups) {
        this.shapes = shapes;
        this.groups = groups;
    }

    public List<GroupData> getGroups() {
        return groups;
    }
    public List<ShapeData> getShapes() {
        return shapes;
    }
    public void setGroups(List<GroupData> groups) {
        this.groups = groups;
    }
    public void setShapes(List<ShapeData> shapes) {
        this.shapes = shapes;
    }
}
