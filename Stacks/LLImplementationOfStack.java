package Stacks;

//class Node{
//    int val;
//    Node next;
//    Node(int val){
//        this.val = val;
//    }
//}
class Node {
    int val;
    Node next;
    Node ( int val ){
        this.val = val;
    }
}
class MyStack{
    Node head;
    int len;

    int peek(){
        if (head == null){ // if the stack is empty return "Stack is empty".
            System.out.println("Stack is Empty!");
            return -1;
        }
        return head.val; // return the value of the head.
    }

    int pop(){
        if (head == null){ //if the Stack is empty return "Stack is Empty..."
            System.out.println("Stack is Empty!");
            return -1;
        }
        int x = head.val; // x var stores the value of head node.
        head = head.next; //and make head its next, now head is next node.
        len--; // length reduce.
        return x; //return new x (Updated)
    }
    void push(int ele){ //Push on top
        Node temp = new Node(ele); // Temp node for keeping track.
        if (len == 0) head = temp; //If only one node return it.
        else {
            temp.next = head; // Keep temp on head and then every time add new befor the head.
            head = temp; // head is equal to temp.
        }
        len++;
    }
    int size(){
        return  len; // return the length of the stack.
    }
    void display(){
        Node temp = head; // Create temp node to traverse.
        while (temp!=null){
            System.out.println(temp.val); //Every time print the value of temp.
            temp = temp.next; //temp to next node.
        }
        System.out.println();
    }
}


public class LLImplementationOfStack {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10); st.push(20); st.push(30); st.push(40); st.push(50);
//        for (int i = 0; i <=3; i++){
//            st.display();
//        }
        st.display();
        st.pop();

        st.display();
        System.out.println(st);
    }
}
