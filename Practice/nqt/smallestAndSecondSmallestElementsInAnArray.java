package Practice.nqt;
import java.util.ArrayList;
import java.util.*;

public class smallestAndSecondSmallestElementsInAnArray {
    public static void main(String[] args) {
        int[] arr = {12, 25, 8, 55, 10, 33, 17, 11};
        ArrayList<Integer> res = minAnd2ndmin(arr);
        System.out.println("Smallest and second smallest elements in an array...");
        for (int num : res) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> minAnd2ndmin(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        int mini = arr[0];
        int secmini = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){ //first number greater than mini
            if (arr[i] != mini){
                secmini = arr[i];
                break;
            }
        }

        if (secmini == Integer.MIN_VALUE){ //if second minimum doesn't exist
            ArrayList<Integer> res = new ArrayList<>();
            res.add(-1);
            return res;
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(mini);
        res.add(secmini);
        return res; // return result as ArrayList
    }
}
