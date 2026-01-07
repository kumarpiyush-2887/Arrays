/*
Write a Java Program that reads n elements into an array and finds the second
largest value.
Implement a method to determine the second largest element:
public static int findSecondLargest(int[] arr);
Use this method in the main method to display the second largest value in the array.
Note: Don’t use any sorting methods.
*/

import java.util.Scanner;

public class SecondLargest {
    public static void readArray(int[]arr){
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" numbers:");
        for(int i=0;i<arr.length;i++){
            arr[i] = gb.nextInt();
        }
    }

    public static void displayArray(int[]arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
    }

    public static int findSecondLargest(int[]arr){
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                sl = l;
                l = arr[i];
            }
            else if(arr[i]>sl && arr[i]!=l)
                sl = arr[i];
        }
        return sl;
    }

    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = gb.nextInt();
        int[]arr = new int[n];
        readArray(arr);
        displayArray(arr);
        System.out.println("Second largest element is: "+findSecondLargest(arr));
        gb.close();
    }
}
