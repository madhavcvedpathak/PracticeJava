package Practice;
public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;
        rotateArr(arr, d);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    private static void rotateArr(int[] arr, int d) {
        int n = arr.length;
        for (int i = 0; i < d; i++){
            int first = arr[0]; //Store the first element (it will move to the end)
            for (int j = 0; j < n - 1; j++){ //Shift all other elements one position to the left
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first; //Place the stored first element at the last position
        }
    }
}
