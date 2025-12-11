/*
Write a method that finds the smallest element in an array of double values using
the following header:
public static double min(double[] array)
Write a Java Program that prompts the user to enter ten numbers, invokes this
method to return the minimum value, and displays the minimum value.
*/
import java.util.*;

public class MinimumInArray {
    public static void readArray(double[]arr){
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter 10 values:");
        for(int i=0;i<10;i++)
            arr[i] = gb.nextDouble();
    }
    public static double min(double[] array){
        double a = array[0];
        for(int i=1;i<array.length;i++){
            a = Math.min(a,array[i]);
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        
        double arr[] = new double[10];
        readArray(arr);
        double minm = min(arr);
        System.out.println("The minimum number is: "+minm);
        gb.close();
    }
}
