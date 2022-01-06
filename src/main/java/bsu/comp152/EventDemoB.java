package bsu.comp152;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 * An Event Demo
 * Starting Out with Java by Gaddis
 * Modified by Laura K. Gross, laura.gross@bridgew.edu, November, 2018
 */

public class EventDemoB extends Application
{
    // Field for the Label control
    private Label myLabel;
    private Label myLabel2;

    public static void main(String[] args)
    {
        // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        // Create Label controls.
        myLabel = new Label("Click the button to flip a coin.");
        myLabel2 = new Label("Click the button to draw a card.");

        // Create Button controls.
        Button myButton = new Button("Click Me");
        Button myButton2 = new Button("Click Me");

        // Register the event handlers.
        myButton.setOnAction(new ButtonClickHandler());
        myButton2.setOnAction(new ButtonClickHandler2());

        // Put the Labels and Buttons in a GridPane.
        GridPane gridpane = new GridPane();

        gridpane.add(myLabel, 0, 0);
        gridpane.add(myLabel2, 1, 0);
        gridpane.add(myButton, 0, 1);
        gridpane.add(myButton2, 1, 1);

        // Set the gap sizes.
        gridpane.setVgap(30);
        gridpane.setHgap(30);

        // Set the GridPane's padding.
        gridpane.setPadding(new Insets(30));

        gridpane.setAlignment(Pos.CENTER);

        // Create a Scene with the VBox as its root node.
        Scene scene = new Scene(gridpane, 500, 200);

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the stage title.
        primaryStage.setTitle("Button Demo");

        // Show the window.
        primaryStage.show();
    }

    /*
     * Event handler class for myButton
     */
    class ButtonClickHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            myLabel.setText("You flipped the coin!");
        }
    }

    /*
     * Event handler class for myButton2
     */
    class ButtonClickHandler2 implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            myLabel2.setText("You drew a card!");
        }
    }

}
