import java.util.Scanner;

public class Blackjack {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);

    int total;
    int card1, card2;
    int dealer1 = 0;
    int dealerhidden;
    int dealer = 0;
    int draws = 0;
    String answer;
    boolean stand = false;
    int jack = 10;
    int queen = 10;
    int king = 10;
    int money = 0;
    int bet = 0;



    //Give User two cards

    System.out.println("Welcome to Black Jack's Blackjack table...");
    System.out.println("Special rules: Aces may be used as a 1 or an 11, and the dealer has to hit on 16 or lower, but cannot hit on 17 or higher.");
    System.out.println("Furthermore, you have a much better chance of being dealt a face card with your first two cards, but you cannot be dealt a face card on your subsequent cards.");
    System.out.println("Likewise, Black Jack cannot be dealt a face card with his first two cards, but can be dealt a face card on his subsequent cards.");
    System.out.println("This will benefit you.");
    System.out.println("Use these strategies and you may just beat Black Jack. Let's begin!");

    System.out.println("How much money do you have? ");
        money = keyboard.nextInt();

    card1 = 1 + (int)(Math.random()*14);

    card2 = 1 + (int)(Math.random()*14);

    System.out.println("You have been dealt two cards.");

     if (card1 == 12) {
        System.out.println("You first card is a Jack. A Jack is worth 10.");
        card1 = jack;
    }
    if (card1 == 13) {
        System.out.println("You first card is a Queen. A Queen is worth 10.");
        card1 = queen;
    }
    if (card1 == 14) {
        System.out.println("You first card is a King. A King is worth 10.");
        card1 = king;
    }
    if (card2 == 12) {
        System.out.println("You second card is a Jack. A Jack is worth 10.");
        card2 = jack;
    }
    if (card2 == 13) {
        System.out.println("You second card is a Queen. A Queen is worth 10.");
        card2 = queen;
    }
    if (card2 == 14) {
        System.out.println("You second card is a King. A King is worth 10.");
        card2 = king;
    }



    System.out.println("Your first card is: " + card1);
    System.out.println("Your second card is: " +card2);
    if (card1 == 1 || card1 == 11) {
        System.out.println("Your first card is an ace. Would you like it to equal 1 or 11? ");
        card1 = keyboard.nextInt();
    }
    if (card2 == 1 || card2 == 11){
        System.out.println("Your second card is an ace. Would you like it to equal 1 or 11? ");
        card2 = keyboard.nextInt();
    }

    draws = 2;
    total = card1 + card2;

    //Betting system

    System.out.println("How much money would you like to bet?");
    bet = keyboard.nextInt();

    if (bet > money) {
        System.out.println("Please enter a bet less than or equal to your money.");

         System.out.println("How much money would you like to bet?");
    bet = keyboard.nextInt();
    }





    //Give two cards to the dealer, hide one.



    dealer1 = 1 + (int)(Math.random()*11);
    dealerhidden = 1 + (int)(Math.random()*11);

    System.out.println("The dealer is showing: " + dealer1);
    System.out.println("The dealer's second card is hidden. ");
    stand = false;
    //Create program for when "hit" is entered
    while (stand == false)
    {

        card1 = 1 + (int)(Math.random()*11);
        if (card1 == 1 || card1 == 11) {
        System.out.println("Your next card is an ace. Would you like it to equal 1 or 11? ");
        card1 = keyboard.nextInt();
    total = total + card1;
    System.out.println("Your next card is: " + card1);


    }
    else if (draws > 2)
    {
            total = total + card1;
    System.out.println("Your next card is: " + card1);
    }


    //Player busts at >21

    System.out.println("Your total is: " + total );
     if ( total > 21)
     {
          System.out.println("You bust.");
          stand = true;
          break;
     }
     else
     {

    System.out.println("Would you like to HIT or STAND? ");
    answer = keyboard.next();

     }

    if (answer.equalsIgnoreCase ("HIT")) {
       stand = false;
       draws++;
    }
    else {

        stand = true;

    }





    }

    if (stand == true && total < 22)
    {




    System.out.println("Now it is the dealer's turn.");

    System.out.println("Once again, the dealer's first card was: " + dealer1);

    dealer = dealer1 + dealerhidden;

    System.out.println("The dealer's hidden card was " + dealerhidden + ". This makes the dealer's total " + dealer);

    //Dealer hits on 16 and lower, doesn't hit on 17 or higher


    while (dealer < 17) {
        System.out.println("The dealer has chosen to hit");
        dealer1 = 1 + (int)(Math.random()*14);

    if (dealer1 == 12) {
        System.out.println("The dealer's next card is a Jack. A Jack is worth 10.");
        dealer1 = jack;
    }
    if (dealer1 == 13) {
        System.out.println("The dealer's next card is a Queen. A Queen is worth 10.");
        dealer1 = queen;
    }
    if (dealer1 == 14) {
        System.out.println("The dealer's next card is a King. A King is worth 10.");
        dealer1 = king;
    }

    dealer = dealer + dealer1;
    System.out.println("The dealer's next card is: " + dealer1);
        System.out.println("The dealer has " + dealer + " in his hand. ");


    }
    }
    //Dealer busts at >21

    if (dealer > 21) {
        System.out.println("Dealer busted!\nYou win!");
        money = money + bet;
        dealer = 0;
    }
    else if (total > 21) {
        System.out.println("You lose");
        money = money - bet;
    }


    else if (total > dealer) {
        System.out.println("You win!");
        money = money + bet;
    }



    else {
        System.out.println("Dealer wins.");
        money = money - bet;
    }

    System.out.println("You now have " + money + " cryptocurrency. ");

}
}