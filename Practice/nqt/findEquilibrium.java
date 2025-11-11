package Practice.nqt;
//Given an array arr[] of size n, the task is to return an equilibrium index (if any)
// or -1 if no equilibrium index exists. The equilibrium index of an array is an
// index such that the sum of all elements at lower indexes equals the sum of all
// elements at higher indexes.
//
//Note: When the index is at the start of the array, the left sum is 0, and when
// it's at the end, the right sum is 0.
public class findEquilibrium {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibriumm(arr));
    }

    static int findEquilibriumm(int[] arr) {
        int n = arr.length;

        int[] pref = new int[n];
        int[] suff = new int[n];

        // Initialize the ends of prefix and suffix array
        pref[0] = arr[0];
        suff[n - 1] = arr[n - 1];

        // Calculate prefix sum for all indices
        for (int i = 1; i < n; i++)
            pref[i] = pref[i - 1] + arr[i];

        // Calculating suffix sum for all indices
        for (int i = n - 2; i >= 0; i--)
            suff[i] = suff[i + 1] + arr[i];

        // Checking if prefix sum is equal to suffix sum
        for (int i = 0; i < n; i++){
            if (pref[i] == suff[i]){
                return i;
            }
        }
        return -1;
    }
}
