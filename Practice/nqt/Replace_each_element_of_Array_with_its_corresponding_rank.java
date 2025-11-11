package Practice.nqt;
import java.util.HashSet;
import java.util.Set;

public class Replace_each_element_of_Array_with_its_corresponding_rank {
    public static void main(String[] args) {
        int[] arr = {100, 5, 70, 2};
        int[] res = replaceWithRank(arr);

        for (int val : res) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static int[] replaceWithRank(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        for (int i = 0; i < n ; i++){
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < n; j++){
                if (arr[j] < arr[i] && !set.contains(arr[j])){
                    set.add(arr[j]);
                }
            }
            res[i] = set.size() + 1;
        }
        return res;
    }
}
