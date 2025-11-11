package Practice.set1;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        int n, range, count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //rock samples, each with a size in ppm.
        range = sc.nextInt(); //ranges that the lab accepts.

        int arr[] = new int[n];

        //Read array values
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        range = range * 2; // Double the range as per the original code logic
// To store the counts in one line
        StringBuilder op = new StringBuilder();

        for (int i = 0; i < range; i=i+2){
            int arrange[] = new int[range];
            arrange[i] = sc.nextInt();
            arrange[ i + 1] = sc.nextInt();
// Count numbers that fall within the range
            for (int j = 0; j < n; j++){
                if ((arr[j] >= arrange[i]) && (arr[i] <= arrange[i+1])){
                    count++;
                }
            }

            // Append the count to output
            op.append(count).append(" ");
            count = 0; // Reset count for the next range
        }
        System.out.println(op.toString().trim());
    }
}
//Juan Marquinhos is a geologist and he needs to count rock samples to send them to a chemical laboratory.
// He has a problem: The laboratory only accepts rock samples in a range of its size in ppm (parts per million).
//
//Juan Marquinhos receives the rock samples one by one and he classifies the rock
// samples according to the range of the laboratory.
// This process is very hard because the number of rock samples may be in the millions.
//
//Juan Marquinhos needs your help, your task is to develop a program to get the number
// of rocks in each of the ranges accepted by the laboratory.
//
//Input Format
//
//A positive integer S (the number of rock samples) separated by a blank space,
// and a positive integer R (the number of ranges of the laboratory); A list of the sizes of S samples (in ppm),
// as positive integers separated by space R lines where the ith line containing two
// positive integers, space separated,
// indicating the minimum size and maximum size respectively of the ith range.
//
//Output Format
//
//R lines where the ith line
// contains a single non-negative integer indicating the number of the samples which lie in the ith range.
//
//Constraints
//
//10 < S < 10000
//1 < R < 1000000
//1 size of each sample (in ppm) <  1000
//Example 1
//
//Input: 10 2
//345 604 321 433 704 470 808 718 517 811
//300 350
//400 700
//
//Output: 2 4
//
//Explanation:
//
//There are 10 samples (S) and 2 ranges ( R ). The samples are 345 604 321 433 704 470 808 718 517 811.
// The ranges are 300-350 and 400-700. There are 2 samples in the first range (345 and 321) and
// 4 samples in the second range (604, 433, 470, 517).
// Hence the two lines of the output are 2 and 4