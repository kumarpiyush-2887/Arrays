/*
Write a Java program that reads 10 integers from the keyboard and stores them in an
array. After storing the values, rotate the array elements clockwise by one position
without using any additional array.
Implement the following methods:
1. A method to read and store the 10 integers:
public static void readArray(int[] arr);
2. A method to rotate the array elements clockwise by one position (in-place):
public static void rotateClockwise(int[] arr);
3. A method to print the array:
public static void printArray(int[] arr);
Use these methods in the main method to input the array, rotate it, and display the
rotated result.
Sample run:
Enter ten numbers: 1 2 3 4 5 6 7 8 9 10
Array elements before clock-wise rotation:
1 2 3 4 5 6 7 8 9 10
Array elements after clock-wise rotation:
10 1 2 3 4 5 6 7 8 9
*/
import java.util.*;
public class ClockwiseRotation {

    public static void readArray(int[] arr){
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" values:");
        for(int i=0;i<arr.length;i++)
            arr[i] = gb.nextInt();
        gb.close();
    }

    public static void displayArray(int[]arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void rotateClockwise(int[]arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int[]arr = new int[10];
        readArray(arr);
        System.out.println("Array elements before clock-wise rotation:");
        displayArray(arr);

        rotateClockwise(arr);
        System.out.println("Array elements after clock-wise rotation:");
        displayArray(arr);

    }
}
