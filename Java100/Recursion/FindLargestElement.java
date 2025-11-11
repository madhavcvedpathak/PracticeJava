package Java100.Recursion;

//Recursive Program to find Largest Element of the array in Java.
public class FindLargestElement {
//    static int arr[] = {10, 324, 45, 90, 98}; // Method to find maximum element in arr[].
//    static int largest() {
//        int i; // Initialize maximum element
//        int max = arr[0];
//        // Traverse array elements from second and compare every element with current max.
//        for (i = 1; i < arr.length; i++)
//            if (arr[i] > max) max = arr[i];
//        return max;
//    }
//    public static void main(String[] args) {
//        System.out.println("Largest in given array is " + largest());
//    }



    static int arr[] = {10, 32, 45, 90, 98}; // Method to find maximum in arr[]
    static int largest()
    {
        int i;
        int max = arr[0];  // Initialize maximum element

        // Traverse array elements from second and compare every element with current max
        for (i = 1; i < arr.length; i++)                        if (arr[i] > max)
            max = arr[i];
        return max;
    }
    public static void main(String[] args)
    {
        System.out.println("Largest in given array is " + largest());
    }





}
//Largest in given array is 324.