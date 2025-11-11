package OOPS;


import java.util.Scanner;

class Students{
    String name; // null
    private int rno ; // 0
    double cgpa; //0.0
    void print(){
        System.out.println(name + " " + cgpa + " " + rno);
    }

    int getRno(){
        return rno;
    }
    void setRno(int x){
        rno = x;
    }

}
public class PrivateKeyword {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();
        s1.cgpa = 8.9;
        s1.name = "Hemant";
        //s1.rno = 76;

        System.out.println(s1.getRno());
        s1.print();
        s1.setRno(45);
        System.out.println(s1.getRno());

        Students s2 = new Students();
        s2.print();

//        StringBuilder sb = new StringBuilder(sc.nextLine());
//        System.out.println(sb);

    }

}
