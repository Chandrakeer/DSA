"""
Example usage of Binary Tree implementation
"""

from binary_tree import BinaryTree

def main():
    print("Binary Tree Implementation Example\n")
    print("=" * 50)
    
    # Create a new binary tree
    tree = BinaryTree()
    
    # Insert values
    print("\n1. Inserting values: 1, 2, 3, 4, 5, 6, 7")
    values = [1, 2, 3, 4, 5, 6, 7]
    for val in values:
        tree.insert(val)
    
    print(f"   Tree size: {tree.size()}")
    print(f"   Tree height: {tree.height()}")
    
    # Tree structure:
    #       1
    #      / \
    #     2   3
    #    / \ / \
    #   4  5 6  7
    
    # Search for values
    print("\n2. Searching for values:")
    search_values = [3, 7, 10]
    for val in search_values:
        found = tree.search(val)
        print(f"   Search for {val}: {'Found' if found else 'Not found'}")
    
    # Perform traversals
    print("\n3. Tree Traversals:")
    print(f"   Level-order: {tree.level_order_traversal()}")
    print(f"   Inorder:     {tree.inorder_traversal()}")
    print(f"   Preorder:    {tree.preorder_traversal()}")
    print(f"   Postorder:   {tree.postorder_traversal()}")
    
    # Tree properties
    print("\n4. Tree Properties:")
    print(f"   Height: {tree.height()}")
    print(f"   Size: {tree.size()}")
    print(f"   Is empty: {tree.is_empty()}")
    
    # Create another tree with different values
    print("\n" + "=" * 50)
    print("\nCreating another tree with values: 10, 20, 30, 40, 50")
    tree2 = BinaryTree()
    for val in [10, 20, 30, 40, 50]:
        tree2.insert(val)
    
    print(f"Tree 2 - Level-order: {tree2.level_order_traversal()}")
    print(f"Tree 2 - Height: {tree2.height()}")
    print(f"Tree 2 - Size: {tree2.size()}")
    
    print("\n" + "=" * 50)
    print("\nExample completed successfully!")

if __name__ == "__main__":
    main()
