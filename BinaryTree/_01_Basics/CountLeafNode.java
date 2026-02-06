package BinaryTree._01_Basics;

import BinaryTree.Common.*;

public class CountLeafNode {

    /*
     * Intuition:
     * A leaf node is a node with NO children.
     * So:
     * - If node is null → 0 leaves
     * - If both left and right are null → 1 leaf
     * - Otherwise → count leaves in left and right subtree
     *
     * Time Complexity:
     * O(n) → every node is visited once
     *
     * Space Complexity (Recursion Stack):
     * Best Case:  O(log n)  // balanced tree
     * Worst Case: O(n)      // skewed tree
     */

    public static int countLeaf(TreeNode root){

        if ( root == null ) return 0;


        if (root.left == null && root.right == null) return 1;

        // Count leaves in left and right subtree 
        int ans = countLeaf(root.left) + countLeaf(root.right);
        
        return ans;
    }

    public static void main(String[] args){

        TreeNode root = BinaryTreeUtils.sampleTree();

        System.out.println("Number of Leaf nodes in a tree : " + countLeaf(root));
    }
    
}
