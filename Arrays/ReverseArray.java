package Arrays;
import java.util.Arrays;

class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original array: " + Arrays.toString(arr));

        // Reverse logic
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
//🔁Swap arr[0] and arr[4]:
//   Swap: 10 ↔ 50
