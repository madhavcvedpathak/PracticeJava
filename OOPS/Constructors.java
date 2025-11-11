package OOPS;

public class Constructors {
    public static class Car{
        int seats;
        String name;
        double length;

        Car(){ // default constructor

        }


        Car(int x, String s, double d){ //Parametarised const
            seats = x;
            name = s;
            length = d;
        }

        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }
//    public static int max(int a, int b){
//        return Math.max(a,b);
//    }
//    public static int max(int a, int b, int c){
//        return Math.max(a,Math.max(b,c));
//    }

    public static void main(String[] args) {
//        System.out.println(max(2,3));
//        System.out.println(max(3,5,7));


        Car c1 = new Car(5,"Mia Sonet", 3.99);
        c1.print();
        Car c2 = new Car(4, "Lord Alto",3.75);
        c2.print();
//        Car cc = new Car("Maruti",5);
//        cc.print();

        Car c3 = new Car();
        c3.name = "Honda Amaze";

    }
}
