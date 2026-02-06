# Searching Algorithms

## Overview

Searching is the process of finding a target element in a collection of data.

## Linear Search

- **Time**: O(n)
- **Space**: O(1)
- **Use**: Unsorted data
- **Approach**: Check each element sequentially

```
Best: O(1) - element at start
Average: O(n)
Worst: O(n) - element at end or not present
```

## Binary Search

- **Time**: O(log n)
- **Space**: O(1) iterative, O(log n) recursive
- **Use**: Sorted data
- **Approach**: Divide search space in half

### Binary Search Variants

1. **Find exact element**
2. **Find first occurrence**
3. **Find last occurrence**
4. **Find insertion position**
5. **Search in rotated array**
6. **Search in 2D matrix**

## Binary Search on Answer

Search for answer in a range where:
- Answer space is sorted
- Can verify if a value is valid
- Examples: Finding square root, allocating books

## Other Search Algorithms

### 1. Jump Search
- **Time**: O(√n)
- **Space**: O(1)
- Jump by fixed steps, then linear search

### 2. Interpolation Search
- **Time**: O(log log n) average, O(n) worst
- **Space**: O(1)
- Works best on uniformly distributed data

### 3. Exponential Search
- **Time**: O(log n)
- **Space**: O(1)
- Find range, then binary search

### 4. Ternary Search
- **Time**: O(log₃ n)
- **Space**: O(1)
- Divide into three parts

## Binary Search Template

```python
# Template 1: Basic Binary Search
left, right = 0, len(arr) - 1
while left <= right:
    mid = left + (right - left) // 2
    if arr[mid] == target:
        return mid
    elif arr[mid] < target:
        left = mid + 1
    else:
        right = mid - 1

# Template 2: Find leftmost
left, right = 0, len(arr)
while left < right:
    mid = left + (right - left) // 2
    if arr[mid] < target:
        left = mid + 1
    else:
        right = mid

# Template 3: Find rightmost
left, right = 0, len(arr)
while left < right:
    mid = left + (right - left) // 2
    if arr[mid] <= target:
        left = mid + 1
    else:
        right = mid
```

## Common Problem Patterns

- Search in sorted array
- Search in rotated sorted array
- Find peak element
- Search in 2D matrix
- Finding square root
- First bad version
- Capacity to ship packages

## Practice Problems

### Easy
- [ ] Binary Search
- [ ] Search Insert Position
- [ ] First Bad Version
- [ ] Sqrt(x)

### Medium
- [ ] Search in Rotated Sorted Array
- [ ] Find First and Last Position
- [ ] Search a 2D Matrix
- [ ] Find Peak Element
- [ ] Koko Eating Bananas

### Hard
- [ ] Median of Two Sorted Arrays
- [ ] Find Minimum in Rotated Sorted Array II
- [ ] Split Array Largest Sum
- [ ] Minimize Max Distance to Gas Station

## Notes

Add your personal notes and insights here as you learn.
