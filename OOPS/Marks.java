package OOPS;
import java.util.Arrays;
public class Marks {
    public static class StudentData {
        String name;
        int rno;
        int size;
        int[] marks;

        StudentData(int[] s){
            marks = Arrays.copyOf(s,s.length);
        }

        StudentData(int s){
            marks = new int[s];
        }
    }
    public static void main(String[] args) {
        StudentData s1 = new StudentData(4);
        StudentData s2 = new StudentData(2);
        s1.marks[0] = 89;
        s1.marks[1] = 59;
        s1.marks[2] = 69;
        s1.marks[3] = 79;
    }
}
