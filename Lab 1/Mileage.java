// scanner class import 
import java.util.Scanner;

/** 
    this program will calculate mileage
    name: Ishrat Sikder
    date: September 22, 2021
 */

public class Mileage {
    public static void main(String[] args) {
        double miles; // number of miles
        double gallons; // number of gallons used
        double mpg; // miles per gallon

        // create scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // prompt user for miles driven
        System.out.print("How many miles have you driven? ");
        
        // read miles and store in variable
        miles = keyboard.nextDouble();

        // prompt user for gallons used
        System.out.print("How many gallons of fuel have you used? ");
        
        // read gallons and store in variable
        gallons = keyboard.nextDouble();

        keyboard.close(); // close scanner object

        // calculate mileage of vehicle
        mpg = miles/gallons;

        // print mpg
        System.out.println("The mpg of your vehicle is " + mpg + ".");
    }
}
