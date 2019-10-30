import java.util.Scanner;

public class SpaceBoxing {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int earthweight;
        Double Venus = 1.;
        Double Mars = 2.;
        Double Jupiter = 3.;
        Double Saturn = 4.;
        Double Uranus = 5.;
        Double Neptune = 6.;
        Double Planet;
        System.out.print( "Please enter your current earth weight: " );
        earthweight = keyboard.nextInt();

        System.out.print( "I have information for the following planets:\n \t1. Venus \t2. Mars \t3. Jupiter\n \t4. Saturn \t5. Uranus \t6. Neptune\n ");
        System.out.print( "Enter the number of the planet that you would like to visit? ");
        Planet = keyboard.nextDouble();

        if ( Planet == 1. ) {
            System.out.println( "Your weight on that planet would be " + earthweight * 0.78);
        }
        if ( Planet == 2. ) {
            System.out.println( "Your weight on that planet would be " + earthweight * .39);
        }
        if ( Planet == 3. ) {
            System.out.println( "Your weight on this planet would be " + earthweight * 2.65);
        }
        if ( Planet == 4. ) {
            System.out.println( "Your weight on this planet would be " + earthweight * 1.17);
        }
        if ( Planet == 5. ) {
            System.out.println( "Your weight on this planet would be " + earthweight * 1.05);
        }
        if ( Planet == 6. ) {
            System.out.println( "Your weight on this planet would be " + earthweight * 1.23);
        }

}
}
