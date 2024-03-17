package TP1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class PremiereFenetre extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300, Color.WHITE);
        
        
        Line line = new Line(100, 50, 300, 50);
        line.setStroke(Color.BLUE); 
        line.setStrokeWidth(3); 
        
        
        Rectangle rectangle = new Rectangle(100, 100, 200, 100);
        rectangle.setFill(Color.RED); 
        rectangle.setStroke(Color.BLACK);  
        rectangle.setStrokeWidth(2); 
        
        
        Circle circle = new Circle(250, 200, 50);
        circle.setFill(Color.GREEN); // Couleur de remplissage du cercle
        circle.setStroke(Color.BLACK); // Couleur de bordure du cercle
        circle.setStrokeWidth(2); // Épaisseur de la bordure
        
        root.getChildren().addAll(line, rectangle, circle);
        
        primaryStage.setTitle("Ma première fenêtre");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
