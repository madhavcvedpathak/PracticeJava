package Recursion;

public class PreInPost {
    public static void main(String[] args) {
        pip(2);
    }
    public static void pip(int n){ //pre in post.
        if(n==0) return;
        System.out.print(n+" "); //pre
        pip(n-1); //sout("Madhav ");
        System.out.print(n+" "); //in
        pip(n-1); //sout("Madhav ");
        System.out.print(n+" "); //post
    }
}
