package Practice;
import java.util.Scanner;
import java.util.Arrays;
public class kthLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("K ? ");
        int k = sc.nextInt();
        Arrays.sort(arr);

       int kth = arr[n - k];
       System.out.println(kth);
    }
}
