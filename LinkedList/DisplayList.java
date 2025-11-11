package LinkedList;


//class Node{
//    int val;
//    Node next; //def null
//    Node(int val){
//        this.val = val;
//    }
//}
public class DisplayList {
//    public static void displayRec(Node head){
//        if (head == null) return; // base case: end of list
//        System.out.print(head.val + " "); // print current node
//        displayRec(head.next); // recursive call with next node
//    }
    public  static void display(Node head){
        //System.out.println(head.val + " ");
        Node temp = head;
        while (temp != null){
            System.out.println(temp.val+" ");
            temp = temp.next; //VERY IMPORTANT.
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 10 20 30 40 50.
        Node a = new Node(10);    //head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        //Connecting them.(Link)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        //displayRec(a);
    }  //will be hidden
}
