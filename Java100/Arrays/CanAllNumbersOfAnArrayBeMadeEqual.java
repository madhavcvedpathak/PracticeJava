package Java100.Arrays;

public class CanAllNumbersOfAnArrayBeMadeEqual {
    public static boolean make_equal(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            while (arr[i] % 2 == 0)  // Divide number by 2
                arr[i] /= 2;

            while (arr[i] % 3 == 0)  // Divide number by 3
                arr[i] /= 3;
        }
        for (int i = 1; i < n; i++)  // Remaining numbers
            if (arr[i] != arr[0]){
                return false;
            }
        return true;
    }

    public static void main (String[] args)
    {
        int arr[] = { 50, 100, 75 };
        int m = arr.length;
        if (make_equal(arr, m))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
