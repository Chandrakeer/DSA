package BinaryTree._02_Traversals;

import java.util.ArrayList;
import java.util.List;
import BinaryTree.Common.BinaryTreeUtils;
import BinaryTree.Common.TreeNode;

public class RecursivePostorderTraversal { 

    /*
     * Intuition:
     * Postorder Traversal = Left → Right → Root
     *
     * We recursively visit:
     * 1. Left subtree
     * 2. Right subtree
     * 3. Current node
     *
     * Time Complexity: O(n)
     * - Every node is visited exactly once
     *
     * Space Complexity (Recursion Stack):
     * Best Case:  O(log n)  // balanced tree
     * Worst Case: O(n)      // skewed tree
     */

    public static void postorder(TreeNode root, List<Integer> postorder){

        if (root == null) return;

        postorder(root.left, postorder);
        postorder(root.right, postorder);
        postorder.add(root.val);
    }

    public static void main(String[] args){

        TreeNode root = BinaryTreeUtils.sampleTree();

        List<Integer> ans = new ArrayList<>();

        System.out.print("Sample Tree : ");
        BinaryTreeUtils.printLevelOrder(root);
        System.out.println();

        postorder(root, ans);
        System.out.println("Postorder Traversal : " + ans);

    }
    
}
