package Practice.nqt;
import java.util.*;

public class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(getSecondLargest(arr));
    }

    static int getSecondLargest(int[] arr) {
        int n = arr.length; //Get length of arr
        Arrays.sort(arr); //Sort arr
        for (int i = n - 2; i >= 0; i--){//start from last, as largest is last one in sort
            if (arr[i] != arr[n - 1]){
                return arr[i]; // return the first element which is not equal to the
                // largest element
            }
        }
        return -1;
    }
}
