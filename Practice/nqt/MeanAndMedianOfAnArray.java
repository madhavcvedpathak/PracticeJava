package Practice.nqt;
import java.util.Arrays;
//Given an array arr[] of positive integers, find the Mean and Median,
// and return the floor of both values.
//
//Note: Mean is the average of all elements in the array and Median is the
// middle value when the array is sorted, if the number of elements is even,
// it's the average of the two middle values.
public class MeanAndMedianOfAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 8};

        int meanValue = mean(arr);
        int medVal = median(arr);
        System.out.println("Mean : " + meanValue);
        System.out.println("Median : " + medVal);
    }

    public static int median(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);       // Sort array
        int res = 0;            // Result var

        if (n % 2 == 0){        //Case 1: n % 2 == 0 → even number of elements
            res = (arr[n / 2] + arr[(n - 2) - 1]) / 2;
        } else {                //Case 2: n % 2 != 0 → odd number of elements
            res = arr[n / 2];
        }
        return res;             // Return result
    }

    public static int mean(int[] arr) {
        int sum = 0;
        for (int num : arr){
            sum += num;
            //adding all elements of the array and dividing the sum by the total
            // number of elements.
        }
        return sum / arr.length;
    }
}
