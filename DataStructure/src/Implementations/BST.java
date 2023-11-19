package Implementations;

import java.util.*;

/**
 * Note 90 % problem of trees solved through recursion
 */

class Node {

    int data;
    Node left;
    Node right;

    public Node(int val) {

        this.data = val;

    }
}

public class BST {

    static Scanner sc = new Scanner(System.in);

    // fn for building tree
    public static Node buildTree(Node root) {

        System.out.println("Enter data ");
        int data = sc.nextInt();
        root = new Node(data);

        if (data == -1) {
            return null;
        }

        // data at left
        System.out.println("Enter data to left of " + data);
        root.left = buildTree(root.left);

        System.out.println("Enter data to right of " + data);
        root.right = buildTree(root.right);

        return root;
    }

    // fn to traverse trees depth wise inorder lnr
    public static void inorder(Node root) {

        // base
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

        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {

        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(0);

        root = buildTree(root);
        // 1 3 7 -1 -1 5 17 -1 -1 -1

        // inorder traversal
        System.out.print("Inorder traversal is:  ");
        inorder(root);

        System.out.println(" ");
        System.out.print("PreOrder traversal is:  ");
        preorder(root);

        System.out.println(" ");
        System.out.print("PostOrder traversal is:  ");
        postorder(root);

    }

}
