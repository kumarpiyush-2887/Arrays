/*
Write a java program to print M-by-N array in the tabular format. Also, display the sum of
elements of the array. 
*/
import java.util.*;
public class PrintRowWise {
    public static void displayArray(int[][]arr){
        System.out.println("Elements of 2D array are:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of 2D array:");
        int row = gb.nextInt();
        int column = gb.nextInt();
        int [][]arr = new int[row][column];
        int sum = 0;
        System.out.println("Enter elements of 2D array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] = gb.nextInt();
                sum += arr[i][j];
            }
        }
        displayArray(arr);
        System.out.println("Sum of elements of 2d array is: "+sum);
    }
}
