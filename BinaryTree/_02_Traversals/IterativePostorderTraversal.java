package BinaryTree._02_Traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import BinaryTree.Common.*;

public class IterativePostorderTraversal {

    /*
     * Intuition:
     * Postorder = Left → Right → Root
     * Root must be processed LAST.
     *
     * Idea:
     * 1. Use two stacks
     * 2. First stack does modified preorder
     * 3. Second stack reverses the order
     *
     * Time Complexity: O(n)
     *
     * Space Complexity:
     * Best Case:  O(n)
     * Worst Case: O(n)
     */

    public static List<Integer> Postorder(TreeNode root){

        // Result list
        List<Integer> ans = new ArrayList<>();

        // If tree is empty
        if (root == null) return ans;

        // Two stacks for postorder traversal
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        // Start with root
        stack1.push(root);

        while (!stack1.isEmpty()) {

            // Take node from stack1
            TreeNode curr = stack1.pop();

            // Push node to stack2
            stack2.push(curr);

            // Push left and right children
            if (curr.left != null) stack1.push(curr.left);
            if (curr.right != null) stack1.push(curr.right);
        }

        // stack2 gives Left → Right → Root
        while (!stack2.isEmpty()) {
            ans.add(stack2.pop().val);
        }

        return ans;
    }

    public static void main(String[] args){

        TreeNode root = BinaryTreeUtils.sampleTree();

        System.out.print("Sample Tree : ");
        BinaryTreeUtils.printLevelOrder(root);
        System.out.println();

        List<Integer> ans = Postorder(root);
        System.out.println("Postorder Traversal : " + ans);

    }
    
}
