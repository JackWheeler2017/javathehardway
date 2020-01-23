import java.io.File;
import java.net.URL;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;


public class Midterm2FXML extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Midterm2.fxml"));
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Midterm");
        stage.setScene(scene);
        stage.show();
        }
            public static void main(String[] args) 
            {
                
                launch(args);
            }
    }
