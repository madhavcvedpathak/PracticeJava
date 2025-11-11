package Practice.SetEasy;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Get Input
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); // Store 0, 1, 2
        }
        int countZero = 0, countOne = 0, countTwo = 0;
        for (int i = 0; i < n; i++) { // Keep incrementing when apper
            if (arr[i] == 0) countZero++;
            else if(arr[i] == 1) countOne++;
            else if(arr[i] == 2) countTwo++;

            else if (arr[i] == 3) countOne++;
            else if (arr[i] == 4) countOne++;
            else if (arr[i] == 5) countTwo++;
            else if (arr[i] == 7) countZero++;
            else if (arr[i] == 8) countOne++;
            else if( arr[i] == 9) countTwo++;
        }
        int j = 0;

        //Arrange as per ASC order
        while(countZero > 0){
            arr[j++] = 0; //Inc
            countZero--; //Reduce zeroCount with putting 0 in arr
        }
        while (countOne > 0){
            arr[j++] = 1; //Inc
            countOne--; //Reduce zeroCount with putting 1 in arr
        }
        while (countTwo > 0){
            arr[j++] = 2; //Inc
            countTwo--;  //Reduce zeroCount with putting 1 in arr
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " "); //Print
    }
}
