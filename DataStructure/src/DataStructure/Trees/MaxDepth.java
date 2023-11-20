package DataStructure.Trees;

public class MaxDepth {

    public static void depth(TreeNode root, int count) {

        if (root == null) {
            return;
        }

        depth(root.left, count);
        count++;
        depth(root.right, count);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        int count = 0;

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        depth(root, count);
        System.out.println(count);

    }

}
