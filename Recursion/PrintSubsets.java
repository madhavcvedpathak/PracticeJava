package Recursion;

public class PrintSubsets {
    public static void main(String[] args) {
        String s = "abc";
        subsets("", s,0);
    }

    private static void subsets(String ans, String s, int idx){
        if (idx==s.length()){
            System.out.println(ans+" ");
            return;
        }

        char ch = s.charAt(idx);
        subsets(ans+ch,s,idx+1);
        subsets(ans, s, idx+1);
    }
}
