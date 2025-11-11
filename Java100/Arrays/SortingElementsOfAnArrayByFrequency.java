package Java100.Arrays;
import java.util.Arrays;

public class SortingElementsOfAnArrayByFrequency {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 6, 4, 4, 3, 2, 2, 2};
        int n = arr.length;

        // Step 1: Sort array so same elements are together
        Arrays.sort(arr);

        // Step 2: Count frequencies and store them with elements
        int[][] freqArr = new int[n][2]; // [element, frequency]
        int idx = 0;

        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            freqArr[idx][0] = arr[i];
            freqArr[idx][1] = count;
            idx++;
        }

        // Step 3: Sort by frequency (desc) and value (asc)
        Arrays.sort(freqArr, 0, idx, (a, b) -> {
            if (b[1] != a[1]) return b[1] - a[1]; // higher frequency first
            return a[0] - b[0]; // smaller number first
        });

        // Step 4: Print sorted elements by frequency
        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < freqArr[i][1]; j++) {
                System.out.print(freqArr[i][0] + " ");
            }
        }
    }
}
