package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Implementation {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    // Insert a new node in BST
    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Count nodes
    public int size(Node root) {
        return (root == null) ? 0 : (1 + size(root.left) + size(root.right));
    }

    // Product of all nodes
    public long product(Node root) {
        if (root == null) return 1; // neutral for multiplication
        return (long) root.data * product(root.left) * product(root.right);
    }

    // Levels (height of tree)
    public int levels(Node root) {
        return (root == null) ? 0 : 1 + Math.max(levels(root.left), levels(root.right));
    }

    // Display tree in structured form
    public void display(Node root) {
        if (root == null) return;

        System.out.print(root.data + " -> ");
        if (root.left != null) {
            System.out.print("L:" + root.left.data + " ");
        } else {
            System.out.print("L:null ");
        }
        if (root.right != null) {
            System.out.print("R:" + root.right.data);
        } else {
            System.out.print("R:null");
        }
        System.out.println();

        display(root.left);
        display(root.right);
    }

    // Sum of all nodes
    public int sum(Node root) {
        if (root == null) return 0;
        return root.data + sum(root.left) + sum(root.right);
    }

    // Find maximum value in tree
    public int maxValue(Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        int max = root.data;
        if (root.left != null) max = Math.max(max, maxValue(root.left));
        if (root.right != null) max = Math.max(max, maxValue(root.right));
        return max;
    }

    // ---------------- Traversals ----------------
    // Inorder (LNR)
    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder (NLR)
    public void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder (LRN)
    public void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public void levelorder(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    // Level-order (BFS)
    public void levelorderWithLevels(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);  // Step 1: put root in queue

        while (!queue.isEmpty()) {   // Repeat until queue empty
            int levelSize = queue.size();  // Step 2: count nodes in current level

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.remove();  // Step 3: take out one node
                System.out.print(current.data + " ");

                if (current.left != null) queue.add(current.left);   // Step 4: enqueue children
                if (current.right != null) queue.add(current.right);
            }
            System.out.println(); // Step 5: newline after finishing current level
        }
    }

    void printNthLevel(Node root, int n) {
        if (root == null) return;
        if (n == 1) {
            System.out.print(root.data + " ");
        } else {
            printNthLevel(root.left, n - 1);
            printNthLevel(root.right, n - 1);
        }
    }



    // ---------------- Main ----------------
    public static void main(String[] args) {
        Implementation tree = new Implementation();

        int[] values = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        for (int v : values) {
            tree.root = tree.insert(tree.root, v);
        }

        System.out.println("Tree Structure:");
        tree.display(tree.root);

//        System.out.println("\nSize of tree: " + tree.size(tree.root));
//        System.out.println("Sum of all nodes: " + tree.sum(tree.root));
//        System.out.println("Maximum value in tree: " + tree.maxValue(tree.root));
//        System.out.println("Product of all nodes: " + tree.product(tree.root));
//        System.out.println("Levels (height): " + tree.levels(tree.root));

//        System.out.println("\nTraversals:");
//        System.out.print("Inorder   : ");
//        tree.inorder(tree.root);
//        System.out.println();
//
//        System.out.print("Preorder  : ");
//        tree.preorder(tree.root);
//        System.out.println();
//
//        System.out.print("Postorder : ");
//        tree.postorder(tree.root);
//        System.out.println();

        System.out.println("\nLevel-order traversal:");
        tree.levelorderWithLevels(tree.root);
        System.out.println();

        System.out.println("Level 2:");
        tree.printNthLevel(tree.root,2);


    }
}
