package DataStructure.Trees;

import java.util.*;

/*
 * pre order using stack
 */

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

public class Preorder {

    public static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode topNode = stack.peek();
            list.add(topNode.val);
            stack.pop();

            if (topNode.right != null) {
                stack.push(topNode.right);
            }

            if (topNode.left != null) {
                stack.push(topNode.left);
            }

        }

        return list;

    }

    public static void main(String[] args) {

        List<Integer> result = new ArrayList<>();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        result = preorderTraversal(root);
        System.out.println(result);

    }

}
