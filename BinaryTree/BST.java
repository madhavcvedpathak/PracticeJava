package BinaryTree;

public class BST {
    static class Node {
        int data;
        Node left, right;
        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    Node root;

    // Constructor
    BST() {
        root = null;
    }

    // Insert a new key
    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Search a key
    boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // Find minimum value
    int minValue(Node root) {
        if (root == null) return -1;
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    // Find maximum value
    int maxValue(Node root) {
        if (root == null) return -1;
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    // Inorder Traversal (sorted order)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Main method
    public static void main(String[] args) {
        BST tree = new BST();

        /* Build the following BST:
                 50
               /    \
             30      70
            / \     / \
          20  40  60  80
        */

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        int key = 40;
        System.out.println("Search " + key + ": " + tree.search(tree.root, key));

        System.out.println("Minimum value in BST: " + tree.minValue(tree.root));
        System.out.println("Maximum value in BST: " + tree.maxValue(tree.root));
    }
}
