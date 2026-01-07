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
