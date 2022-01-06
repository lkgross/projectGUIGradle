package bsu.comp152;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 * Kilometer Converter application
 */

public class KiloConverterLambda extends Application {
    // Fields
    private TextField kiloTextField;
    private Label resultLabel;

    public static void main(String[] args) {
        // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a Label to display a prompt.
        Label promptLabel = new Label("Enter a distance in kilometers:");

        // Create a TextField for input.
        kiloTextField = new TextField();

        // Create a Button to perform the conversion.
        Button calcButton = new Button("Convert");

        /*
        A functional interface is an interface that has one,
         and only one, abstract method. 

        The EventHandler interface has only one abstract method (handle):
        It is a functional interface. 

        Any time you are writing Java code to instantiate an anonymous class
        that implements a functional interface, you should consider
        using a lambda expression instead:
         */
        // Register the event handler.
        calcButton.setOnAction(e -> {
            // Get the kilometers.
            double kilometers = Double.parseDouble(kiloTextField.getText());

            // Convert the kilometers to miles.
            double miles = kilometers * 0.6214;

            // Display the results.
            resultLabel.setText(String.format("%,.2f miles", miles));
        });

        // Create an empty Label to display the result.
        resultLabel = new Label();

        // Put the promptLabel and the kiloTextField in an HBox.
        HBox hbox = new HBox(10, promptLabel, kiloTextField);

        // Put the HBox, calcButton, and resultLabel in a VBox.
        VBox vbox = new VBox(10, hbox, calcButton, resultLabel);

        // Set the VBox's alignment to center.
        vbox.setAlignment(Pos.CENTER);

        // Set the VBox's padding to 10 pixels.
        vbox.setPadding(new Insets(10));

        // Create a Scene.
        Scene scene = new Scene(vbox);

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the stage title.
        primaryStage.setTitle("Kilometer Converter");

        // Show the window.
        primaryStage.show();
    }
}
