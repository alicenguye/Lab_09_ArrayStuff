import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // create new scanner
        Scanner in = new Scanner(System.in);
        // create new random         
        Random rnd = new Random();
        // declare and array literals        
        int[] dataPoints = new int[100]; // 0- 99
        // traversal with for loop        
        for (int d = 0; d < dataPoints.length; d++) {
            dataPoints[d] = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            if (i < dataPoints.length - 1) {
                System.out.println(dataPoints[i] ); // display
            } else {
                System.out.println(dataPoints[i]); // dispplay
            }
        }
        getAverage(dataPoints);
        sum(dataPoints);
        // linear scan

        int finder = SafeInput.getRangedInt(in, "Enter a value number between 1 and 100", 100, 1); // declaration, prompt, high, low
        occurenceScan(dataPoints, finder);

        int finder2 = SafeInput.getRangedInt(in, "Enter a value number between 1 and 100", 100, 1);  // declaration, prompt, high, low
        contains(dataPoints, finder2);
        max(dataPoints); // declare max interger 
        min(dataPoints); // declare min interger
        getAverage(dataPoints);
    }
    // create a new public static for getAverage
    public static double getAverage(int val[]) {
        // declaration of variable
        double average = 0;
        double total = 0;
        // traversal with for loop  
        for (int i = 0; i < val.length; i++) {
            total += val[i];
        }
        //calculation for average
        average = total / val.length;
        //output
        System.out.println("The average of the random array dataPoints is: %" + average);
        return average;
    }
    // create a new public static for sum
    public static int sum(int val[]) {
        // declaration of variable
        int totalSum = 0;
        // traversal with for loop  
        for (int i = 0; i < val.length; i++) {
            totalSum += val[i];
        }
        // output
        System.out.println("The sum of the random dataPoints is: " + totalSum);
        return totalSum;
    }
    // create a new public static for max
    public static int max(int val[]) {
        // declaration of variable
        int max = val[0];
        // traversal with for loop  
        for (int m = 0; m < val.length; m++) {
            if (val[m] > max) {
                max = val[m];
            }
        }
        // output
        System.out.println(" The max value of the array is: " + max);
        return max;
    }
    // create a new public static for min
    public static int min(int val[]) {
        // declaration of variable
        int min = val[0];
        // traversal with for loop  
        for (int m = 0; m < val.length; m++) {
            if (val[m] < min) {
                min = val[m];
            }
        }
        //output
        System.out.println(" The min value of the array is: " + min);
        return min;
    }
    // create a new public staticfor occurenceScan
    public static int occurenceScan(int val[], int num)
    {
        // declaration of variable
        int count = 0 ;
        // traversal with for loop  
        for(int l =0; l <val.length; l++)
        {
            if (num == val[l])
            {
                count ++;
            }
        }
        // output
        System.out.println(num + " appeared in the array " + count + " times.");
        return count;
    }
    // create a new public staticfor contains
    public static boolean contains(int val[], int num)
    {
        // declaration of variable
        int container = -1;
        // traversal with for loop  
        for ( int n = 0; n <val.length; n ++)
        {
            if (num == val[n])
            {
                container = n;
                break;
            }
        }
        if (container != -1) // not equal -1
        {
            //output
            System.out.println(" The value "+ num + " was found at the array index : "+ container );
            return true;
        }
        else // equal -1
        {
            // output
            System.out.println(" the value " + num + " was not found.");
            return false;
        }
    }
}


