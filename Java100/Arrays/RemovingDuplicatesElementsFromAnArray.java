package Java100.Arrays;

public class RemovingDuplicatesElementsFromAnArray {
    static int removeDuplicates(int arr[], int n)
    {
        if (n==0 || n==1)
            return n;
        int j = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
        arr[j++] = arr[n-1];

        return j;
    }
    public static void main (String[] args)
    {
        int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
        int n = arr.length;
        n = removeDuplicates(arr, n);
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }



//    public static void main(String[] args) {
//        int[] arr = {3, 1, 2, 3, 2, 4, 1, 5};
//        int n = arr.length;
//
//        int[] temp = new int[n]; // store unique elements
//        int j = 0;
//
//        for (int i = 0; i < n; i++) {
//            boolean duplicate = false;
//            for (int k = 0; k < j; k++) {
//                if (arr[i] == temp[k]) {
//                    duplicate = true;
//                    break;
//                }
//            }
//            if (!duplicate) {
//                temp[j] = arr[i];
//                j++;
//            }
//        }
//        System.out.print("Array after removing duplicates: ");
//        for (int i = 0; i < j; i++) {
//            System.out.print(temp[i] + " ");
//        }
//    }
}
