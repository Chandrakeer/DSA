# Greedy Algorithms

## Overview

Greedy algorithms make locally optimal choices at each step with the hope of finding a global optimum.

## Key Characteristics

- **Local Optimal Choice**: Pick best option at current step
- **No Backtracking**: Decisions are final
- **Fast**: Usually O(n log n) or O(n)
- **Not Always Optimal**: Greedy doesn't guarantee global optimum

## When Greedy Works

1. **Greedy Choice Property**: Local optimum leads to global optimum
2. **Optimal Substructure**: Problem can be broken into subproblems

## Greedy vs Other Approaches

| Approach | Guarantees | Speed | Use Case |
|----------|-----------|-------|----------|
| Greedy | Sometimes | Fast | When greedy choice property holds |
| DP | Always optimal | Slower | Overlapping subproblems |
| Backtracking | Explores all | Slowest | Need all solutions |

## Common Greedy Strategies

1. **Activity Selection**: Choose non-overlapping activities
2. **Fractional Knapsack**: Take items by value/weight ratio
3. **Huffman Coding**: Build optimal prefix code
4. **Minimum Spanning Tree**: Kruskal's/Prim's algorithm
5. **Dijkstra's Algorithm**: Shortest path

## Classic Greedy Problems

### Interval Problems
- Activity selection
- Meeting rooms
- Merge intervals
- Non-overlapping intervals

### Array Problems
- Jump game
- Gas station
- Partition labels
- Wiggle subsequence

### String Problems
- Remove k digits
- Remove duplicate letters
- Smallest subsequence

### Graph Problems
- Minimum spanning tree
- Shortest path (Dijkstra)

## Problem-Solving Steps

1. **Identify greedy choice**: What makes sense locally?
2. **Prove greedy choice works**: Does local optimum → global optimum?
3. **Sort if needed**: Often need sorted input
4. **Implement**: Make greedy choices iteratively
5. **Verify**: Check edge cases

## Common Patterns

### 1. Sorting + Greedy
```
Sort by some criteria
Make greedy choices in order
```

### 2. Two Pointers + Greedy
```
Use pointers to make optimal choices
Move pointers based on greedy strategy
```

### 3. Priority Queue + Greedy
```
Always pick best option (min/max)
Use heap for efficiency
```

## Proof Techniques

1. **Exchange Argument**: Show greedy ≥ any other solution
2. **Induction**: Prove for n assuming true for n-1
3. **Contradiction**: Assume greedy fails, find contradiction

## Practice Problems

### Easy
- [ ] Assign Cookies
- [ ] Lemonade Change
- [ ] Best Time to Buy and Sell Stock II
- [ ] Maximum Subarray

### Medium
- [ ] Jump Game
- [ ] Jump Game II
- [ ] Gas Station
- [ ] Partition Labels
- [ ] Non-overlapping Intervals
- [ ] Minimum Number of Arrows to Burst Balloons

### Hard
- [ ] Candy
- [ ] Create Maximum Number
- [ ] IPO
- [ ] Minimum Number of Taps to Water Garden

## Classic Algorithms

### Activity Selection
Choose maximum number of non-overlapping activities

### Fractional Knapsack
Maximize value with weight constraint (fractional items allowed)

### Huffman Coding
Build optimal prefix-free encoding

### Job Sequencing
Schedule jobs to maximize profit with deadlines

### Minimum Spanning Tree
- **Kruskal's**: Sort edges, add if no cycle
- **Prim's**: Grow tree from vertex

## When Greedy Fails

Be aware: Greedy doesn't always work!
- **0/1 Knapsack**: Need DP
- **Longest Path**: Need DP or backtracking
- **Coin Change (min coins)**: Need DP unless special coins

## Notes

Add your personal notes and insights here as you learn.
