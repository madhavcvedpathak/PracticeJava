package Practice.nqt;
import java.util.ArrayList;
// Counting Rock Samples | TCS Codevita 2020
// Problem Statement: Given an array samples[] denoting sizes of rock samples and a
// 2D array ranges[], the task is to count the rock samples that are in the range
// ranges[i][0] to ranges[i][1], for every possible 1 <= i <= N.
//Examples:
//
//Input: samples[] = {345, 604, 321, 433, 704, 470, 808, 718, 517, 811},
// ranges[] = {{300, 380}, {400, 700}}
//Output: 2 4
//Explanation:
//Range [300, 380]: Samples {345, 321} lie in the range. Therefore, the count is 2.
//Range [400, 700]: Samples {433, 604, 517, 470} lie in the range.
// Therefore, the count is 4.
public class CountingRockSamples {
    public static void main(String[] args) {
        int n = 5; // num of samples
        int r = 2; // num of ranges (i.e 2 ranges { 300, 380 }, { 800, 1000 })
        int[] arr = { 400, 567, 890, 765, 987 };
        int[][] ranges = { { 300, 380 }, { 800, 1000 } };

        ArrayList<Integer> ans = new ArrayList<>();
        ans = findRockSample(ranges, n, r, arr);    //store found count in ans arraylist

        for (int i = 0; i < ans.size(); i++){
            System.out.println(ans.get(i) + " "); // print ans arraylist
        }
        System.out.println();
    }

    static ArrayList<Integer> findRockSample(int[][] ranges, int n, int r, int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < r; i ++){ //Outer loop, iterate over each range
            int count = 0;         //count var
            int l = ranges[i][0]; //lower limit
            int h = ranges[i][1];//upper limit

            for (int j = 0; j < arr.length; j++){ //Inner loop, check each rock sample
                if (l <= arr[j] && arr[j] <= h){ //Goes through every rock sample in arr.
                    //Checks if it lies within the current range [l, h].
                    count += 1;         //If yes, increments the count c.
                }
            }
            res.add(count); //add count in res array
        }
        return res;  //return result
    }
}
// John is a geologist, and he needs to count rock samples in order to send it to
// a chemical laboratory. He has a problem. The laboratory only accepts rock samples
// by a range of sizes in ppm (parts per million). John needs your help.
// Your task is to develop a program to get the number of rocks in each range
// accepted by the laboratory.
