package Basic_Sorting;

public class SelectionSort {

    // Function to print array
    public static void print(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;

        System.out.println("Original Array:");
        print(arr);

        // Selection Sort logic
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Find index of smallest element in the remaining part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            //print(arr);
        }
        System.out.println("Sorted Array:");
        print(arr);
    }
}

