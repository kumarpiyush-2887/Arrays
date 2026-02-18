/*
Write a method to add two matrices. The header of the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the same or
compatible types of elements
*/
import java.util.*;
public class SumDouble {
    public static void readArray(double[][]arr){
        Scanner gb = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = gb.nextDouble();
            }
        }
    }

    public static double[][] addMatrix(double[][]a, double[][]b){
        double[][]c = new double[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of array A");
        int rowA = sc.nextInt();
        int columnA = sc.nextInt();
        double[][]A = new double[rowA][columnA];
        System.out.println("Enter a "+rowA+" x "+columnA+" matrix A");
        readArray(A);

        System.out.println("Enter rows and columns of array B");
        int rowB = sc.nextInt();
        int columnB = sc.nextInt();
        double[][]B = new double[rowB][columnB];
        System.out.println("Enter a "+rowB+" x "+columnB+" matrix B");
        readArray(B);

        if((A.length != B.length) || (A[0].length != B[0].length)){
            System.out.println("Arrays not compatible for addition!!");
            System.exit(0);
        }

        double[][] c = addMatrix(A, B);
        System.out.println("Matrix after addition:");
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
