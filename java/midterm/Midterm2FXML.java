import java.util.Scanner;
import javafx.application.Application;
import static java.lang.System.*;
import javax.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.stage.*;


public class Midterm2FXML extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Midterm2.fxml"));
        Scene scene = new Scene(root, 1200, 600);
        stage.setTitle("Midterm");
        stage.setScene(scene);
        stage.show();
        }
            public static void main(String[] args) 
            {
                launch(args);
            }
    }
