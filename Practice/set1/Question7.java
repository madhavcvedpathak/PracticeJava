package Practice.set1;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        //Creates an integer array arr of size n.
        //Then fills it with n numbers (0s, 1s, and 2s) from user input.
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int countZero = 0, countOne = 0, countTwo = 0;
        //know exactly how many 0s, 1s, and 2s exist
        for (int i = 0; i < n; i ++){
            if (arr[i] == 0)
                countZero++;
            else if (arr[i] == 1) {
                countOne++;
            } else if (arr[i] == 2) {
                countTwo++;
            }
        }

        int j = 0;
        while (countZero > 0){
            arr[j++] = 0;
            countZero--;
        }
        while (countOne > 0){
            arr[j++] = 1;
            countOne--;
        }
        while (countTwo > 0){
            arr[j++] = 2;
            countTwo--;
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
//At the security checkpoint, airport security personnel have seized a number
// of travellers’ belongings. Everything has been thrown into a big box (array).
// Each product carries a specific level of risk[0,1,2].
// The risk severity of the items in this case is represented by an array[] of
// N integer values.
// Sorting the elements in the array according to the degrees of danger is the
// task at hand.
// Between 0 and 2 are the risk values.
//
//Example :
//
//Input :
//
//7  -> Value of N
//
//[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input
// each element is separated by new line.
//
//Output :
//
//0 0 0 1 1 2 2  -> Element after sorting based on risk severity
//
//Example 2:
//
//input : 10  -> Value of N
//
//[2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each element
// separated by a new line.
//
//Output :
//
//0 0 0 0 1 1 1 2 2 2  ->Elements after sorting based on risk severity.
//
//Explanation:
//
//In the above example, the input is an array of size N consisting of only 0’s,
// 1’s and 2s.
// The output is a sorted array from 0 to 2 based on risk severity.