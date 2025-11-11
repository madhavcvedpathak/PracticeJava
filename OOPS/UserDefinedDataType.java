package OOPS;

public class UserDefinedDataType {

    public static class Student{ //mi ek dta type create kela aahe
        String name;
        int rno;
        double cgpa;
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // creation of new obj // declaration
        s1.name = "Khushi";
        s1.rno = 23;
        s1.cgpa = 8.5;

        Student s2 = new Student(); // creation of new obj // declaration
        s2.name = "Lavish";
        s2.rno = 33;
        s2.cgpa = 2.2;

        Student s3 = new Student(); // creation of new obj // declaration
        s3.name = "Anagha";
        s3.rno = 13;
        s3.cgpa = 9.37;


        System.out.println(s1.name+" "+s1.rno+" "+s1.cgpa);
        s2.cgpa = 9.8;
        System.out.println(s2.rno+" "+ s2.cgpa);

    }
}
