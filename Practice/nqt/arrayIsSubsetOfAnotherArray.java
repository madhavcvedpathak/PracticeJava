package Practice.nqt;
// Check if an array is subset of another array
// The very basic approach is to use two nested loops:
// the outer loop picks each element from b[], and the inner loop searches
// for this element in a[] and check for all elements in b[].
public class arrayIsSubsetOfAnotherArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7};
        int[] array2 = {2,4,5,6};

        if (isSubsett(array1,array2)){
            System.out.print("TRUE");
        } else {
            System.out.print("FALSE");
        }
    }

    public static boolean isSubsett(int[] array1, int[] array2) {
        int a1 = array1.length, a2 = array2.length;

        for (int i = 0; i < a2; i++){           // Run on array 2
            boolean found = false;              // Bool false to mark true when found
            for (int j = 0; j < a1; j++){       // Run on array 1
                if (array2[i] == array1[j]){    // If all ele of array 2 present array 1
                    found = true;               //true ELSE some missing false
                    array1[j] = -1;
                    break;
                }
            }
            if (!found) return false;       // If not found FALSE
        }
        return true;                        // If found TRUE.
    }
}
