/*
Write a Java Program that asks the user to enter the size of an array, then creates the
array and inputs the required number of values. Use methods to perform the
following tasks:
1. A method to read and store the values in the array:
public static void readArray(int[] arr);
2. A method to find the maximum value in the array:
public static int findMax(int[] arr);
3. A method to find the minimum value in the array:
public static int findMin(int[] arr);
CO6
4. A method to count how many times a given value appears:
public static int countOccurrences(int[] arr, int value);
5. A method to find the first position of the maximum value:
public static int firstPositionOfMax(int[] arr, int max);
6. A method to find the last position of the minimum value:
public static int lastPositionOfMin(int[] arr, int min);
Use these methods in the main method to display:
• The maximum value and how many times it occurs,
• The minimum value and how many times it occurs,
• The first position of the maximum value,
• The last position of the minimum value.
*/
import java.util.*;
public class EveryBasic {

    public static void readArray(int[] arr){
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" values:");
        for(int i=0;i<arr.length;i++)
            arr[i] = gb.nextInt();
    }

    public static int findMax(int[] arr){
        int m = arr[0];
        for(int i=1;i<arr.length;i++)
            m = arr[i]>m?arr[i]:m;
        return m;
    }

    public static int findMin(int[] arr){
        int m = arr[0];
        for(int i=1;i<arr.length;i++)
            m = arr[i]<m?arr[i]:m;
        return m;
    }

    public static int countOccurrences(int[] arr, int value){
        int c = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value)
                c++;
        }
        return c;
    }

    public static int firstPositionOfMax(int[] arr, int max){
        int p=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                p=i;
                break;
            }
        }
        return p;
    }

    public static int lastPositionOfMin(int[] arr, int min){
        int p=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==min){
                p=i;
                break;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = gb.nextInt();
        int[]arr = new int[n];

        readArray(arr);
        int maxm = findMax(arr);
        int countMax = countOccurrences(arr, maxm);
        int firstMax = firstPositionOfMax(arr, maxm);
        System.out.println("Maximum Value: "+maxm);
        System.out.println("It occurs "+countMax+" time(s).");
        System.out.println("First position of maximum: "+firstMax);
        System.out.println();
        int minm = findMin(arr);
        int countMin = countOccurrences(arr, minm);
        int lastMin = lastPositionOfMin(arr, minm);
        System.out.println("Minimum Value: "+minm);
        System.out.println("It occurs "+countMin+" time(s).");
        System.out.println("Last position of minimum: "+lastMin);
        gb.close();
    }
}
