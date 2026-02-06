package BinaryTree._01_Basics;

import BinaryTree.Common.BinaryTreeUtils;
import BinaryTree.Common.TreeNode;

public class HeightOfTree {

     /*
     * Intuition:
     * Height of a tree depends on the tallest side.
     * So we compute height of left and right subtree
     * and take the maximum.
     *
     * Formula:
     * height = 1 + max(left, right)
     *
     * Time Complexity:
     * O(n) → every node is visited once
     *
     * Space Complexity (Recursion Stack):
     * Best Case:  O(log n)  // balanced tree
     * Worst Case: O(n)      // skewed tree
     */

    public static int height(TreeNode root){

        //base
        if ( root == null) return 0;

        //
        int left = height(root.left);
        int right = height(root.right);

         // Height = root + taller subtree
        return (1 + Math.max(left, right));
    }

    public static void main(String[] args){

        TreeNode root = BinaryTreeUtils.sampleTree();
        System.out.println("Height of Binary Tree : " + HeightOfTree.height(root));

    }
   
}
