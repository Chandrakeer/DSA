package BinaryTree._02_Traversals;

import java.util.ArrayList;
import java.util.List;
import BinaryTree.Common.BinaryTreeUtils;
import BinaryTree.Common.TreeNode;

public class RecursivePreorderTraversal {
        
    /*
     * Intuition:
     * Preorder Traversal = Root → Left → Right
     *
     * We recursively visit:
     * 1. Current node
     * 2. Left subtree
     * 3. Right subtree
     *
     * Time Complexity: O(n)
     * - Every node is visited exactly once
     *
     * Space Complexity (Recursion Stack):
     * Best Case:  O(log n)  // balanced tree
     * Worst Case: O(n)      // skewed tree
     */

    public static void preorder(TreeNode root, List<Integer> preorder){

        if (root == null) return;

        preorder.add(root.val);
        preorder(root.left, preorder);
        preorder(root.right, preorder);
    }

    public static void main(String[] args){

        TreeNode root = BinaryTreeUtils.sampleTree();

        List<Integer> ans = new ArrayList<>();

        System.out.print("Sample Tree : ");
        BinaryTreeUtils.printLevelOrder(root);
        System.out.println();

        preorder(root, ans);
        System.out.println("Preorder Traversal : " + ans);

    }
}
