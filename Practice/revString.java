package Practice;

import java.util.Stack;

public class revString {
//    public static void main(String[] args) {
//        String s = "Geeks";
//
//        char[] arr = s.toCharArray();
//        for (int i = arr.length - 1; i >= 0; i--)
//            System.out.print(arr[i]);
//    }

//    public static void main(String[] args) {
//        String s = "Geeks";
//        StringBuffer sbf = new StringBuffer(s);
//
//        sbf.reverse();
//        System.out.println(sbf);
//    }


    public static void main(String[] args) {
        String str = "Geeks";
        Stack<Character> s = new Stack<>(); //initializing a stack of type char

        for(char c : str.toCharArray()){
            s.push(c); //pushing all the characters
        }
        String res="";

        while(!s.isEmpty()){
            res += s.pop();
        }
        System.out.println(res);
    }


}
