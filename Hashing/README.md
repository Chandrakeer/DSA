# Hashing

## Overview

Hashing is a technique that maps data of arbitrary size to fixed-size values using a hash function.

## Key Concepts

- **Hash Function**: Converts key to array index
- **Hash Table**: Data structure using hashing
- **Collision**: When two keys hash to same index
- **Load Factor**: n/m (items/table size)

## Hash Table Operations

| Operation | Average | Worst |
|-----------|---------|-------|
| Insert    | O(1)    | O(n)  |
| Delete    | O(1)    | O(n)  |
| Search    | O(1)    | O(n)  |

## Collision Resolution

### 1. Chaining (Open Hashing)
- Each bucket contains linked list
- Simple to implement
- Space: O(n + m)

### 2. Open Addressing (Closed Hashing)
- Find next empty slot
- Better cache performance
- Space: O(m)

#### Open Addressing Methods:
- **Linear Probing**: h(k) + i
- **Quadratic Probing**: h(k) + i²
- **Double Hashing**: h₁(k) + i × h₂(k)

## Good Hash Function Properties

1. **Deterministic**: Same input → same output
2. **Uniform Distribution**: Minimize collisions
3. **Efficient**: Fast to compute
4. **Avalanche Effect**: Small input change → big output change

## Common Hash Functions

```python
# Simple hash for strings
hash = 0
for char in string:
    hash = (hash * 31 + ord(char)) % table_size

# Polynomial rolling hash
hash = 0
p = 31  # prime number
for char in string:
    hash = (hash * p + ord(char)) % mod
```

## Data Structures Using Hashing

1. **Hash Set**: Stores unique elements
2. **Hash Map**: Stores key-value pairs
3. **Hash Table**: Generic implementation

## Applications

- Database indexing
- Caching (LRU Cache)
- Password verification
- Cryptography
- Bloom filters
- Counting frequencies
- Finding duplicates

## Common Problem Patterns

1. **Frequency Counting**
   - Count character/element occurrences
   - Find duplicates

2. **Two Sum Pattern**
   - Store complement in hash

3. **Grouping**
   - Group anagrams
   - Group by property

4. **Set Operations**
   - Intersection, union
   - Check membership

5. **Rolling Hash**
   - Rabin-Karp string matching
   - Find repeated substrings

## Practice Problems

### Easy
- [ ] Two Sum
- [ ] Contains Duplicate
- [ ] Valid Anagram
- [ ] First Unique Character in String
- [ ] Intersection of Two Arrays

### Medium
- [ ] Group Anagrams
- [ ] Top K Frequent Elements
- [ ] Subarray Sum Equals K
- [ ] Longest Substring Without Repeating Characters
- [ ] 4Sum II

### Hard
- [ ] Longest Consecutive Sequence
- [ ] Substring with Concatenation of All Words
- [ ] Find All Anagrams in String

## Hash-based Data Structures

### HashMap/Dictionary
```python
# Python: dict
# Java: HashMap
# C++: unordered_map
```

### HashSet
```python
# Python: set
# Java: HashSet
# C++: unordered_set
```

### LRU Cache
- Combination of HashMap + Doubly Linked List
- O(1) get and put operations

## Notes

Add your personal notes and insights here as you learn.
