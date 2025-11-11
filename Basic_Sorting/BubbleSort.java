package Basic_Sorting;

public class BubbleSort {
    public static void print(int[] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,-2,6,7,2,0,7,2};
        int n = arr.length;
        print(arr);
        System.out.println();
//Approach 1
//        for (int j = 0; j < n - 1; j++){ //n-1 passes
//            for (int i = 0; i < n-1; i++){
//                if (arr[i] > arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1]=temp;
//                }
//            }
//        }
//        print(arr);


//Approach 2
        for (int i = 0; i < n - 1; i++){ //n-1 passes( time complexity O(n)best case)
            int swaps = 0;
            for (int j = 0; j < n-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            if (swaps==0) break;
        }
        print(arr);
        
//H.W sort in dec
    }
}
