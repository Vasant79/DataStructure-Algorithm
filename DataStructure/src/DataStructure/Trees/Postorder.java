package DataStructure.Trees;

import java.util.*;

class TreeNode {

    int val;
    TreeNode right;
    TreeNode left;

    TreeNode(int val) {
        this.val = val;
        this.right = null;
        this.left = null;
    }

}

public class Postorder {

    public static void Postorder_Recursion(TreeNode root) {

        if (root == null) {
            return;
        }

        // lrn
        Postorder_Recursion(root.left);
        Postorder_Recursion(root.right);
        System.out.print(root.val + " ");

    }

    /**
     * same as pre order just use 2 stack
     * stack one same as pre order
     * stack 2 stores pop value of stack 1
     * result stores data of node in stack
     */
    public static List<Integer> Postorder_Stack(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        stack1.push(root);

        Stack<TreeNode> stack2 = new Stack<>();

        while (!stack1.isEmpty()) {

            TreeNode topNode = stack1.peek();
            stack2.push(topNode);
            stack1.pop();

            if (topNode.left != null) {
                stack1.push(topNode.left);
            }

            if (topNode.right != null) {
                stack1.push(topNode.right);
            }

        }

        // storing data from stack 2 to list
        while (!stack2.isEmpty()) {
            list.add(stack2.peek().val);
            stack2.pop();
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

        // Postorder_Recursion(root);// 4 8 5 2 6 9 10 7 3 1
        result = Postorder_Stack(root);
        System.out.println(result);

    }
}
