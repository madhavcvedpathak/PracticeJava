package Java100.Recursion;

public class FindSmallestElementOfTheArray {
    public static void main(String[] args) {
        int [] arr = new int [] {-5, 1, 7, 6, 3}; //Initialize array.
        int min = arr[0]; //Initialize min with first element of array.
        for (int i = 0; i < arr.length; i++) { //Loop through the array.
            if(arr[i] < min)
                min = arr[i]; //Compare elements of array with min
        }
        System.out.println("Smallest element present in given array: " + min);
    }
}
