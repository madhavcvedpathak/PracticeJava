package Practice.set1;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();    // Number of rooms.
        int K = sc.nextInt();   // Target sum of coins.
        int[] coins = new int[N];

        for (int i = 0; i < N; i++){
            coins[i] = sc.nextInt();
        }

        int start = 0, end = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += coins[i];  // add current room's coins
            end = i;

            // Shrink the window from the left until sum <= K
            while (sum > K && start <= i) {
                sum -= coins[start];
                start++;
            }

            // Check if we found the exact sum
            if (sum == K) {
                System.out.println((start + 1) + " " + (end + 1)); // 1-based indexing
                return;  // stop after first solution
            }
        }

    }
}
//You are in a golden house with N rooms.
//
//Each room has some gold coins.
//
//You want to collect exactly K coins by walking through some continuous rooms.
//
//Rules:
//
//You enter a room, you must take all coins in that room.
//
//You cannot skip coins in a room.
//
//You can only move forward through consecutive rooms.
//
//You must start and end in a room (choose two rooms).
//
//Goal:
//
//Find the starting and ending room numbers such that the total coins collected = K.
//
//If multiple answers exist, choose the one with the smallest starting room number.
//
//Example 1
//
//Input:
//
//10 15
//5 3 7 14 18 1 18 4 8 3
//
//
//N = 10 rooms
//
//K = 15 coins
//
//Coins in rooms: [5, 3, 7, 14, 18, 1, 18, 4, 8, 3]
//
//Output:
//
//1 3
//
//
//Explanation:
//
//Rooms 1, 2, 3 → coins = 5 + 3 + 7 = 15 ✅
//
//Rooms 8, 9, 10 → coins = 4 + 8 + 3 = 15 ✅
//
//Choose smaller starting room → 1 3