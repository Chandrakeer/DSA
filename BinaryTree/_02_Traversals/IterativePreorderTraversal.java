package BinaryTree._02_Traversals;

import BinaryTree.Common.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreorderTraversal {

    /*
     * Intuition:
     * Preorder Traversal = Root → Left → Right
     *
     * We use a stack to simulate recursion.
     * Since stack is LIFO, we push the RIGHT child first
     * so that LEFT child is processed before it.
     *
     * Steps:
     * 1. Push root node into the stack
     * 2. Pop the top node and visit it
     * 3. Push right child (if exists)
     * 4. Push left child (if exists)
     * 5. Repeat until stack is empty
     *
     * Time Complexity: O(n)
     * - Each node is visited exactly once
     *
     * Space Complexity (stack):
     * Best Case:  O(log n)  // balanced tree
     * Worst Case: O(n)      // skewed tree
     */

    public static List<Integer> preorder(TreeNode root){

        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        // Edge case: empty tree
        if (root == null) return ans;

        // Start with the root node
        stack.push(root);

        while (!stack.isEmpty()){

            // Pop the current node from the stack
            TreeNode node = stack.pop();

            // Visit the node (Root)
            ans.add(node.val);

            // Push right child first so that
            // left child is processed before it
            if (node.right != null) {
                stack.push(node.right);
            }

            // Push left child
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return ans;
    }


    public static void main(String[] args){

        TreeNode root = BinaryTreeUtils.sampleTree();

        System.out.print("Sample Tree : ");
        BinaryTreeUtils.printLevelOrder(root);
        System.out.println();

        List<Integer> ans = preorder(root);
        System.out.println("Preorder Traversal : " + ans);
    }
    
}
