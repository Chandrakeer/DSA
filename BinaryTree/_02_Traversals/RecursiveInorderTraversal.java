package BinaryTree._02_Traversals;

import java.util.ArrayList;
import java.util.List;

import BinaryTree.Common.BinaryTreeUtils;
import BinaryTree.Common.TreeNode;

public class RecursiveInorderTraversal {

    /*
     * Intuition:
     * Inorder Traversal = Left → Root → Right
     *
     * We recursively visit:
     * 1. Left subtree
     * 2. Current node
     * 3. Right subtree
     *
     * Time Complexity: O(n)
     * - Every node is visited exactly once
     *
     * Space Complexity (Recursion Stack):
     * Best Case:  O(log n)  // balanced tree
     * Worst Case: O(n)      // skewed tree
     */

    public static void inorder(TreeNode root, List<Integer> inorder){

        if ( root == null) return;

        inorder(root.left, inorder);
        inorder.add(root.val);
        inorder(root.right, inorder);
    }

    public static void main(String[] args){

        TreeNode root = BinaryTreeUtils.sampleTree();

        List<Integer> ans = new ArrayList<>();

        System.out.print("Sample Tree : ");
        BinaryTreeUtils.printLevelOrder(root);
        System.out.println();

        inorder(root, ans);
        System.out.println("Inorder Traversal : " + ans);

    }
    
}
