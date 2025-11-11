package Java100.Arrays;
import java.util.Arrays;

public class ReplaceEachElementByItsRank {
    static void changeArr(int[] input)
    {
        // Copy input array into newArray
        int newArray[] = Arrays.copyOfRange(input, 0, input.length);

        // Sort newArray[] in ascending order
        Arrays.sort(newArray);
        for(int i=0; i< input.length; i++){

            for(int j=0; j< input.length; j++){
                if(newArray[j]==input[i])
                {
                    input[i] = j+1;
                    break;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { 100, 2, 70, 12 , 90};  // Given array arr[]

        changeArr(arr);  // Function Call

        System.out.println(Arrays.toString(arr)); // Print the array elements
    }
}
