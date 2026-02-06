package BinaryTree._01_Basics;
import BinaryTree.Common.BinaryTreeUtils;

import BinaryTree.Common.TreeNode;

public class SizeOfTree {

    /*
     * Intuition:
     * Size of a tree means total number of nodes.
     * So count:
     * - current node
     * - nodes in left subtree
     * - nodes in right subtree
     *
     * Formula:
     * size = 1 + left + right
     *
     * Time Complexity:
     * O(n) → every node is visited once
     *
     * Space Complexity (Recursion Stack):
     * Best Case:  O(log n)  // balanced tree
     * Worst Case: O(n)      // skewed tree
     */

    public static int size(TreeNode root){

        if ( root == null) return 0;
        
        int left = size(root.left);
        int right = size(root.right);

        // Size = root + left subtree + right subtree
        return 1 + left + right;

    }

    public static void main(String[] args){

        TreeNode root = BinaryTreeUtils.sampleTree();
        System.out.println("Size of the Binary Tree : " + SizeOfTree.size(root));

    }
     
}
