# Sorting Algorithms

## Overview

Sorting is the process of arranging elements in a specific order (ascending or descending).

## Comparison-Based Sorting

### 1. Bubble Sort
- **Time**: O(n²) average and worst, O(n) best
- **Space**: O(1)
- **Stable**: Yes
- Simple but inefficient

### 2. Selection Sort
- **Time**: O(n²) all cases
- **Space**: O(1)
- **Stable**: No
- Finds minimum and swaps

### 3. Insertion Sort
- **Time**: O(n²) average and worst, O(n) best
- **Space**: O(1)
- **Stable**: Yes
- Good for small or nearly sorted arrays

### 4. Merge Sort
- **Time**: O(n log n) all cases
- **Space**: O(n)
- **Stable**: Yes
- Divide and conquer approach

### 5. Quick Sort
- **Time**: O(n log n) average, O(n²) worst
- **Space**: O(log n)
- **Stable**: No
- Most commonly used in practice

### 6. Heap Sort
- **Time**: O(n log n) all cases
- **Space**: O(1)
- **Stable**: No
- Uses heap data structure

## Non-Comparison Based Sorting

### 1. Counting Sort
- **Time**: O(n + k) where k is range
- **Space**: O(k)
- Works when range is known

### 2. Radix Sort
- **Time**: O(d × (n + k))
- **Space**: O(n + k)
- Sorts digit by digit

### 3. Bucket Sort
- **Time**: O(n + k) average
- **Space**: O(n + k)
- Distributes elements into buckets

## Comparison Table

| Algorithm      | Time (Avg) | Time (Worst) | Space  | Stable |
|---------------|------------|--------------|--------|--------|
| Bubble Sort   | O(n²)      | O(n²)        | O(1)   | Yes    |
| Selection Sort| O(n²)      | O(n²)        | O(1)   | No     |
| Insertion Sort| O(n²)      | O(n²)        | O(1)   | Yes    |
| Merge Sort    | O(n log n) | O(n log n)   | O(n)   | Yes    |
| Quick Sort    | O(n log n) | O(n²)        | O(log n)| No    |
| Heap Sort     | O(n log n) | O(n log n)   | O(1)   | No     |
| Counting Sort | O(n + k)   | O(n + k)     | O(k)   | Yes    |
| Radix Sort    | O(d(n + k))| O(d(n + k))  | O(n + k)| Yes   |

## When to Use Which?

- **Small arrays**: Insertion Sort
- **Nearly sorted**: Insertion Sort, Bubble Sort
- **Guaranteed O(n log n)**: Merge Sort, Heap Sort
- **Average case performance**: Quick Sort
- **Stable sort needed**: Merge Sort, Insertion Sort
- **Limited range**: Counting Sort, Radix Sort
- **Space constraint**: Heap Sort, Quick Sort

## Practice Problems

### Easy
- [ ] Sort an Array
- [ ] Merge Sorted Array
- [ ] Sort Colors (Dutch National Flag)

### Medium
- [ ] Kth Largest Element in Array
- [ ] Top K Frequent Elements
- [ ] Sort List (Linked List)
- [ ] Meeting Rooms II

### Hard
- [ ] Maximum Gap
- [ ] Count of Smaller Numbers After Self

## Notes

Add your personal notes and insights here as you learn.
