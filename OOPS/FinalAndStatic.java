package OOPS;

final class Cricketer{
    static String country = "NZ";
    int runs;
    String name;
    double avg;
    void print(){
        System.out.println(runs+" "+name+" "+avg);
    }
    static void greet(){
        System.out.println("I only believe in Me.");
    }
}

public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        //c1.country = "England";  //Error
        Cricketer c2 = new Cricketer();
        c1.country = "India";
        System.out.println(c2.country);
        c2.greet();
        Cricketer.greet();

    }
}
