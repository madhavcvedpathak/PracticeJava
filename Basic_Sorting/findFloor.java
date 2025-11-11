package Basic_Sorting;

public class findFloor {

    static int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                index = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                index = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 11;

        int floorIndex = findFloor(arr, x);
        System.out.println("Floor index = " + floorIndex);
    }
}
