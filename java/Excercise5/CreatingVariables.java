public class CreatingVariables {
    public static void main( String[] args ) {
        int x, y, age, i;
        double seconds, e, checking, speed;
        String firstName, lastName, title, mom, dad;

        x = 10;
        y = 400;
        age = 39;
        i = 22;
        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        speed = 19.12345678912345;

        firstName = "Jack";
        lastName = "Wheeler";
        title = "Mr.";
        mom = "Linda";
        dad = "Mark";

        System.out.println( "The variable x contains " + x );
        System.out.println( "The variable i contains " + i );
        System.out.println( "The value " + y + " is stored in the variable y." );
        System.out.println( "The experiment took " + seconds + " seconds." );
        System.out.println( "A favorite irrational # is Euler's number: " + e );
        System.out.println( "Hopefully you have more than $" + checking + "!" );
        System.out.println( "My name's " + title + " " + firstName + lastName );
        System.out.println( "I was going " + speed + " Miles Per Hour" );
        System.out.println( "My mother's name is " + mom + " and my father's name is " + dad );

    }
}