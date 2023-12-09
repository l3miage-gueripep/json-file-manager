package fr.uga.miage.m1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class ExportTool {
    private static final Logger logger = Logger.getLogger(ExportTool.class.getName());
    private static final String GENERIC_ERROR_MESSAGE = "An error occured while exporting the JSON file";

    public JsonArrayBuilder createJsonShapesArray(List<ShapeData> shapes){
        JsonArrayBuilder jsonArray = Json.createArrayBuilder();

        for(ShapeData shape : shapes){
            jsonArray.add(getShapeJsonObject(shape));
        }
        return jsonArray;
    }

    public JsonArrayBuilder createJsonGroupsArray(List<GroupData> groupes){
        JsonArrayBuilder jsonArray = Json.createArrayBuilder();
        for(GroupData group : groupes){
            jsonArray.add(createJsonObject(group));
        }
        return jsonArray;
    }

    public JsonObject getShapeJsonObject(ShapeData shapeData){
        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
        jsonObjectBuilder.add("id", shapeData.getId())
            .add("type", shapeData.getType())
            .add("x", shapeData.getX())
            .add("y", shapeData.getY());
        return jsonObjectBuilder.build();
    }

    public JsonObject createJsonObject(GroupData groupData){
        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
        jsonObjectBuilder.add("id", groupData.getId());
        JsonArrayBuilder jsonArrayBuilder = Json.createArrayBuilder();
        for(Integer shape : groupData.getShapes()){
            jsonArrayBuilder.add(shape);
        }
        jsonObjectBuilder.add("shapes", jsonArrayBuilder);
        return jsonObjectBuilder.build();
    }

    public void writeInFile(String filepath, JsonObject jsonObject){
        try  (FileWriter fileWriter = new FileWriter(filepath)) {
            fileWriter.write(jsonObject.toString());
            logger.log(Level.INFO, "JSON object has been written to {0}", filepath);
        } catch (IOException e) {
            logger.log(Level.SEVERE, GENERIC_ERROR_MESSAGE, e);
        }
    }
}
