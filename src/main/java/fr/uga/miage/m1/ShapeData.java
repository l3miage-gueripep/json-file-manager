package fr.uga.miage.m1;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class ShapeData {
    private int id;
    private String type;
    private int x;
    private int y;
    private JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();

    public ShapeData() {
    }

    public ShapeData(int id, String type, int x, int y) {
        this.id = id;
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public JsonObject getJsonObject(){
        jsonObjectBuilder.add("id", id)
            .add("type", type)
            .add("x", x)
            .add("y", y);
        return jsonObjectBuilder.build();
    }
}
