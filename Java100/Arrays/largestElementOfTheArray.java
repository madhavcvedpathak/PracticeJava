package Java100.Arrays;

public class largestElementOfTheArray {
    public static void main(String args[])
    {
        int arr[] = {12, 13, 1, 10, 34, 10};
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i]; //if 'curr' is greater than 'max' then max is that num.
            }
        }
        System.out.print(max);
    }
}
