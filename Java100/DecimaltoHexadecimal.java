package Java100;

import java.util.Scanner;

public class DecimaltoHexadecimal {
    public static void main(String[] args){
        Scanner st = new Scanner(System.in);
        String s = " ";
        int n = st.nextInt();
        while(n!=0){
            int r=n%16;
            if(r<=9){
                s=r+s;
            }else if(r==10) s='A'+s;
            else if(r==11) s='B'+s;
            else if(r==12) s='C'+s;
            else if(r==13) s='D'+s;
            else if(r==14) s='E'+s;
            else {
                s='F'+s;
            }
            n=n/16;
        }
        System.out.println("HexaDecimal: "+s);
    }
}
