
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) throws FileNotFoundException {
        ListAction.init();
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final Button btnShow = new Button("Show List");
        final Button btnSort = new Button("Sort List");
        final Button btnSave = new Button("Save List");
        final Button btnExtract = new Button("Extract List");
        final Button btnExit = new Button("Exit");
        final StackPane root = new StackPane(btnShow, btnSort, btnSave, btnExtract, btnExit);
        root.setPrefSize(250, 250);
        StackPane.setAlignment(btnShow, Pos.TOP_CENTER);
        StackPane.setAlignment(btnSort, Pos.CENTER);
        StackPane.setAlignment(btnSave, Pos.BOTTOM_LEFT);
        StackPane.setAlignment(btnExtract, Pos.BOTTOM_RIGHT);
        StackPane.setAlignment(btnExit, Pos.BOTTOM_CENTER);

        btnShow.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ListAction.show();
            }
        });
        btnSort.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ListAction.sort();
            }
        });
        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    ListAction.save();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        btnExtract.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    ListAction.extract();
                } catch (ClassNotFoundException | IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        btnSort.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ListAction.sort();
            }
        });
        btnExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });

        final Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}