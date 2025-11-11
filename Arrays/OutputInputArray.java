package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int [] arr = {1,-8,45,67,75,45,3,6,78,34,67,45,34,33};
//        //print length of array
//        System.out.println("Length Of Array: "+arr.length); // -0 to n-1
//        //using for loop to print
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]+" ");
//        }

        int[] Raghav = new int[7];
        //default values
        for (int i = 0; i < 7; i++){

            System.out.println(Raghav[i]+" ");
        }
        //input
        for (int i = 0; i < 7; i++ ){
            System.out.println("Enter Array Data :");
            Raghav[i] = sc.nextInt();
        }
        //print
        for (int i = 0; i < Raghav.length; i++ ){
            System.out.println("Array Data : "+Raghav[i]+" ");
        }


    }
}
