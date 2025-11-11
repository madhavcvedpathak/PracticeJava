package Practice;
import java.util.Scanner;
public class FindTwoNumbersWithGivenProduct {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[20];

            System.out.println("Enter 20 integers:"); // Input array elements
            for (int i = 0; i < 20; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the number to find its product pair: ");
            int target = sc.nextInt(); // Input target product

            boolean found = false;

            // Check every pair (i, j)
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] * arr[j] == target) {
                        System.out.println("Numbers found: " + arr[i] + " and " + arr[j]);
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("No pair found with product = " + target);
            }
            sc.close();
        }
}
