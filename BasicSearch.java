/*
Write a Java Program that reads 10 integers from the keyboard and stores them in
an array. After the array is filled, prompt the user to enter a number to search for. 
Use the following methods:
1. A method to read and store the 10 integers into the array:
public static void readArray(int[] arr);
2. A method to count how many times the searched number appears in the array:
public static int countOccurrences(int[] arr, int key);
In the main method, call these methods and display whether the number is found and
how many times it occurs.
*/
import java.util.*;
public class BasicSearch {
    public static void readArray(int[]arr){
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for(int i=0;i<10;i++)
            arr[i] = gb.nextInt();
    }

    public static int countOccurrences(int[]arr, int key){
        int c = 0;
        for(int i=0;i<10;i++){
            if(arr[i]==key)
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        int []newarr = new int[10];
        readArray(newarr);

        System.out.println("Enter the number to search for:");
        int x = gb.nextInt();

        int count = countOccurrences(newarr, x);
        System.out.println("The number "+x+" appears "+count+" time(s) in the array.");
        gb.close();
        
    }
}
