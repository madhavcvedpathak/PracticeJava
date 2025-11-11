package Practice.nqt;
// Array Reverse
//The idea is to maintain two pointers: left and right, such that left points at
// the beginning of the array and right points to the end of the array.
//
//While left pointer is less than the right pointer, swap the elements at
// these two positions. After each swap, increment the left pointer and decrement
// the right pointer to move towards the center of array. This will swap all the
// elements in the first half with their corresponding element in the second half.
public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        reverseArray(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1; // Two left & right pointers

        while (left < right){ // Swap the elements at left and right position
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++; //Increment left
            right--; //Decrement right
        }
    }
}

//Input: arr[] = [1, 4, 3, 2, 6, 5]
//Output:  [5, 6, 2, 3, 4, 1]
//Explanation: The first element 1 moves to last position,
// the second element 4 moves to second-last and so on.