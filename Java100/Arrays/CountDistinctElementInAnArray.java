package Java100.Arrays;
import java.util.Arrays;

public class CountDistinctElementInAnArray {
    public static void countFreq(int arr[], int n)
    {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        int count_dis=0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;      // Skip this element if already processed

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                }
            }
            count_dis = count_dis+1;
        }
        System.out.println(count_dis);
    }

    public static void main(String []args)
    {
        int arr[] = new int[]{10, 30, 40, 20, 10, 20, 50, 10};
        int n = arr.length;
        countFreq(arr, n);
    }
}
