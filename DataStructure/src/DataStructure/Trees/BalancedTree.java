package DataStructure.Trees;

/**
 * Balanced tree
 * Left subtree height - right subtree height >1
 */

class Node {

    int data;
    Node right;
    Node left;

    public Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

public class BalancedTree {

    // dry run this code
    public static int balanceTree(Node root) {

        if (root == null) {
            return 0;
        }

        int left = balanceTree(root.left);
        if (left == -1) {
            return -1;
        }
        int right = balanceTree(root.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return 1 + Math.max(left, right);

    }

    public static void main(String args[]) {

        Node root = new Node(4);
        root.left = new Node(7);
        root.right = new Node(8);
        root.right.right = new Node(0);
        root.right.left = new Node(1);
        root.right.left.left = new Node(3);
        root.right.left.right = new Node(5);

        balanceTree(root);

        if (balanceTree(root) != -1) {
            System.out.println("Balanced tree");
        } else {
            System.out.println("Not a balanced tree");
        }

    }

}
