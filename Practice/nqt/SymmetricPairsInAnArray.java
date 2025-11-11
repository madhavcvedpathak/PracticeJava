package Practice.nqt;
import java.util.ArrayList;
import java.util.List;
//The idea is to compare each pair with every other pair to check for symmetry.
// The thought process is to use two nested loops to traverse all possible pairs
// and verify if arr[i][0] == arr[j][1] and arr[i][1] == arr[j][0]. If a match is
// found, we store the pair in the result.

public class SymmetricPairsInAnArray {
    public static void main(String[] args) {
        int[][] arr = {{5, 8}, {7, 9}, {8, 5}, {9, 7},{6, 10}};
        int[][] result = findSymmetricPairs(arr);

        print2dArray(result);
    }

    static int[][] findSymmetricPairs(int[][] arr) {
       int n = arr.length;
        List<int[]> result = new ArrayList<>(); // arraylist to store result.

        for (int i = 0; i < n; i++){ // Outer loop
            for (int j = i + 1; j < n; j++){
                // Inner loop to compare every pair with next
                if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]){
                    result.add(arr[i]);
//                  If a match is found, we store the pair in the result.
                }
            }
        }
        return result.toArray(new int[result.size()][]); //return arrayList
    }

    static  void  print2dArray(int arr[][]){
        for (int[] pair : arr){
            System.out.print("[" + pair[0] + "," + pair[1] + "] ");
        }
        System.out.println();
    }
}
