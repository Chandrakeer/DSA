# Queues

## Overview

A queue is a linear data structure that follows the First In First Out (FIFO) principle.

## Key Concepts

- **FIFO**: First element added is the first one removed
- **Enqueue**: Add element to rear
- **Dequeue**: Remove element from front
- **Front**: View front element
- **Rear**: View rear element
- **isEmpty**: Check if queue is empty

## Types of Queues

1. **Simple Queue**: Basic FIFO queue
2. **Circular Queue**: Last position connects to first
3. **Priority Queue**: Elements have priorities
4. **Deque (Double-ended Queue)**: Insert/delete at both ends

## Operations

| Operation | Time Complexity |
|-----------|----------------|
| Enqueue   | O(1)           |
| Dequeue   | O(1)           |
| Front     | O(1)           |
| Rear      | O(1)           |

## Implementations

1. **Array-based**: Fixed size, circular queue
2. **Linked List-based**: Dynamic size
3. **Two Stacks**: Simulate queue using stacks

## Common Applications

- BFS traversal
- Job scheduling
- CPU task scheduling
- Print queue
- Buffering (IO Buffers, pipes)
- Level order traversal

## Priority Queue

- **Binary Heap**: Most common implementation
- **Operations**: Insert O(log n), Delete O(log n), Peek O(1)
- **Applications**: Dijkstra's algorithm, Huffman coding, K-way merge

## Common Problem Patterns

- BFS problems
- Sliding window maximum
- First non-repeating character
- Generate binary numbers
- Interleaving queues

## Practice Problems

### Easy
- [ ] Implement Queue using Stacks
- [ ] Design Circular Queue
- [ ] Number of Recent Calls
- [ ] First Unique Character in String

### Medium
- [ ] Sliding Window Maximum
- [ ] Design Hit Counter
- [ ] Task Scheduler
- [ ] Dota2 Senate

### Hard
- [ ] Shortest Subarray with Sum at Least K
- [ ] Jump Game VI

## Priority Queue Problems

### Easy
- [ ] Kth Largest Element in Stream
- [ ] Last Stone Weight

### Medium
- [ ] Top K Frequent Elements
- [ ] K Closest Points to Origin
- [ ] Find K Pairs with Smallest Sums

### Hard
- [ ] Merge k Sorted Lists
- [ ] Find Median from Data Stream

## Notes

Add your personal notes and insights here as you learn.
