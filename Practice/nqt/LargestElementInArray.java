package Practice.nqt;

public class LargestElementInArray {
    public static void main(String[] args) {
        int [] arr = {10,22,43,40};
        System.out.print("Largest : " + largestt(arr));
    }

    static int largestt(int[] arr) {
        int max = arr[0]; // Keep first as max

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){ //if curr is greater than max
                max = arr[i]; // max = arr[curr]
            }
        }
        return max; //return max
    }
}
