import java.util.Scanner;

public class BMICalculator {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double in, pounds, bmi;

        System.out.print( "Your heigh in inches: " );
        in = keyboard.nextDouble();

        System.out.print( "Your weight in pounds: " );
        pounds = keyboard.nextDouble();

        in = in / 39.37;

        pounds = pounds / 2.205;

        bmi = pounds / (in*in);

        System.out.println( "Your BMI is " + bmi );
    }
}