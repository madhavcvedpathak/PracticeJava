package Practice.nqt;
public class ArrayAfterKrotations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;

        rotateClockWise(arr, k);
        for (int num : arr)
            System.out.print(num + " ");
    }

    static void rotateClockWise(int[] arr, int k) {
        if (k == 0 || arr.length == 0){
            return;
        }
        int n = arr.length;        // find length of array...

        int temp = arr[n - 1];      // store last val
        for (int i = n - 1; i > 0; i--){
            arr[i] = arr[i - 1];    // shuffle arr[i - 1] to arr[i]
        }
        arr[0] = temp;              // put store val in first pos

        rotateClockWise(arr, k - 1);     // recursive call for k - 1
    }
}


//Given an array arr[] and an integer k, rotate the array in place k times to
// the right (clockwise). In each rotation, the last element moves to the front,
// and all other elements shift one position to the right. Modify the array in place,
// do not return anything.
//
//Examples :
//
//Input: arr[] = [1, 2, 3, 4, 5, 6], k = 2
//Output: [5, 6, 1, 2, 3, 4]
//Explanation:
//=> We perform 2 right rotations (since k = 2):
//
//After 1st rotation: Last element moves to front → [6, 1, 2, 3, 4, 5]
//After 2nd rotation: Again, last element to front → [5, 6, 1, 2, 3, 4]