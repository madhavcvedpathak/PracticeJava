package Practice.nqt;

public class SumOfArrayElements {
    static int arr[] = {12, 3, 4, 15};
    static int sum () // method for sum of elements in an array
    {
        int sum = 0; // initialize sum
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }

    public static void main (String[]args)
    {
        System.out.println("Sum of Given Array is : " + sum());
    }
}

