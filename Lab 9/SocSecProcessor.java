import java.util.Scanner;
public class SocSecProcessor 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        String name, SSN, input;
        char answer = 'Y';

        while (Character.toUpperCase(answer) == 'Y')
        {
            try 
            {
                System.out.print("Enter name: ");
                name = keyboard.nextLine();
                System.out.print("Enter social security number (SSN): ");
                SSN = keyboard.nextLine();

                if (isValid(SSN)) 
                {
                    System.out.println(name + " " + SSN + " is valid.");
                }
                else
                {
                    System.out.println(name + " " + SSN + " is not valid.");   
                }
            } 
            catch (SocSecException e) 
            {
                System.out.println(e.getMessage());
            }  
            
            System.out.print("Continue? ");
            input = keyboard.nextLine();
            answer = input.charAt(0);
        }
        keyboard.close();
    }

    public static boolean isValid(String ssn) throws SocSecException
    {
        boolean pass = true;
        if (ssn.length() != 11) 
        {
            pass = false;
            throw new SocSecException("wrong number of characters!");  
        }
        for (int i = 0; i < ssn.length(); i++) 
        {
            if (i == 3 || i == 6) 
            {
                if (ssn.charAt(i) != '-') 
                {
                    pass = false;
                    throw new SocSecException("dashes at wrong position!");
                }
            }
            else if (!Character.isDigit(ssn.charAt(i))) 
            {
                pass = false;
                throw new SocSecException("contains non digit characters!");   
            }
        }
        return pass;
    }  
}




