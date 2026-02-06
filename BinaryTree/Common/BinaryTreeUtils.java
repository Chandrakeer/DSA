package BinaryTree.Common;

import java.util.LinkedList;
import java.util.Queue;

// Helper class to create and print binary trees for testing
public class BinaryTreeUtils {

    // Creates a sample tree for testing
    //        1
    //      /   \
    //     2     3
    //    / \
    //   4   5
    public static TreeNode sampleTree() {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        return root;
    }

    // Prints tree in level order (BFS)
    public static void printLevelOrder(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            System.out.print(node.val + " ");

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }
}
