import java.util.Scanner; 
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        // Open the file.
        File file = new File("secret.txt");
        Scanner inputFile = new Scanner(file);

        // Read lines from the file until no more are left.
        while (inputFile.hasNext())
        {
            // Read the next name.
            String word = inputFile.nextLine();
            String[] tokens = word.split(" ");

            for (int i = 0; i < tokens.length; i+=5) 
            {
                tokens[i] = tokens[i].substring(0, 1).toUpperCase() + tokens[i].substring(1);    
            }
            StringBuilder newStr = null;
            newStr = new StringBuilder();
            for (String str : tokens) 
            {
                newStr.append(str + " ");
            }
            System.out.println(newStr);
        }

        // Close the file.
        inputFile.close();
    }
}