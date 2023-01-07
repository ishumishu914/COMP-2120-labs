import java.util.Scanner;
public class Average
{
    private int[] data = new int[5];
    private double mean;

    public Average()
    {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter score for test #" + (i+1) + ": ");
            data[i] = keyboard.nextInt();
        }
        selectionSort();
        calculateMean();
        keyboard.close();
    }

    public double calculateMean()
    {
        double tot=0;
        for (int i = 0; i < data.length; i++) 
        {
            tot += data[i];
        }
        mean = tot/5;
        return mean;
    }

    public void selectionSort()
    {
        int temp=0;

        for (int i = 0; i < 5-1; i++) 
        {
            for (int j = 0; j < (5-i-1); j++) 
            {
                if (data[j] < data[j+1]) 
                {
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;    
                }
            }
        }
    }

    public String toString()
    {
        String printData = "";
        System.out.print("The sorted values are:");
        for(int i = 0; i < data.length; i++)
        {
            printData += (data[i] + " ");
        }
        printData = printData + "\nThe average of the scores is " + mean;
        return printData;
    }
}