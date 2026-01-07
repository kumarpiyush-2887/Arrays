/*
Write a Java Program that reads 10 double numbers from the user and stores them
in an array.
Implement a method to sort the array using the bubble sort algorithm.
Use the following method header:
public static void bubbleSort(double[] arr);
The bubble sort method should repeatedly compare neighbouring elements in the
array and swap them if they are not in order, gradually moving smaller values to the
beginning of the array and larger values to the end.
Use this method in the main method to sort the array and display the sorted numbers.
*/

import java.util.Scanner;

public class BubbleSortDouble {

    public static void readArray(double[] arr){
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" values:");
        for(int i=0;i<arr.length;i++)
            arr[i] = gb.nextDouble();
    }

    public static void displayArray(double[]arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
    }

    public static void bubbleSort(double[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        double[]arr = new double[10];
        readArray(arr);
        System.out.println("Before sorting:");
        displayArray(arr);

        bubbleSort(arr);
        System.out.println("After sorting:");
        displayArray(arr);
    }
}
