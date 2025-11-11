package Practice.nqt;
//Rotate an Array by d - Counterclockwise or Left
public class rotateArrayClockwise {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2; // 2 rotations
        rotateTheArray(arr, d);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    static void rotateTheArray(int[] arr, int d) {
        int n = arr.length;
        for (int i = 0; i < d; i++){        // Rotate 'd' times.
            int first = arr[0];             // Save the first element.
            for (int j = 0; j < n - 1; j++) // Shift all elem left.
                arr[j] = arr[j + 1];        // Put the saved first elem at the end.

            arr[n - 1] = first;             // Repeat 'd' times.
        }
    }
}
