# Dynamic Programming

## Overview

Dynamic Programming (DP) is an optimization technique that solves complex problems by breaking them down into simpler subproblems and storing the results to avoid redundant calculations.

## Key Concepts

- **Optimal Substructure**: Optimal solution contains optimal solutions to subproblems
- **Overlapping Subproblems**: Same subproblems are solved multiple times
- **Memoization**: Top-down approach with caching
- **Tabulation**: Bottom-up approach with table

## Approaches

### 1. Memoization (Top-Down)
- Recursive approach
- Cache results in hash table or array
- Start from main problem and recurse

### 2. Tabulation (Bottom-Up)
- Iterative approach
- Fill table from base cases
- More space efficient

## Common DP Patterns

1. **0/1 Knapsack**: Include or exclude items
2. **Unbounded Knapsack**: Unlimited items
3. **LCS (Longest Common Subsequence)**: String matching
4. **LIS (Longest Increasing Subsequence)**: Sequence problems
5. **Matrix Chain Multiplication**: Optimization problems
6. **DP on Trees**: Tree-based DP
7. **Digit DP**: Number-based problems
8. **Bitmask DP**: State compression

## Problem-Solving Steps

1. Define the state (dp[i], dp[i][j], etc.)
2. Find the recurrence relation
3. Identify base cases
4. Determine the order of computation
5. Optimize space if possible

## Common Problem Types

- Fibonacci-style problems
- Climbing stairs variants
- Coin change problems
- Substring/subsequence problems
- Grid/path counting
- Stock trading problems
- Game theory (minimax)

## Practice Problems

### Easy
- [ ] Climbing Stairs
- [ ] House Robber
- [ ] Maximum Subarray
- [ ] Min Cost Climbing Stairs

### Medium
- [ ] Coin Change
- [ ] Longest Increasing Subsequence
- [ ] Longest Common Subsequence
- [ ] Unique Paths
- [ ] Word Break

### Hard
- [ ] Edit Distance
- [ ] Longest Valid Parentheses
- [ ] Best Time to Buy and Sell Stock III
- [ ] Regular Expression Matching
- [ ] Burst Balloons

## Notes

Add your personal notes and insights here as you learn.
