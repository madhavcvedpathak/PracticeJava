package Basic_Sorting;
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    // Main method for testing
    public static void main(String[] args) {
        int[] a = {3, 4, 2, 2, 4};
        int[] b = {3, 2, 2, 7};

        ArrayList<Integer> common = commonElements(a, b);
        System.out.println("Common Elements: " + common);  // Output: [2, 2, 3]
    }

    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        Arrays.sort(a);  // Sort array a
        Arrays.sort(b);  // Sort array b

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                result.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }
}
