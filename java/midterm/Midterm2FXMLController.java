import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class MessengerFXMLController {
@FXML public Text txt;

@FXML
    void flipCoin(ActionEvent event) {
    String coin, again;
    int streak = 0;
    boolean gotHeads;

    do {
        gotHeads = Math.random() < 0.6;

        if ( gotHeads )
            coin = "HEADS";
        else
            coin = "TAILS";

            System.out.println("You flip a coin and it is... " + coin);

            if ( gotHeads ) {
                streak++;
                System.out.println("\tThat's " + streak + " in a row...");
                System.out.print("\tWould you like to flip again (y/n)? ");
                again = keyboard.next();
            }
            else {
                System.out.println("\tYou lose everything!");
                System.out.println("\tShould've quit while you were aHEAD....");
                streak = 0;
                again = "n";
            }
        } while ( again.equals("y") );

        System.out.println( "Final score: " + streak ); 
        String output = "Final score: " + streak;
        txt.setText(output);
}
}