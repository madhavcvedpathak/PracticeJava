package Java100;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int num : arr){
            if (num > highest){
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest){
                secondHighest = num;
            }
        }
        System.out.println("Second Highest is : " + secondHighest);
    }
}
