package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Madhav"); //Initial capacity 16, if we put num the it will be capacity
        System.out.println(sb.length()+" "+sb.capacity());
        System.out.println(sb);
        sb.append(" Vedpathak");
        System.out.println(sb);
        sb.setCharAt(1,'A');
        System.out.println(sb);

        String t = sb.toString(); // convert to normal string
        System.out.println(t);


    }
}
