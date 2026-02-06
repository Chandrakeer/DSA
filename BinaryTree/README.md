# Binary Tree

A binary tree is a tree data structure where each node has at most two children, referred to as the left child and the right child.

## Features

This implementation includes:
- **TreeNode**: Represents a single node in the binary tree
- **BinaryTree**: Main binary tree class with the following operations:
  - `insert(value)`: Insert a value using level-order insertion
  - `search(value)`: Search for a value in the tree
  - `inorder_traversal()`: Left -> Root -> Right
  - `preorder_traversal()`: Root -> Left -> Right
  - `postorder_traversal()`: Left -> Right -> Root
  - `level_order_traversal()`: Breadth-first traversal
  - `height()`: Calculate the height of the tree
  - `size()`: Get the number of nodes in the tree
  - `is_empty()`: Check if the tree is empty

## Structure

```
       1
      / \
     2   3
    / \
   4   5
```

## Usage

```python
from binary_tree import BinaryTree

# Create a new binary tree
tree = BinaryTree()

# Insert values
tree.insert(1)
tree.insert(2)
tree.insert(3)
tree.insert(4)
tree.insert(5)

# Search for a value
found = tree.search(3)  # Returns True

# Get traversals
inorder = tree.inorder_traversal()      # [4, 2, 5, 1, 3]
preorder = tree.preorder_traversal()    # [1, 2, 4, 5, 3]
postorder = tree.postorder_traversal()  # [4, 5, 2, 3, 1]
levelorder = tree.level_order_traversal()  # [1, 2, 3, 4, 5]

# Get tree properties
height = tree.height()  # 3
size = tree.size()      # 5
```

## Running Tests

```bash
python test_binary_tree.py
```

## Time Complexity

| Operation | Time Complexity |
|-----------|----------------|
| Insert    | O(n)          |
| Search    | O(n)          |
| Traversal | O(n)          |
| Height    | O(n)          |
| Size      | O(n)          |

## Space Complexity

- Storage: O(n) where n is the number of nodes
- Traversal (recursion): O(h) where h is the height of the tree
