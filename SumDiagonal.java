
/*Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
values using the following header:
public static double sumMajorDiagonal(double[][] m)
Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
major diagonal
*/
import java.util.*;
public class SumDiagonal {
    public static void readArray(double[][]arr){
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a 4x4 matrix row-by-row:");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j] = gb.nextDouble();
            }
        }
        gb.close();
    }
    public static double sumMajorDiagonal(double[][]m){
        double sum = 0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if(i==j){
                    sum += m[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        double[][]arr = new double[4][4];
        readArray(arr);
        double diagSum = sumMajorDiagonal(arr);
        System.out.println("Sum of diagonal element is: "+diagSum);
    }
}
