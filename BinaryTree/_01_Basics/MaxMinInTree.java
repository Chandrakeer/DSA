package BinaryTree._01_Basics;

import BinaryTree.Common.BinaryTreeUtils;
import BinaryTree.Common.TreeNode;

public class MaxMinInTree {

    /*
     * Intuition:
     * To find maximum and minimum value in a tree,
     * check the current node and compare it with
     * values from left and right subtrees.
     *
     * Idea:
     * - Get max/min from left subtree
     * - Get max/min from right subtree
     * - Compare with current node
     *
     * Time Complexity:
     * O(n) → every node is visited once
     *
     * Space Complexity (Recursion Stack):
     * Best Case:  O(log n)  // balanced tree
     * Worst Case: O(n)      // skewed tree
     */

    public static int MaxInTree(TreeNode root){

        if ( root == null) return Integer.MIN_VALUE;

        int leftMax = MaxInTree(root.left);
        int rightMax = MaxInTree(root.right);

        int max = Math.max(root.val, Math.max(leftMax, rightMax));

        return max;
    }

    public static int MinInTree(TreeNode root){
        
        if ( root == null) return Integer.MAX_VALUE;

        int leftMin = MinInTree(root.left);
        int rightMin = MinInTree(root.right);

        int max = Math.min(root.val, Math.min(leftMin, rightMin));

        return max;
    }


    public static void main(String[] args){

        TreeNode root = BinaryTreeUtils.sampleTree();

        System.out.println("Maximum in a tree : " + MaxInTree(root));
        System.out.println("Minimum in a tree : " + MinInTree(root));

    }
    
}
