import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int[] dataPoints = new int[100];
        for (int d = 0; d < dataPoints.length; d++) {
            dataPoints[d] = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            if (i < dataPoints.length - 1) {
                System.out.println(dataPoints[i] );
            } else {
                System.out.println(dataPoints[i]);
            }
        }
        getAverage(dataPoints);
        sum(dataPoints);

        int finder = SafeInput.getRangedInt(in, "Enter a value number between 1 and 100", 100, 1);
        occurenceScan(dataPoints, finder);

        int finder2 = SafeInput.getRangedInt(in, "Enter a value number between 1 and 100", 100, 1);
        contains(dataPoints, finder2);
        max(dataPoints);
        min(dataPoints);
        getAverage(dataPoints);
    }

    public static double getAverage(int val[]) {
        double average = 0;
        double total = 0;
        for (int i = 0; i < val.length; i++) {
            total += val[i];
        }
        average = total / val.length;
        System.out.println("The average of the random array dataPoints is: %" + average);
        return average;
    }

    public static int sum(int val[]) {
        int totalSum = 0;
        for (int i = 0; i < val.length; i++) {
            totalSum += val[i];
        }
        System.out.println("The sum of the random dataPoints is: " + totalSum);
        return totalSum;
    }

    public static int max(int val[]) {
        int max = val[0];
        for (int m = 0; m < val.length; m++) {
            if (val[m] > max) {
                max = val[m];
            }
        }
        System.out.println(" The max value of the array is: " + max);
        return max;
    }

    public static int min(int val[]) {
        int min = val[0];
        for (int m = 0; m < val.length; m++) {
            if (val[m] < min) {
                min = val[m];
            }
        }
        System.out.println(" The min value of the array is: " + min);
        return min;
    }
    public static int occurenceScan(int val[], int num)
    {
        int count = 0 ;
        for(int l =0; l <val.length; l++)
        {
            if (num == val[l])
            {
                count ++;
            }
        }
        System.out.println(num + " appeared in the array " + count + " times.");
        return count;
    }
    public static boolean contains(int val[], int num)
    {
        int container = -1;
        for ( int n = 0; n <val.length; n ++)
        {
            if (num == val[n])
            {
                container = n;
                break;
            }
        }
        if (container != -1)
        {
            System.out.println(" The value "+ num + " was found at the array index : "+ container );
            return true;
        }
        else
        {
            System.out.println(" the value " + num + " was not found.");
            return false;
        }
    }
}


