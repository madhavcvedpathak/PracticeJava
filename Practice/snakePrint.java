package Practice;

import java.util.ArrayList;

public class snakePrint {
    public static void main(String[] args) {
        int[][] arr={{12,14,15,16},
                    {13,34,55,44},
                    {12,90,76,87},
                    {34,45,67,34}
        };

        ArrayList<Integer> output = snakePattern(arr);

        System.out.println("Snake Pattern traversal: ");
        for(int val : output){
            System.out.print(val + " ");
        }
    }

    static ArrayList<Integer> snakePattern(int arr[][]){
        ArrayList<Integer> result = new ArrayList<>();

        int N = arr.length;

        for(int i = 0; i < N; i++){
            if (i % 2 ==0){
                //even row
                for (int j=0; j < N; j++){
                    result.add(arr[i][j]);
                }
            } else{
                //odd row
                for (int j = N-1; j >= 0; j--){
                    result.add(arr[i][j]);
                }
            }
        }
        return result;
    }
}
//Snake Pattern traversal:
//        12 14 15 16 44 55 34 13 12 90 76 87 34 67 45 34