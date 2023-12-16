package fr.uga.miage.m1;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import fr.uga.miage.m1.model.Export;
import fr.uga.miage.m1.model.GroupData;
import fr.uga.miage.m1.model.ShapeData;

public class App {
    public static void main(String[] args) {
        //
        // demonstration de l'export
        //
        ExportTool exportTool = new ExportTool();
        //pour faire un export, créer un objet Export avec les shapes et les groups de votre projet, ici on utilise des données d'exemple
        List<ShapeData> shapes = Arrays.asList(
            new ShapeData(0, "square", 190, 153),
            new ShapeData(1, "square", 351, 295),
            new ShapeData(2, "triangle", 286, 215),
            new ShapeData(3, "circle", 165, 323),
            new ShapeData(4, "cube", 410, 124)
        );
        List<GroupData> groups = Arrays.asList(
            new GroupData(0, Arrays.asList(0, 4, 2)),
            new GroupData(1, Arrays.asList()),
            new GroupData(2, Arrays.asList(2, 1, 3)),
            new GroupData(3, Arrays.asList()),
            new GroupData(4, Arrays.asList())
        );
        Export export = new Export(shapes, groups);

        //vous pouvez maintenant réaliser l'export
        try{
            exportTool.export(export, "export/export.json");
        }
        catch(FileNotFoundException e){
            //code à exécuter si le fichier n'existe pas
        }
        
        //
        // demonstration de l'import
        //
        try{
            Export importedExport = ImportTool.getExport("export/export.json");
            //vous pouvez maintenant utiliser les données de l'export, et instancier vos propres objets
        }
        catch(FileNotFoundException e){
            //code à exécuter si le fichier n'existe pas
        }
    }
}
