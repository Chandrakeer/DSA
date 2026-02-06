"""
Binary Tree Implementation
A binary tree is a tree data structure where each node has at most two children,
referred to as the left child and the right child.
"""

from collections import deque

class TreeNode:
    """
    Node class for Binary Tree
    """
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

class BinaryTree:
    """
    Binary Tree class with basic operations
    """
    def __init__(self):
        self.root = None
    
    def insert(self, value):
        """
        Insert a value into the binary tree using level-order insertion
        """
        if self.root is None:
            self.root = TreeNode(value)
            return
        
        # Use deque for level-order insertion
        queue = deque([self.root])
        while queue:
            node = queue.popleft()
            
            if node.left is None:
                node.left = TreeNode(value)
                return
            else:
                queue.append(node.left)
            
            if node.right is None:
                node.right = TreeNode(value)
                return
            else:
                queue.append(node.right)
    
    def search(self, value):
        """
        Search for a value in the binary tree
        Returns True if found, False otherwise
        """
        return self._search_recursive(self.root, value)
    
    def _search_recursive(self, node, value):
        """
        Helper method for recursive search
        """
        if node is None:
            return False
        
        if node.value == value:
            return True
        
        return (self._search_recursive(node.left, value) or 
                self._search_recursive(node.right, value))
    
    def inorder_traversal(self):
        """
        Inorder traversal: Left -> Root -> Right
        Returns list of values in inorder
        """
        result = []
        self._inorder_recursive(self.root, result)
        return result
    
    def _inorder_recursive(self, node, result):
        """
        Helper method for inorder traversal
        """
        if node:
            self._inorder_recursive(node.left, result)
            result.append(node.value)
            self._inorder_recursive(node.right, result)
    
    def preorder_traversal(self):
        """
        Preorder traversal: Root -> Left -> Right
        Returns list of values in preorder
        """
        result = []
        self._preorder_recursive(self.root, result)
        return result
    
    def _preorder_recursive(self, node, result):
        """
        Helper method for preorder traversal
        """
        if node:
            result.append(node.value)
            self._preorder_recursive(node.left, result)
            self._preorder_recursive(node.right, result)
    
    def postorder_traversal(self):
        """
        Postorder traversal: Left -> Right -> Root
        Returns list of values in postorder
        """
        result = []
        self._postorder_recursive(self.root, result)
        return result
    
    def _postorder_recursive(self, node, result):
        """
        Helper method for postorder traversal
        """
        if node:
            self._postorder_recursive(node.left, result)
            self._postorder_recursive(node.right, result)
            result.append(node.value)
    
    def level_order_traversal(self):
        """
        Level-order traversal (BFS)
        Returns list of values in level-order
        """
        if self.root is None:
            return []
        
        result = []
        queue = deque([self.root])
        
        while queue:
            node = queue.popleft()
            result.append(node.value)
            
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        
        return result
    
    def height(self):
        """
        Calculate the height of the binary tree
        """
        return self._height_recursive(self.root)
    
    def _height_recursive(self, node):
        """
        Helper method to calculate height recursively
        """
        if node is None:
            return 0
        
        left_height = self._height_recursive(node.left)
        right_height = self._height_recursive(node.right)
        
        return max(left_height, right_height) + 1
    
    def size(self):
        """
        Calculate the number of nodes in the binary tree
        """
        return self._size_recursive(self.root)
    
    def _size_recursive(self, node):
        """
        Helper method to calculate size recursively
        """
        if node is None:
            return 0
        
        return 1 + self._size_recursive(node.left) + self._size_recursive(node.right)
    
    def is_empty(self):
        """
        Check if the binary tree is empty
        """
        return self.root is None
