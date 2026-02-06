# Trees

## Overview

A tree is a hierarchical data structure consisting of nodes connected by edges, with a single root node and no cycles.

## Key Concepts

- **Root**: Top node of the tree
- **Parent/Child**: Relationship between connected nodes
- **Leaf**: Node with no children
- **Height**: Longest path from root to leaf
- **Depth**: Distance from root to a node

## Types of Trees

1. **Binary Tree**: Each node has at most two children
2. **Binary Search Tree (BST)**: Left < Parent < Right
3. **AVL Tree**: Self-balancing BST
4. **Red-Black Tree**: Self-balancing BST with color property
5. **Heap**: Complete binary tree with heap property
6. **Trie**: Prefix tree for strings
7. **Segment Tree**: Range query tree

## Common Operations (BST)

| Operation | Average | Worst |
|-----------|---------|-------|
| Search    | O(log n)| O(n)  |
| Insert    | O(log n)| O(n)  |
| Delete    | O(log n)| O(n)  |

## Tree Traversals

1. **Inorder** (Left, Root, Right): Gives sorted order in BST
2. **Preorder** (Root, Left, Right): Used for copying tree
3. **Postorder** (Left, Right, Root): Used for deleting tree
4. **Level Order**: BFS traversal

## Important Techniques

1. **Recursion**: Natural fit for tree problems
2. **DFS**: Depth-first traversal
3. **BFS**: Level-order traversal using queue
4. **Divide and Conquer**: Split problem into subtrees

## Common Problem Patterns

- Tree traversals
- Tree construction
- Path finding
- Lowest Common Ancestor (LCA)
- Tree validation
- Tree modification

## Practice Problems

### Easy
- [ ] Maximum Depth of Binary Tree
- [ ] Invert Binary Tree
- [ ] Same Tree
- [ ] Symmetric Tree

### Medium
- [ ] Validate Binary Search Tree
- [ ] Binary Tree Level Order Traversal
- [ ] Construct Binary Tree from Traversals
- [ ] Lowest Common Ancestor

### Hard
- [ ] Serialize and Deserialize Binary Tree
- [ ] Binary Tree Maximum Path Sum
- [ ] Recover Binary Search Tree

## Notes

Add your personal notes and insights here as you learn.
