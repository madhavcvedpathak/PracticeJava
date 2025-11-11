package Java100.Arrays;

public class SumOfAllTheElementsOfAnArray {
    public static void main(String args[])
    {
        int arr[] = {12, 13, 1, 10, 34, 10};
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }


//    static int getSum(int arr[], int index, int len){
//        if(index==len-1)
//            return arr[index];
//        return arr[index] + getSum(arr, index+1, len);
//    }


//    static int getSum(int[] arr, int index){
//        if(index==0)
//            return arr[index];
//        return arr[index] + getSum(arr, index-1);
//    }


}
