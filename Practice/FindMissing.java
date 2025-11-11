package Practice;
import java.util.HashSet;
import java.util.Set;
public class FindMissing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3};  // Example list
        int n = 6;  // Maximum number in the sequence

        // Convert array to a set for fast lookup
        Set<Integer> set = new HashSet<>(); // seq
        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Missing elements:");
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
