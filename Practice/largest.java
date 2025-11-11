package Practice;
public class largest {
    public static void main(String[] args) {
        int[] arr = { 10, 324, 45, 90, 9808 };
        System.out.println(largestcheck(arr));
    }
    static int largestcheck(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max) // if curr ele of i idx is max then max = arr[i]
                max = arr[i];
        }
        return max;
    }
}
