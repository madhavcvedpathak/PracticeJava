package Practice.nqt.Strings;

public class ReverseStringJava {
    public static void main(String[] args) {
        //Method 1
//        String s = "Geeks";
//        String r = "";
//
//        for (int i = 0; i < s.length(); i++){
//            // prepend each character
//            r = s.charAt(i) + r;
//        }
//        System.out.println(r);


        //Method 2
        String s = "Geeks";
        char[] arr = s.toCharArray(); // Using toCharArray to copy elements
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
}
