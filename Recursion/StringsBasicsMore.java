package Recursion;
import java.util.ArrayList;

public class StringsBasicsMore {
    public static void main(String[] args) {
        String s = "Kartikey";
        change(s);
        System.out.println(s);

        String[] arr = {"Santosh","Krish","Hemant","Preet"};
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        ArrayList<String> al = new ArrayList<>();
        al.add("Bipasha");

        System.out.println(al);
        change2(al);
        System.out.println(al);
    }


    private static void change2(ArrayList<String> al){
        al.add("Biplab");
    }
    private static void change(String n){
        n = "Lavish";
    }
}
