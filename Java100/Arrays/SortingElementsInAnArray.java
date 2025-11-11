package Java100.Arrays;

class bubble{
    public static void bubbleSortt(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

//public class SortingElementsInAnArray {
//    public static void bubbleSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//            }
//        }
//    }

//
//    public static void selectionSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            //swap(arr, i, minIndex);
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//    }
//    public static void swap(int[] arr, int a, int b) {
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//
//
//    public static void insertionSort(int[] arr) {
//        for (int i = 1; i < arr.length; i++) { int key = arr[i]; int j = i - 1; while (j >= 0 && arr[j] > key) {
//            arr[j + 1] = arr[j];
//            j--;
//        }
//            arr[j + 1] = key;
//        }
//    }
//
//
//    public static void mergeSort(int[] arr, int left, int right) {
//        if (left < right) {
//            int mid = (left + right) / 2;
//            mergeSort(arr, left, mid);
//            mergeSort(arr, mid + 1, right);
//            merge(arr, left, mid, right);
//        }
//    }
//    public static void merge(int[] arr, int left, int mid, int right) {
//        int n1 = mid - left + 1;
//        int n2 = right - mid;
//        int[] L = new int[n1];
//        int[] R = new int[n2];
//
//        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
//        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];
//
//        int i = 0, j = 0, k = left;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) arr[k++] = L[i++];
//            else arr[k++] = R[j++];
//        }
//        while (i < n1) arr[k++] = L[i++];
//        while (j < n2) arr[k++] = R[j++];
//    }
//
//
//    public static void quickSort(int[] arr, int low, int high) {
//        if (low < high) {
//            int pi = partition(arr, low, high);
//            quickSort(arr, low, pi - 1);
//            quickSort(arr, pi + 1, high);
//        }
//    }
//    public static int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];
//        int i = low - 1;
//        for (int j = low; j < high; j++) {
//            if (arr[j] < pivot) {
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        int temp = arr[i + 1];
//        arr[i + 1] = arr[high];
//        arr[high] = temp;
//        return i + 1;
//    }
//
//
//    public static void main(String[] args) {
//        bubble b = new bubble();
//
//        int[] array = {10, 7, 8, 9, 1, 5};
//        b.bubbleSortt(array);
//        //quickSort(array, 0, array.length - 1);
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//    }
//}


//Bubble Sort → Compare curr and next, swap if curr > next, keep bubbling largest to the end.
//
//Selection Sort → For each curr, find the smallest in the rest of the list and swap with curr.
//
//Insertion Sort → Take curr, shift bigger elements to the right until you find its correct spot, insert it.
//
//Merge Sort → Keep splitting into single elements, then merge back by comparing curr of left and curr of right.
//
//Quick Sort → Choose pivot, move all smaller than pivot before it and larger after it by swapping curr and next positions.
