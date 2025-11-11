package Practice.nqt;
import java.util.Arrays;

public class AddanElementtoArray {
    public static int[] addX(int n, int arr[], int x)
    {
        int newarr[] = new int[n + 1];
        for (int i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;
        return newarr;
    }

    public static void main(String[] args)
    {
        int n = 5;
        int arr[] = { 10, 20, 30, 40, 50};
        int x = 70;

        arr = addX(n, arr, x);                  // call the method to add x in arr...
        System.out.println(Arrays.toString(arr));
    }
}
