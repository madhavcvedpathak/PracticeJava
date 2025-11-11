package LinkedList;

class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
public class SwapNodesInList {

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to swap two nodes with values x and y
    public static Node swapNodes(Node head, int x, int y) {
        if (x == y) return head;

        Node prevX = null, currX = head;
        Node prevY = null, currY = head;

        Node slow = head, fast = head;

        // We will alternate between slow and fast steps to look for both nodes
        while ((currX != null && currX.val != x) || (currY != null && currY.val != y)) {
            if (currX != null && currX.val != x) {
                prevX = currX;
                currX = currX.next;
            }
            if (fast != null && fast.next != null) {
                fast = fast.next.next;
                if (currY != null && currY.val != y) {
                    prevY = currY;
                    currY = currY.next;
                }
            } else {
                // Fall back to slow traversal for remaining nodes
                if (currY != null && currY.val != y) {
                    prevY = currY;
                    currY = currY.next;
                }
            }
        }

        // If either node not found, return head unchanged
        if (currX == null || currY == null) return head;

        // Handle if x or y is head
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;

        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        //Connect
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Original List:");
        display(a);

        // Swap nodes with values 10 and 40
        Node newHead = swapNodes(a, 10, 40);

        System.out.println("After swapping 10 and 40:");
        display(newHead);
    }
}
