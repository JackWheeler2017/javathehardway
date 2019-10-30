import java.util.Scanner;

public class ThreeCardsMonte {
    public static void main(String[]args) {
        Scanner keyboard = new Scanner(System.in);
        int ace;
        int guess;

        ace = 1 + (int)(Math.random()*3);

        System.out.println("You slide up to Fast Jack's card table and plop down your cash.");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
        System.out.println("He lays down three cards.");
        System.out.println("Which one is the ace?");

        System.out.println("##  ##  ##");

        System.out.println("##  ##  ##");

        System.out.println("1   2   3");

        guess = keyboard.nextInt();

        if ((ace == 1) && (guess == 1)) {

            System.out.println("You nailed it! Fast Jack reluctantly hands over your winnings, scowling.");

            System.out.println("AA  ##  ##");

            System.out.println("AA  ##  ##");

            System.out.println("1   2   3");
  }
        else if ((ace == 1) && (guess != 1)) {

            System.out.println("Ha! Fast Jack wins again! The ace was card number " + ac e+".");

            System.out.println("AA  ##  ##");

            System.out.println("AA  ##  ##");

            System.out.println("1   2   3");
  }
        else if ((ace == 2) && (guess == 2)) {

            System.out.println("You nailed it! Fast Jack reluctantly hands over your winnings, scowling.");

            System.out.println("##  AA  ##");

            System.out.println("##  AA  ##");

            System.out.println("1   2   3");
  }
        else if ((ace == 2) && (guess != 2)) {

            System.out.println("Ha! Fast Jack wins again! The ace was card number " + ace +".");

            System.out.println("##  AA  ##");

            System.out.println("##  AA  ##");

            System.out.println("1   2   3");
  }
        else if ((ace == 3) && (guess == 3)) {

            System.out.println("You nailed it! Fast Jack reluctantly hands over your winnings, scowling.");

            System.out.println("##  ##  AA");

            System.out.println("##  ##  AA");

            System.out.println("1   2   3");
  }
        else if ((ace == 3) && (guess != 3)) {

            System.out.println("Ha! Fast Jack wins again! The ace was card number " + ace +".");

            System.out.println("##  ##  AA");

            System.out.println("##  ##  AA");

            System.out.println("1   2   3");
      }
    }
}