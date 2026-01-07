public class ReverseArray {
    public static void fillArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = 50+(int)(Math.random()*(100-50+1));
        }
    }

    public static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    public static void reverseArray(int[]arr){
        int len = arr.length;
        for(int i=0;i<len/2;i++){
            int temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i] = temp;
        }
    }

    public static void main(String[] args) {
        int[]A = new int[10];
        fillArray(A);

        System.out.println("Original Array: ");
        printArray(A);

        System.out.println("Reversed Array:");
        reverseArray(A);
        printArray(A);
    }
}
