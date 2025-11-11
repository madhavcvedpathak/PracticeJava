package Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        //here we can only print the elements
        //we cant update or change original elements.
    }
}
