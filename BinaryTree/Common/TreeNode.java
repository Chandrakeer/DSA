package BinaryTree.Common;

/**
 * TreeNode represents a single node in a Binary Tree.
 *
 * Each node contains:
 * 1. A value (val)
 * 2. A reference to the left child
 * 3. A reference to the right child
 *
 * This structure is used by all Binary Tree algorithms.
 */

public class TreeNode {

    // Stores the value of the current node
    public int val;

    // Reference to the left child (null if absent)
    public TreeNode left;

    // Reference to the right child (null if absent)
    public TreeNode right;

    // Constructor to initialize a node with a value
    public TreeNode(int val) {
        this.val = val;     // assign value
        this.left = null;   // left child not set yet
        this.right = null;  // right child not set yet
    }
}