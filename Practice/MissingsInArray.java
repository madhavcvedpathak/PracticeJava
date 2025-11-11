package Practice;

import java.util.Scanner;

public class MissingsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
//----------------------------------------------------------
        System.out.print("Enter elements: ");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
//-----------------------------------------------------------
        System.out.print("Missing Elements: ");
        boolean missingFound = false;
        for (int i = 1; i <= max; i++){
            boolean found = false;

            for (int j = 0; j < n; j++){
                if (arr[j] == i){
                    found = true;
                    break;
                }
            }
            if (!found){
                System.out.print(i + " ");
                missingFound = true;
            }
        }

        if (!missingFound){
            System.out.print("None");
        }
        System.out.println();
        sc.close();
    }
}
