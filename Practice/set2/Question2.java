package Practice.set2;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int T = sc.nextInt(); // number of test cases

        for (int t = 0; t < T; t++) {
            System.out.println("\n--- Test Case " + t + " ---");
            System.out.print("Enter number of candy boxes: ");
            int N = sc.nextInt(); // number of boxes

            PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // min-heap for smallest values

            System.out.println("Enter the number of candies in each box:");
            for (int i = 0; i < N; i++) {
                int candies = sc.nextInt(); // read candies in a box
                minHeap.add(candies); // add to heap
            }

            int totalTime = 0; // total time to merge boxes
            // merge boxes until only one remains
            while (minHeap.size() > 1) {
                int first = minHeap.poll(); // smallest box
                int second = minHeap.poll(); // next smallest box
                int mergeTime = first + second; // time to merge them

                totalTime += mergeTime; // add to total time
                minHeap.add(mergeTime); // add merged box back to heap
            }
            System.out.println("Minimum time required to collect all candies: " + totalTime + " seconds");
        }
    }
}

//Krishna loves candies a lot, so whenever he gets them,
// he stores them so that he can eat them later whenever he wants to.
//
//He has recently received N boxes of candies each containing Ci
// candies where Ci represents the total number of candies in the ith box.
// Krishna wants to store them in a single box.
// The only constraint is that he can choose any two boxes and store their joint
// contents in an empty box only. Assume that there are an infinite number of
// empty boxes available.
//
//At a time he can pick up any two boxes for transferring and if both the
// boxes contain X and Y number of candies respectively, then it takes him exactly
// X+Y seconds of time. As he is too eager to collect all of them he has
// –approached you to tell him the minimum time in which all the candies can be collected.
//
//
//
//Input Format:

//The first line of input is the number of test case T
//Each test case is comprised of two inputs
//The first input of a test case is the number of boxes N
//The second input is N integers delimited by whitespace
// denoting the number of candies in each box
//Output Format: Print minimum time required, in seconds, for each of the test cases.
// Print each output on a new line.
//
//Constraints:
//1 <T<10
//1 <N<10000
//1 < [Candies in each box] < 100009
//Input :
//
//1
//
//4
//
//1 2 3 4
//
//Output :
//
//19
//
//Explanation :
//
//4 boxes, each containing 1, 2, 3 and 4 candies respectively.
// Adding 1 + 2 in a new box takes 3 seconds.
// Adding 3 + 3 in a new box takes 6 seconds.
// Adding 4 + 6 in a new box takes 10 seconds.Hence total time taken is 19 seconds.
// There could be other combinations also, but overall time does not go below 19 seconds.