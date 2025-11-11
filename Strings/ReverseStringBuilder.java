package Strings;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String s = "Nagesh";
        StringBuilder sb = new StringBuilder(s);
//        sb.append("Jain");
//        System.out.println(sb);
//
//        sb.reverse();
//        System.out.println(sb);

        //Reverse
//        int i = 0, j = sb.length()-1;
//        while(i<=j){
//            char temp1 = sb.charAt(i);
//            char temp2 = sb.charAt(j);
//            sb.setCharAt(i,temp2);
//            sb.setCharAt(j,temp1);
//            i++;
//            j--;
//        }
//        System.out.println(sb);


        sb.delete(3,6); // 3 to 5  // Nag
        System.out.println(sb);




    }
}
