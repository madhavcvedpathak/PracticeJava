package LinkedList;

class ListNode {
    int val;
    ListNode next; // pointer to next node
    ListNode prev; // pointer to previous node (needed for doubly linked list)

    ListNode(int val) {
        this.val = val;
    }
}

class DLL {
    ListNode head;
    ListNode tail;
    int size;

    void insertAtHead(int val) {
        ListNode temp = new ListNode(val);
        if (head == null) {
            head = tail = temp; // First node
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int val) {
        ListNode temp = new ListNode(val);
        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void insertAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        ListNode maddy = new ListNode(val); // create new node
        // Insert at head
        if (index == 0) {
            insertAtHead(val);
            return;
        }
        // Insert at tail
        if (index == size) {
            insertAtTail(val);
            return;
        }

        // Insert in the middle
        ListNode current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;  // Move to the node just before the desired index
        }
        // Now current is at (index - 1)
        maddy.next = current.next;     // maddy points forward
        maddy.prev = current;          // maddy points backward
        current.next.prev = maddy;     // the next node points back to maddy
        current.next = maddy;          // current points forward to maddy
        size++;
    }

    void deleteAtHead() {
        if (head == null) return; // Empty list
        if (head == tail) {
            head = tail = null;  // Only one node in the list
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    void deleteAtTail() {
        if (tail == null) return; // Empty list
        if (head == tail) {
            head = tail = null; // Only one node
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        // Delete head
        if (index == 0) {
            deleteAtHead();
            return;
        }
        // Delete tail
        if (index == size - 1) {
            deleteAtTail();
            return;
        }

        // Delete from middle
        ListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next; // Move to the node at the index
        }
        // current is the node to delete
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }

    void printForward() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void printBackward() {
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

}

public class DoublyLinkedListClass {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtTail(33);

        list.printForward();  // Output: 30 20 10 33
        list.printBackward(); // Output: 33 10 20 30
    }
}
