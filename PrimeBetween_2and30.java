/*
Write a Java program that creates an integer array of size 10 and fills it with random
values between 2 and 30. Use methods to perform the following tasks:
1. A method to generate and store random values in the array:
public static void fillArray(int[] arr);
CO4
2. A method to print the array elements:
public static void printArray(int[] arr);
3. A method to check whether a number is prime:
public static boolean isPrime(int num);
4. A method to count the number of prime numbers in the array:
public static int countPrimes(int[] arr);
Use these methods in the main method to display the array and the total count of
prime numbers it contains.
*/

public class PrimeBetween_2and30 {

    public static void fillArray(int[]arr){
        for(int i=0;i<arr.length;i++)
            arr[i] = 2+(int)(Math.random()*(30-2+1));
    }

    public static void printArray(int[]arr){
        System.out.print("Array elements: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
    }

    public static boolean isPrime(int num){
        for(int i=2;i<=(int)(Math.sqrt(num));i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static int countPrimes(int[]arr){
        int c = 0;
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i]))
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        int[]arr = new int[10];
        fillArray(arr);
        printArray(arr);
        System.out.println("Number of prime numbers in the array: "+countPrimes(arr));
    }
}
