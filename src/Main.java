import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Grand Circus Student on 7/18/2017.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int studentNumber;
        String answer = "yes";

        String[] classNames = {"Amber", "Bentley", "Catie", "David","Evan","Frank","Georgia","Hilary","Indigo","Jason",
                "Kathy","Larry","Mary","Nathan","Oliver","Patty","Quintin","Scarlet","Ted","Ursula"};
        String[] highSchool = {"Ann Arbor", "Bullock","Citadel", "Davidson","Eagle","Franklin","Gary","Hilton","Israel","Jesuit",
                "King","London","Madison","Nectar","Oak","Patterson","Quincy","Seaholm","Talmer","Union"};
        String[] favColor = {"Amber", "Blue", "Cyan", "Denim","Emerald","Fuchsia","Gold","Harlequin","Ivory","Jade",
                "Khaki","Lime","Magenta","Navajo","Olive","Peach","Quartz Grey","Scarlet","Tan","Ultramarine"};

        do {
            try {
                System.out.print("Please enter a student number to learn more (1-20): ");
                studentNumber = scan.nextInt();
                System.out.println("My student is: " + classNames[studentNumber - 1]);
                scan.nextLine();

            System.out.println("What would you like to learn about us? Enter 'high school' or 'favorite color': ");
            String userWants = scan.nextLine();

            if (userWants.contains("school")) {
                System.out.println("My student went to: " + highSchool[studentNumber - 1] + "high school.");
            } else if (userWants.contains("color")) {
                System.out.println("My student's favorite color: " + favColor[studentNumber - 1]);
            }


            System.out.println("Would you like to learn more about another student? Please enter 'yes' or 'no'.");
            answer = scan.nextLine();

            } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                System.out.println("That student doesn't exist. Please try again and enter a whole integer w/0 a "
                        + "decimal point.");
                scan.nextLine();
            }

//            catch (InputMismatchException e) {
//                System.out.println("Please enter a whole integer w/o a decimal point.");
//            }

        } while (answer.equalsIgnoreCase("yes"));


    }

}
