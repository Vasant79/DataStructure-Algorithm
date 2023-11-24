package DataStructure.Trees;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaxDepth {

    public static int maxDepth(TreeNode root) {

        // using recursion -- post order treversal
        if (root == null) {
            return 0;
        }

        int leftNode = maxDepth(root.left);
        int rightNode = maxDepth(root.right);

        return 1 + Math.max(leftNode, rightNode);

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        int ans = 0;

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        // root.left.left = new TreeNode(4);
        // root.left.right = new TreeNode(5);
        // root.left.right.left = new TreeNode(8);
        // root.right.left = new TreeNode(6);
        // root.right.right = new TreeNode(7);
        // root.right.right.left = new TreeNode(9);
        // root.right.right.right = new TreeNode(10);

        ans = maxDepth(root);
        System.out.println("Max depth of the tree " + ans);

    }

}
