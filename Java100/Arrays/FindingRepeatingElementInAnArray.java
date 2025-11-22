package Java100.Arrays;
import java.util.Arrays;

public class FindingRepeatingElementInAnArray {
    public static void countFreq(int arr[], int n)
    {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {   // Traverse through array elements and count frequencies.
            if (visited[i] == true)     // Skip this element if already processed.
                continue;

            int count = 1;              // Count frequency.
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if(count!=1)
                System.out.println(arr[i]);
        }
    }
    public static void main(String []args)
    {
        int arr[] = new int[]{10, 30, 30, 20, 10, 20, 50, 10};
        int n = arr.length;
        countFreq(arr, n);
    }
//-------------------------------------------------------------------------------
    static int bubbleSort(int arr[], int size){
        for (int i = 0; i < size-1; i++){
            // Since, after each iteration righmost i elements are sorted
            for (int j = 0; j < size-i-1; j++)
                if (arr[j] > arr[j+1]){
                    int temp = arr[j]; // swap the element
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
        }
        return 0;
    }
//------------------------------------------------------------------------------
    static void findRepeating(int arr[], int n){
        int count = 0;
        for (int i = 0; i < n; i++) {
            int flag = 0;
            while (i < n - 1 && arr[i] == arr[i + 1]){
                flag = 1;
                i++;
            }
            if(flag==1)
                System.out.print(arr[i-1] + " ");
            // since i++ happened, we need to print previous element
        }
    }
//-----------------------------------------------------------------------------
}
