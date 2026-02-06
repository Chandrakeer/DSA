# Graphs

## Overview

A graph is a non-linear data structure consisting of vertices (nodes) and edges that connect them.

## Key Concepts

- **Vertex/Node**: Fundamental unit of a graph
- **Edge**: Connection between two vertices
- **Directed vs Undirected**: Edges have direction or not
- **Weighted vs Unweighted**: Edges have weights or not
- **Cyclic vs Acyclic**: Contains cycles or not

## Graph Representations

1. **Adjacency Matrix**: 2D array (V × V)
   - Space: O(V²)
   - Check edge: O(1)
   - Find neighbors: O(V)

2. **Adjacency List**: Array of lists
   - Space: O(V + E)
   - Check edge: O(degree)
   - Find neighbors: O(degree)

3. **Edge List**: List of all edges
   - Space: O(E)
   - Used for edge-centric algorithms

## Graph Traversals

### DFS (Depth-First Search)
- Uses stack (or recursion)
- Time: O(V + E)
- Applications: Cycle detection, topological sort, connected components

### BFS (Breadth-First Search)
- Uses queue
- Time: O(V + E)
- Applications: Shortest path, level-order traversal

## Important Algorithms

1. **Shortest Path**
   - Dijkstra's Algorithm (weighted, non-negative)
   - Bellman-Ford (weighted, negative edges)
   - Floyd-Warshall (all pairs shortest path)

2. **Minimum Spanning Tree**
   - Kruskal's Algorithm
   - Prim's Algorithm

3. **Topological Sort**
   - DFS-based
   - Kahn's Algorithm (BFS-based)

4. **Strongly Connected Components**
   - Kosaraju's Algorithm
   - Tarjan's Algorithm

5. **Network Flow**
   - Ford-Fulkerson
   - Edmonds-Karp

## Common Problem Patterns

- Graph traversal (DFS/BFS)
- Shortest path finding
- Cycle detection
- Connected components
- Bipartite checking
- Topological sorting
- Graph coloring

## Practice Problems

### Easy
- [ ] Number of Islands
- [ ] Clone Graph
- [ ] Find if Path Exists in Graph
- [ ] Max Area of Island

### Medium
- [ ] Course Schedule (I & II)
- [ ] Number of Provinces
- [ ] Pacific Atlantic Water Flow
- [ ] Rotting Oranges
- [ ] Network Delay Time

### Hard
- [ ] Word Ladder II
- [ ] Alien Dictionary
- [ ] Critical Connections in a Network
- [ ] Shortest Path Visiting All Nodes

## Notes

Add your personal notes and insights here as you learn.
