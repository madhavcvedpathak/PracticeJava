package Java100.Recursion;

public class FindLargestElementOfTheArray {
//    static int arr[] = {10, 324, 45, 90, 98}; // Method to find maximum element in arr[]
//    static int largest() {
//        int i;
//        int max = arr[0]; // Initialize maximum element
//        for (i = 1; i < arr.length; i++)
//            if (arr[i] > max) max = arr[i];
//        return max;
//    }
//    public static void main(String[] args) {
//        System.out.println("Largest in given array is " + largest());
//    }


    static int arr[] = {10, 32, 45, 90, 98};
    static int largest() // Method to find maximum in arr[]
    {
        int i;
        int max = arr[0]; // Initialize maximum element
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max) max = arr[i];
        return max;
    }
    public static void main(String[] args)
    {
        System.out.println("Largest in given array is " + largest());
    }

}
//OP: Largest in given array is 324