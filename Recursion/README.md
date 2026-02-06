# Recursion

## Overview

Recursion is a technique where a function calls itself to solve a problem by breaking it into smaller subproblems.

## Key Concepts

- **Base Case**: Condition to stop recursion
- **Recursive Case**: Function calling itself with modified input
- **Call Stack**: Memory used to store function calls
- **Stack Overflow**: When recursion depth exceeds limit

## Recursion vs Iteration

| Aspect | Recursion | Iteration |
|--------|-----------|-----------|
| Code   | More elegant | More verbose |
| Space  | O(n) stack | O(1) usually |
| Speed  | Slower (function calls) | Faster |
| Problem fit | Trees, graphs | Arrays, loops |

## Types of Recursion

### 1. Direct Recursion
Function calls itself directly

### 2. Indirect Recursion
Function A calls B, B calls A

### 3. Tail Recursion
Recursive call is the last operation
- Can be optimized by compiler

### 4. Head Recursion
Recursive call is the first operation

### 5. Tree Recursion
Multiple recursive calls (e.g., Fibonacci)

## Common Patterns

1. **Divide and Conquer**
   - Merge Sort, Quick Sort
   - Binary Search

2. **Backtracking**
   - N-Queens, Sudoku
   - Generate permutations/combinations

3. **Tree Traversal**
   - Inorder, Preorder, Postorder
   - Path finding

4. **Dynamic Programming**
   - Memoization
   - Fibonacci with cache

## Recursion Template

```python
def recursive_function(input):
    # Base case
    if base_condition(input):
        return base_value
    
    # Recursive case
    # 1. Process current input
    # 2. Make problem smaller
    # 3. Recursive call
    result = process(input)
    return combine(result, recursive_function(smaller_input))
```

## Tips for Writing Recursion

1. Always define base case first
2. Ensure progress towards base case
3. Trust the recursion (assume it works for n-1)
4. Don't trace through entire recursion mentally
5. Consider using memoization for overlapping subproblems

## Common Problems

### Mathematical
- Factorial
- Fibonacci
- Power calculation
- GCD/LCM
- Tower of Hanoi

### String Problems
- Reverse string
- Palindrome check
- Generate all substrings

### Array Problems
- Sum of array
- Find maximum
- Binary search

### Advanced
- Permutations and combinations
- Subsets generation
- Maze solving
- N-Queens problem

## Practice Problems

### Easy
- [ ] Fibonacci Number
- [ ] Reverse String
- [ ] Power of Two/Three/Four
- [ ] Merge Two Sorted Lists

### Medium
- [ ] Generate Parentheses
- [ ] Permutations
- [ ] Subsets
- [ ] Letter Combinations of Phone Number
- [ ] Combination Sum

### Hard
- [ ] N-Queens
- [ ] Sudoku Solver
- [ ] Word Search II
- [ ] Regular Expression Matching

## Notes

Add your personal notes and insights here as you learn.
