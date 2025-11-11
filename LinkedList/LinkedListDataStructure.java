package LinkedList;

//class Node{ // user defined data type
//    int val;
//    Node next; // null
//    Node(int val){
//        this.val = val;
//    }
//}
class Linkedlist{ // user defined data structure
    Node head; // null
    Node tail; // null;
    int size;

    int search(int val) {
        if (head == null) return -1;
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.val == val) return index;
            temp = temp.next;
            index++;
        }
        return -1; // Not found
    }
    void addAtHead(int val) {
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val){
        Node temp = new Node(val); //New temp node
        if(tail==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("List Is Empty!");
            return;
        }
        head = head.next; //Task
        if(head==null) tail = null; //base condition
        size--;
    }
    void display() {
        if(head==null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insert(int val, int idx){
        if (idx<0 || idx>size){
            System.out.println("Invalid Index!");
            return;
        }
        if (idx==0) addAtHead(val);
        else if (idx==size) addAtTail(val);
        else {
            Node temp = head;
            for (int i = 1; i <= idx-1; i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    int get(int val) {
        return search(val); // Reuse the same logic
    }
    void deleteAtIndex(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index!");
            return;
        }
        if (idx == 0) {
            deleteAtHead();
            return;
        }
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (idx == size - 1) {
            tail = temp; // Update tail if last node is deleted
        }
        size--;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   // store next node
            current.next = prev;   // reverse the link
            prev = current;        // move prev forward
            current = next;        // move current forward
        }
        head = prev;  // update head to new first node
    }

    void deleteByValue(int val) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.val == val) {
            deleteAtHead();
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.val != val) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Value not found!");
            return;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp; // Deleted last node
        }
        size--;
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {

        Linkedlist ll = new Linkedlist();

        ll.deleteAtHead();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40); ll.display();

        ll.addAtHead(50);
        ll.addAtHead(60); ll.display();

        ll.deleteAtHead(); ll.display();

        System.out.println(ll.size);
        System.out.println(ll.search(20));
        ll.insert(40,2);
        ll.display(); //50 10 40 20 30 40
        System.out.println(ll.get(10)); //1
        ll.display();
        ll.deleteAtIndex(3);
        ll.display(); //50 10 40 30 40

    }
}