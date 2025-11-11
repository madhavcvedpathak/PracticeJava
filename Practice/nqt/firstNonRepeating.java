package Practice.nqt;
public class firstNonRepeating {
    public static void main(String[] args) {
        int arr[] = { 9, 4, 9, 6, 7, 4 };
        int n = arr.length;
        System.out.println(firstNonRep(arr, n ));
    }
    private static int firstNonRep(int[] arr, int n) {
        for (int i = 0; i < n; i++){
            int j;
            for (j = 0; j < n; j++){
                if (i != j && arr[i] == arr[j])
                    //arr[i] == arr[j] → checks if two different
                    // elements have the same value.
                    break;
            }
            if (j==n)
                return arr[i];
        }
        return -1;
    }
}
