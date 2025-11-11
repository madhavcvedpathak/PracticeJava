package Basic_Sorting;

import java.util.ArrayList;

public class findUnion {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5};
        int[] b = {2, 3, 3, 6, 7};

        ArrayList<Integer> result = findUnion(a, b);

        System.out.println("Union of the arrays:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]){
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;

        while (i < n && j < m){
            // If both are equal
            if (a[i] == b[j]) {
                // Add if it's the first element or not a duplicate
                if (res.isEmpty() || res.get(res.size() - 1) != a[i])
                    res.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                // a[i] is smaller
                if (res.isEmpty() || res.get(res.size() - 1) != a[i])
                    res.add(a[i]);
                i++;
            }
            else {
                // b[j] is smaller
                if (res.isEmpty() || res.get(res.size() - 1) != b[j])
                    res.add(b[j]);
                j++;
            }
        }

        // Remaining elements in a[]
        while (i < n){
            if (res.isEmpty() || res.get(res.size() - 1) != a[i])
                res.add(a[i]);
            i++;
        }
        // Remaining elements in b[]
        while (j < m){
            if (res.isEmpty() || res.get(res.size() - 1) != b[j])
                res.add(b[j]);
            j++;
        }
        return res;
    }
}
