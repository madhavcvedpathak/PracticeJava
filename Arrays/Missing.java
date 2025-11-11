package Arrays;

class Missing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing number is 3
        int n = arr.length + 1; // Total expected numbers

        long totalSum = (long) n * (n + 1) / 2; // Use long to avoid overflow
        long arraySum = 0;

        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        long missing = totalSum - arraySum;
        System.out.println("Missing number is: " + missing);

        
        System.out.println(totalSum);
        System.out.println(arraySum);
    }
}

