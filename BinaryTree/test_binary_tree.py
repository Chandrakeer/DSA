"""
Test cases for Binary Tree implementation
"""

import sys
import os
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

from binary_tree import BinaryTree, TreeNode

def test_tree_creation():
    """Test creating an empty binary tree"""
    tree = BinaryTree()
    assert tree.is_empty() == True
    assert tree.size() == 0
    assert tree.height() == 0
    print("✓ Tree creation test passed")

def test_insert():
    """Test inserting nodes into the binary tree"""
    tree = BinaryTree()
    tree.insert(1)
    assert tree.is_empty() == False
    assert tree.size() == 1
    assert tree.root.value == 1
    
    tree.insert(2)
    tree.insert(3)
    assert tree.size() == 3
    assert tree.root.left.value == 2
    assert tree.root.right.value == 3
    print("✓ Insert test passed")

def test_search():
    """Test searching for values in the binary tree"""
    tree = BinaryTree()
    tree.insert(1)
    tree.insert(2)
    tree.insert(3)
    tree.insert(4)
    tree.insert(5)
    
    assert tree.search(1) == True
    assert tree.search(3) == True
    assert tree.search(5) == True
    assert tree.search(10) == False
    assert tree.search(0) == False
    print("✓ Search test passed")

def test_traversals():
    """Test different traversal methods"""
    tree = BinaryTree()
    # Creating a tree:
    #       1
    #      / \
    #     2   3
    #    / \
    #   4   5
    tree.insert(1)
    tree.insert(2)
    tree.insert(3)
    tree.insert(4)
    tree.insert(5)
    
    # Test level-order traversal
    assert tree.level_order_traversal() == [1, 2, 3, 4, 5]
    
    # Test inorder traversal (Left -> Root -> Right)
    assert tree.inorder_traversal() == [4, 2, 5, 1, 3]
    
    # Test preorder traversal (Root -> Left -> Right)
    assert tree.preorder_traversal() == [1, 2, 4, 5, 3]
    
    # Test postorder traversal (Left -> Right -> Root)
    assert tree.postorder_traversal() == [4, 5, 2, 3, 1]
    
    print("✓ Traversal tests passed")

def test_height():
    """Test calculating tree height"""
    tree = BinaryTree()
    assert tree.height() == 0
    
    tree.insert(1)
    assert tree.height() == 1
    
    tree.insert(2)
    tree.insert(3)
    assert tree.height() == 2
    
    tree.insert(4)
    tree.insert(5)
    assert tree.height() == 3
    
    print("✓ Height test passed")

def test_size():
    """Test calculating tree size"""
    tree = BinaryTree()
    assert tree.size() == 0
    
    tree.insert(1)
    assert tree.size() == 1
    
    tree.insert(2)
    tree.insert(3)
    tree.insert(4)
    tree.insert(5)
    assert tree.size() == 5
    
    print("✓ Size test passed")

def test_empty_tree_operations():
    """Test operations on empty tree"""
    tree = BinaryTree()
    assert tree.search(5) == False
    assert tree.inorder_traversal() == []
    assert tree.preorder_traversal() == []
    assert tree.postorder_traversal() == []
    assert tree.level_order_traversal() == []
    print("✓ Empty tree operations test passed")

def run_all_tests():
    """Run all test cases"""
    print("Running Binary Tree Tests...\n")
    
    test_tree_creation()
    test_insert()
    test_search()
    test_traversals()
    test_height()
    test_size()
    test_empty_tree_operations()
    
    print("\n✅ All tests passed successfully!")

if __name__ == "__main__":
    run_all_tests()
