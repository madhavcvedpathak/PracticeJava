package Stacks;
import java.util.Stack;

public class BasicSTCOfStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.size()==0); //OG method.
        System.out.println(st.isEmpty()); // Using method.
//        System.out.println(st.peek());
//        st.pop(); //Underflow
        st.push("Khushi");
        st.push("preet");
        st.push("Rishika");
        st.push("Isha");
        st.push("Prayas");
        st.push("Ram");
        st.push("Piyush");
        st.push("Yash");

        for (int i = 0; i <= 10; i++){
            st.push("Isha"); // Add isha
            st.pop(); // instantly pop isha
        }
        System.out.println(st.size());  //6
        System.out.println(st); // A.S = O(n)

        System.out.println(st); //A.S = O(n)

        st.pop(); //Pop the top most element. Prayas.
        st.size();
        System.out.println(st + " " +st.size()); //Prayas.
        System.out.println(st.peek()); //Isha.
        System.out.println(st.pop()); //it returns the topmost element & then removes it.

//        for (int x = 10; x >= 7; x--){
//            String s = st.pop();
//            System.out.println(s);
//        }
//        for(int x = 0; x <= st.size(); x++){
//            System.out.println("wait");
//        }
        for (int x = 0; x <= st.size(); x++){
            System.out.print(" " + st.isEmpty());
        }

        String s = st.pop();
        System.out.println(s); //Ram
    }
}
