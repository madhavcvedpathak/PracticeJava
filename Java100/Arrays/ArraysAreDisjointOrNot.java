package Java100.Arrays;

// Two arrays are said to be disjoint if the intersection of the array is empty.
public class ArraysAreDisjointOrNot {
    static boolean Disjoint(int arr1[], int arr2[])
    {
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main (String[] args)
    {
        int arr1[] = {10, 51, 3, 43, 6};
        int arr2[] = {80, 71, 29, 3}; // Not disjoint. (3 is in both the arrays).

        if (Disjoint(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
