/*
Write a Java Program that uses an array to read a sequence of integers between 1
and 100, ending when the user enters 0. Store and count the occurrences of each
number in the array.
Your program must use the following methods:
1. A method to read the input values and update the counts:
public static void readInput(int[] counts);
2. A method to display how many times each number appears:
public static void displayCounts(int[] counts);
Use these methods in the main method to count and display the occurrences of the
numbers.
Sample run:
Enter integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
Note that if a number occurs more than one time, the plural word “times” is used in
the output.
*/
import java.util.*;
public class CountingNonStop {

    public static void readInputs(int[]counts){
        Scanner gb = new Scanner(System.in);
        int num;
        System.out.println("Enter integers between 1 and 100:");
        do{
            num = gb.nextInt();
            counts[num]++;
        }while(num!=0);
        gb.close();
    }

    public static void displayCounts(int[]counts){
        for(int i=1;i<counts.length;i++){
            if(counts[i]==1){
                System.out.println(i+" occurs "+counts[i]+" time.");
            }
            else if(counts[i]>1){
                System.out.println(i+" occurs "+counts[i]+" times.");
            }
        }
    }
    public static void main(String[] args) {
        int[]A = new int[101];

        readInputs(A);
        displayCounts(A);
    }
}
