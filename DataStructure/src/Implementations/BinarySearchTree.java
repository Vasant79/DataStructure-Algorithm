package Implementations;

/**
 * bst is tree whoes node have child <=2
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    static Scanner scanner = new Scanner(System.in);

    // building tree fn
    public static Node buildTree(Node root) {
        System.out.println("Enter the data: ");
        int data = scanner.nextInt();
        root = new Node(data);

        if (data == -1) {
            return null;
        }

        System.out.println("Enter data for inserting in left of " + data);
        root.left = buildTree(root.left);
        System.out.println("Enter data for inserting in right of " + data);
        root.right = buildTree(root.right);
        return root;
    }

    // breadth wise traversal fn
    public static void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    // depth trevarsal fn -- using rescursion
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(0); // Initialize the root with some default value

        // creating a Tree
        root = buildTree(root);
        // 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1

        System.out.print("Inorder traversal is:  ");
        inorder(root);

        // System.out.println("\nPreorder traversal is: ");
        // preorder(root);

        // System.out.println("\nPostorder traversal is: ");
        // postorder(root);

        scanner.close();
    }
}
