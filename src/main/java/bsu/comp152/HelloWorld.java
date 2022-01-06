package bsu.comp152;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;

/**
 * A JavaFX Hello World application
 * Starting Out with Java by Gaddis
 * Modified by Laura K. Gross, laura.gross@bridgew.edu, January, 2021
 */
public class HelloWorld extends Application {
    public static void main(String[] args) {
        // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a Label component.
        Label messageLabel = new Label("Hello World");

        // Put the Label in a Scene.
        Scene scene = new Scene(messageLabel);
        // Or make the scene 500 pixels wide by 200 pixels high.
        // Scene scene = new Scene(messageLabel, 500, 200 );

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the stage title.
        primaryStage.setTitle("My First Scene");

        // Show the window.
        primaryStage.show();
    }
}
