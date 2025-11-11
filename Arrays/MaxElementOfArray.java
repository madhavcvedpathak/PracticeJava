package Arrays;

import java.util.Scanner;

public class MaxElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

        }

        //print array max elements
        int max = arr[0];
        System.out.print("Array Elements : ");
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println(max);



    }
}
