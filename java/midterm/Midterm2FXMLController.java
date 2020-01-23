import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import java.util.Scanner;

public class Midterm2FXMLController {
int streak = 0;
@FXML 
public Text txt;

@FXML 
private Button btn;
@FXML
    void flipCoin(ActionEvent event) {
    String coin, again;
    
    boolean gotHeads;

        gotHeads = Math.random() < 0.6;
        if ( gotHeads )
            coin = "HEADS";
        else
            coin = "TAILS";

            System.out.println("You flip a coin and it is... " + coin);

            if ( gotHeads ) {
                streak++;
                System.out.println("\tThat's " + streak + " in a row...");
            }
            else {
                System.out.println("\tYou lose everything!");
                System.out.println("\tShould've quit while you were aHEAD....");
                streak = 0;
            }

        System.out.println( "Streak: " + streak ); 
        String output = "Try to get heads\n\nYou flipped " + coin + " Streak: " + streak;
        txt.setText(output);
}
}