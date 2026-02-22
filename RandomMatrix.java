/*
Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix,
and finds the first row and column with the most 1s.
 */
public class RandomMatrix {
    public static void fillArray(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = 0+(int)(Math.random()*(1-0+1));
            }
        }
    }

    public static void displayArray(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int maxRow(int[][]arr){
        int idx=-1, count=0;
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    c++;
                }
            }
            if(c>count){
                count = c;
                idx = i;
            }
        }
        return idx;
    }

    public static int maxColumn(int[][]arr){
        int idx=-1, count=0;
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[j][i]==1){
                    c++;
                }
            }
            if(c>count){
                count = c;
                idx = i;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[][]A = new int[4][4];
        fillArray(A);
        System.out.println("Elements of matrix are:");
        displayArray(A);
        System.out.println("The largest row index: "+maxRow(A));
        System.out.println("The largest column index: "+maxColumn(A));
    }
}
