package LinkedList;


//class Node{
//    int val;
//    Node next; //def null
//    Node(int val){
//        this.val = val;
//    }
//}
public class NodeOfLinkedList {
    public static void main(String[] args) {
        // 10 20 30 40 50.
        Node a = new Node(10);  //LinkedList.Node@6acbcfc0           //head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        //Connecting them.(Link)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        System.out.println(a); //LinkedList.Node@6acbcfc0
//        System.out.println(b); //LinkedList.Node@5f184fc6
//        System.out.println(a.next); //LinkedList.Node@5f184fc6
//        System.out.println(c); //LinkedList.Node@3feba861
//        System.out.println(b.next); //LinkedList.Node@3feba861

        System.out.println(a.next.next.next.val); //40
        System.out.println(c); //LinkedList.Node@6acbcfc0
        System.out.println(b.next); //LinkedList.Node@6acbcfc0
        System.out.println(a.next.next); //LinkedList.Node@6acbcfc0


    }
}
