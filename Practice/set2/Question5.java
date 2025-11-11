package Practice.set2;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();           // Read the number of houses

        int[] arr = new int[n];     // Read the value in each house into an array
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int incl = 0;            // Maximum sum including the current house
        int excl = 0;           // Maximum sum excluding the current house

        for (int i = 0; i < n; i++){        // Loop through each house to calculate the max sum
            int mx = Math.max(incl, excl);  // max value so far
            incl = excl + arr[i];           // If we include this house, we cannot include previous one
            excl = mx;                      // If we exclude this house, take the max of previous incl and excl
        }
        // The result is the max value of including or excluding the last house
        System.out.println(Math.max(incl, excl));
    }
}

//There are n houses built in a line, each of which contains some value in it.
//
//A thief is going to steal the maximal value of these houses,
// but he can’t steal in two adjacent houses because the owner of the stolen
// houses will tell his two neighbours left and right side.
//
//What is the maximum stolen value?
//
//Input Format
//
//First an integer n, denoting how many houses are there.
//Then n space separated integers denoting the values for the n houses.
//Output Format
//
//An integer denoting the maximum value possible to steal.
//
//Input
//
//7
//
//6 7 1 3 8 2 5
//
//Output
//
//20
//
//Explanation
//
//6+1+8+5 = 20.
//
//It is the max possible value.

