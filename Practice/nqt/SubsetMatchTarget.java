package Practice.nqt;
import java.util.Scanner;

public class SubsetMatchTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Target? : ");
        int target = sc.nextInt();

        if (isSubsettFind(arr, n, target)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isSubsettFind(int[] arr, int n, int target) {
        if (target == 0) return true;   // subset found
        if (n == 0) return false;       // no elements left to check

        // if last element is greater than target, skip it
        if (arr[n - 1] > target)
            return isSubsettFind(arr, n - 1, target);

        // either include or exclude the current element
        return isSubsettFind(arr, n - 1, target) ||
                isSubsettFind(arr, n - 1, target - arr[n - 1]);
    }
}

//Input:
//
//5
//3 34 4 12 5
//Target? : 9

//Recursion steps:
//
//Include 5 → new target = 9 - 5 = 4
//
//Now can we form 4 using {3, 34, 4, 12}?
//✅ Yes, {4} works.
//
//Output:
//Yes
