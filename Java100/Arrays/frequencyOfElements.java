package Java100.Arrays;
import java.util.Arrays;

public class frequencyOfElements {
    public static void countFreq(int arr[], int n)
    {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        // Traverse through array elements and count frequencies
        for (int i = 0; i < n; i++) {
            if (visited[i] == true) // Skip this element if already processed
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count +" times ");
        }
    }


    static void countFrequency(int[] arr, int n)
    {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++)
        {
            int count = 1;
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            System.out.println(arr[i] + ": " + count);
            count++;
        }
    }


    public static void main (String[] args) {
        int[] arr = {5, 8, 5, 7, 8, 10};
        int size = arr.length;
        countFrequency(arr, size);
    }
}
