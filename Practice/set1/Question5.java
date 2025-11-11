package Practice.set1;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Board = new int[n]; // board position
        int jarr[] = new int[n]; // stud jerseys

        for (int i = 0; i < n; i++) {
            Board[i] = sc.nextInt();
            jarr[i] = i + 1; // initial order of jerseys
        }
        int ans = 0; // use it  as count

        while (true){
            ans++;
            int ar[] = new int[n];
            for (int i = 0; i < n; i++){
                ar[i] = jarr[Board[i]-1]; // student moves to board position
            }

            boolean isSorted = true;
            for (int i = 0; i < n; i++){
                if (ar[i] != i + 1 ){
                    isSorted = false;
                    break;
                }
            }
            if (isSorted) break;
            jarr = ar;
        }
        System.out.println(ans);
    }
}
//The Game:
//
//Initially, students stand in the order of their jersey numbers from left to right.
//
//When the drum beats, each student moves to the position indicated by the board they are currently at.
//
//Example: If student #1 is standing at a board numbered 2, he moves to position 2.
//
//After every beat, all students move simultaneously to the new positions based on the board.
//
//The process repeats until all students are back in their original order (1, 2, 3, ..., N).
//
//Goal:
//
//You are asked to find the **number of drum beats** required to get all students back to their original positions.