import java.util.Scanner;

public class ALittleQuiz {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int Alaska, Answer, Math;
        double score = 0;
        System.out.println("Are you ready for a quiz? ");
        keyboard.next();

        System.out.println("Okay here it comes!\n ");

        System.out.println("Question 1: What is the capital of Alaska?\n\t 1. Melbourne\n\t 2. Anchorage\n\t 3. Juneau\n ");
        Alaska = keyboard.nextInt();

        if (Alaska == 3) {
            System.out.println("Correct!!!");
            score++;
        }
        else {
            System.out.println("Incorrect, sorry. ");
        }

        System.out.println("Question 2: Can you store the value 'cat' in a variable of type int?\n\t 1. Yes\n\t 2. No\n ");
        Answer = keyboard.nextInt();

        if (Answer == 1) {
            System.out.println("Sorry, 'cat' is a string. ints can only store numbers. ");
        }
        else {
            System.out.println("Correct!!! ");
            score++;
        }

        System.out.println("Question 3: What is the result of 9+6/3?\n\t 1. 5\n\t 2. 11\n\t 3. 15/3\n ");
        Math = keyboard.nextInt();

        if (Math == 2) {
            System.out.println("Correct!!!");
            score++;
        }
        else {
            System.out.println("Incorrect. Try using PEMDAS.");
        }

        System.out.println("Overall, you got " + score + " out of 3 questions correct.\nThanks for playing! ");

    }

}
