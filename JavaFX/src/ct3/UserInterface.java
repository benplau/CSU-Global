package ct3;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UserInterface extends Application {

    private TextArea textBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("User Interface");

        MenuItem item1 = new MenuItem("Print Date and Time");
        MenuItem item2 = new MenuItem("Write to log.txt");
        MenuItem item3 = new MenuItem("Change Background Color");
        MenuItem item4 = new MenuItem("Exit");

        item1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                printDateTime();
            }
        });

        item2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                writeToLogFile();
            }
        });

        item3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                changeBackgroundColor();
            }
        });

        item4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });

        Menu menu = new Menu("Menu");
        menu.getItems().addAll(item1, item2, item3, item4);
        
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);

        textBox = new TextArea();
        VBox vbox = new VBox(textBox);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setCenter(vbox);

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void printDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(new Date());
        textBox.setText(dateTime);
    }

    private void writeToLogFile() {
        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write(textBox.getText());
            writer.flush();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }

    private void changeBackgroundColor() {
        Random random = new Random();
        int hue = 15 + 15 * random.nextInt((225 - 15) / 15 + 1);
        Color color = Color.hsb(hue, 1, 1);
        BackgroundFill backgroundFill = new BackgroundFill(color, null, null);
        Background background = new Background(backgroundFill);
        ((BorderPane) textBox.getParent().getParent()).setBackground(background);
    }
}
