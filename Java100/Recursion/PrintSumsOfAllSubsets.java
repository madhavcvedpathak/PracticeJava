package Java100.Recursion;

public class PrintSumsOfAllSubsets {
    static void subsetSums(int arr[], int n)
    {
        int total = 1 << n;
        for (int i = 0; i < total; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) != 0)
                    sum += arr[j];
            System.out.print(sum + " ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = new int[] { 5, 4, 3 };
        int n = arr.length;
        subsetSums(arr, n);
    }



//    static void subsetSums(int[] arr, int l, int r, int sum)
//    {
//        if (l > r) {
//            System.out.print(sum + " ");
//            return;
//        }
//        subsetSums(arr, l + 1, r, sum + arr[l]);
//        subsetSums(arr, l + 1, r, sum);
//    }
//    public static void main(String[] args)
//    {
//        int[] arr = { 5, 4, 3 };
//        int n = arr.length;
//        subsetSums(arr, 0, n - 1, 0);
//    }


}
