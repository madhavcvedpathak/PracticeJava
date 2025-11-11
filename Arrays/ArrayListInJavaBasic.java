package Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJavaBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(52);
        arr.add(10);
        arr.add(34);

        System.out.println(arr.get(2));
        arr.set(3,50); //arr[3] = 50

        System.out.println(arr);// not traversing array with ourselves

        int n = arr.size();
        for (int i = 0; i < n; i++){
            System.out.print(arr.get(i)+" ");

        }

        System.out.println();
        for (int ele : arr){
            System.out.print(ele+" ");
        }

        System.out.println();
        //25 52 10 50
        arr.add(78); //
        System.out.print(arr);

        arr.add(1,100);
        System.out.println();
        System.out.print(arr);

        arr.remove(arr.size()-1);
        System.out.println();
        System.out.print(arr);


//        int i = 0, j = arr.size()-1;
//        while(i<j){
//
//        }


//        Collections.reverse(arr);
//        System.out.println();
//        System.out.print(arr);




    }
}
