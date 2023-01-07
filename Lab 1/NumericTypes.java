// TASK #2 Add an import statement for the Scanner class
import java.util.Scanner;

// TASK #2(Alternate)
// Add an import statement for the JOptionPane class

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

public class NumericTypes
{
   public static void main (String [] args)
   {
      // TASK #2 Create a Scanner object here
      Scanner keyboard = new Scanner(System.in);
      // (not used for alternate)

      // Identifier declarations
      final double NUMBER = 2 ;        // Number of scores
      final int SCORE1 = 100;       // First test score
      final int SCORE2 = 95;        // Second test score
      final int BOILING_IN_F = 212; // Boiling temperature
      int fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output

      // TASK #2 declare variables used here
      String firstname, lastname, fullname;

      // TASK #3 declare variables used here
      char firstInitial;

      // TASK #4 declare variables used here
      double diameter, radius, volume;

      // Find an arithmetic average.
      average = (SCORE1 + SCORE2) / NUMBER;
      output = SCORE1 + " and " + SCORE2 + " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = (5 * (BOILING_IN_F - 32))/9;
      output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
      // Prompt the user for first name
      System.out.print("What is your first name? ");

      // Read the user's first name
      firstname = keyboard.nextLine();

      // Prompt the user for last name
      System.out.print("What is your last name? ");
      
      // Read the user's last name
      lastname = keyboard.nextLine();

      // Concatenate the user's first and last names
      fullname = firstname + " " +lastname;

      // Print out the user's full name
      System.out.println(fullname);      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
      // Get the first character from the user's first name
      firstInitial = firstname.charAt(0);

      // Print out the user's first initial
      System.out.println(firstInitial);

      // Convert the user's full name to uppercase
      fullname = fullname.toUpperCase();

      // Print out the user's full name in uppercase
      System.out.println("fullname: " + fullname + "  length: " + fullname.length());      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
      // Prompt the user for a diameter of a sphere
      System.out.print("What is the diameter of the sphere? ");

      // Read the diameter
      diameter = keyboard.nextDouble();
      keyboard.close();

      // Calculate the radius
      radius = diameter/2;

      // Calculate the volume
      volume = (4 * Math.PI * Math.pow(radius, 3))/3;

      // Print out the volume
      System.out.println("Volume: "+volume);
   }
}