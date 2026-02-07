package BinaryTree._02_Traversals;

import BinaryTree.Common.BinaryTreeUtils;
import BinaryTree.Common.TreeNode;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class IterativeInorderTraversal {

    /*
     * Intuition:
     * Inorder = Left → Root → Right
     * We use a stack to simulate recursion.
     *
     * Steps:
     * 1. Push all left nodes
     * 2. Visit node
     * 3. Move to right
     *
     * Time Complexity: O(n)
     *
     * Space Complexity (stack):
     * Best Case:  O(log n)  // balanced tree
     * Worst Case: O(n)      // skewed tree
     */

    public static List<Integer> inorder(TreeNode root) {

        // List to store inorder result
        List<Integer> ans = new ArrayList<>();

        // Stack to simulate recursion
        Stack<TreeNode> stack = new Stack<>();

        // Pointer to traverse the tree
        TreeNode curr = root;

        // Continue until all nodes are processed
        while (curr != null || !stack.isEmpty()) {

            // Go as left as possible
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Visit the node
            curr = stack.pop();
            ans.add(curr.val);

            // Move to right subtree
            curr = curr.right;
        }

    return ans;
}

    public static void main(String[] args) {

        TreeNode root = BinaryTreeUtils.sampleTree();

        System.out.print("Sample Tree : ");
        BinaryTreeUtils.printLevelOrder(root);
        System.out.println();

        List<Integer> ans = inorder(root);
        System.out.println("Inorder Traversal : " + ans);
    }
}