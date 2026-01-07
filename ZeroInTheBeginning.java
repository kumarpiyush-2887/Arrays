/*
Write a Java Program that inputs 10 integer values from the user and moves all
zeros to the beginning of the array while maintaining the relative order of all non-zero
elements.
*/
import java.util.*;
public class ZeroInTheBeginning {

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

    public static void shiftZero(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                for(int j=i;j>0;j--){
                    arr[j] = arr[j-1];
                }
                arr[0] = 0;
            }
        }
    }

    
    public static void main(String[]args){
        int[]A = new int[10];
        readArray(A);
        System.out.println("Before moving zero to beginning:");
        displayArray(A);
        System.out.println();
        System.out.println("After moving zero to beginning:");
        shiftZero(A);
        displayArray(A);
    }
}
