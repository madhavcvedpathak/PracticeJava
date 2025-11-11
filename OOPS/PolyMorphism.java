package OOPS;

public class PolyMorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }

    public static class Lion{
        void speaks(){
            System.out.println(" ");
        }
    }

    public static class Human {
        void speaks(){
            System.out.println("Hello");
        }
    }

    public static class Cat{
        void speaks(){
            System.out.println("Meow Meow");
        }
    }

    public static class Pikachu{
        void speaks(){
            System.out.println("Pika Pika");
        }
    }

    public static void main(String[] args) {
        Dog tommy = new Dog();
        Cat c = new Cat();
        Human Bishal = new Human();
        Pikachu pika = new Pikachu();

        tommy.speak();
        c.speaks();
        Bishal.speaks();
        pika.speaks();
    }
}
