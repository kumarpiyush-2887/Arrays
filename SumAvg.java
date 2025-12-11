/*
Write a Java Program that creates an array of size N and stores random values in it.
Implement two separate methods to process the array:
• A method to calculate the sum of the array elements:
public static int findSum(int[] arr);
• A method to calculate the average of the array elements:
public static double findAverage(int[] arr);
Use these methods in the main method and display the sum and average of the values
stored in the array.
*/
import java.util.*;
public class SumAvg {
    public static void readArray(int[]arr){
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = gb.nextInt();
        }
    }

    public static void displayArray(int[]arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
    }

    public static int findSum(int[]arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static double findAverage(int[]arr){
        double sum = findSum(arr);
        System.out.println("Sum of the elements is: "+sum);
        double avg = sum/arr.length;
        return avg;
    }

    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter value of N.");
        int n = gb.nextInt();
        int []arr = new int[n];
        readArray(arr);
        displayArray(arr);
        System.out.println("Average of the elements = "+findAverage(arr));
        gb.close();
    }
}

