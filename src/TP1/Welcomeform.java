package TP1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Welcomeform extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER); 
        grid.setHgap(10); 
        grid.setVgap(10); 
        grid.setPadding(new Insets(25)); 

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btnSignIn = new Button("Sign in");
        HBox hbBtnSignIn = new HBox(10);
        hbBtnSignIn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnSignIn.getChildren().add(btnSignIn);
        grid.add(hbBtnSignIn, 1, 4);

        
        Button btnExit = new Button("Exit");
        HBox hbBtnExit = new HBox(10);
        hbBtnExit.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnExit.getChildren().add(btnExit);
        grid.add(hbBtnExit, 2, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btnSignIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String username = userTextField.getText();
                String password = pwBox.getText();
                
                if (password.equals("motdepasse")) {
                    actiontarget.setFill(Color.GREEN);
                    actiontarget.setText("Sign in successful for user: " + username);
                } else {
                    actiontarget.setFill(Color.RED);
                    actiontarget.setText("Incorrect password");
                }
            }
        });

        btnExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Platform.exit(); 
            }
        });

        Scene scene = new Scene(grid, 400, 275);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
