# Mathematics

## Overview

Mathematical algorithms and techniques frequently used in competitive programming and problem-solving.

## Number Theory

### Prime Numbers
- **Sieve of Eratosthenes**: Find all primes up to n - O(n log log n)
- **Primality Testing**: Check if number is prime
- **Prime Factorization**: Express number as product of primes

### GCD and LCM
- **Euclidean Algorithm**: Find GCD in O(log min(a,b))
- **Extended Euclidean**: Find coefficients x, y for ax + by = gcd(a,b)
- **LCM**: lcm(a,b) = (a × b) / gcd(a,b)

### Modular Arithmetic
- **(a + b) mod m = ((a mod m) + (b mod m)) mod m**
- **(a × b) mod m = ((a mod m) × (b mod m)) mod m**
- **Modular Exponentiation**: a^b mod m - O(log b)
- **Modular Inverse**: a × a⁻¹ ≡ 1 (mod m)

## Combinatorics

### Permutations and Combinations
- **Permutation**: P(n,r) = n! / (n-r)!
- **Combination**: C(n,r) = n! / (r! × (n-r)!)
- **Pascal's Triangle**: C(n,r) = C(n-1,r-1) + C(n-1,r)

### Catalan Numbers
- **Formula**: C(n) = (2n)! / ((n+1)! × n!)
- **Applications**: 
  - Valid parentheses
  - Binary search trees
  - Polygon triangulation

## Geometry

### Basic Formulas
- Distance between points: √((x₂-x₁)² + (y₂-y₁)²)
- Slope: (y₂-y₁) / (x₂-x₁)
- Area of triangle: |x₁(y₂-y₃) + x₂(y₃-y₁) + x₃(y₁-y₂)| / 2

### Computational Geometry
- Point in polygon
- Convex hull
- Line intersection
- Closest pair of points

## Bit Manipulation

### Basic Operations
- **Check bit**: (n & (1 << i)) != 0
- **Set bit**: n | (1 << i)
- **Clear bit**: n & ~(1 << i)
- **Toggle bit**: n ^ (1 << i)

### Useful Tricks
- **Check power of 2**: (n & (n-1)) == 0
- **Count set bits**: Brian Kernighan's algorithm
- **XOR properties**: a ^ a = 0, a ^ 0 = a
- **Get rightmost set bit**: n & (-n)

## Matrix Operations

### Matrix Multiplication
- Time: O(n³) naive, O(n^2.81) Strassen
- Used in graph problems, DP optimization

### Matrix Exponentiation
- Compute A^n in O(k³ log n) where k is matrix size
- Used for recurrence relations (Fibonacci)

## Probability and Statistics

### Basic Probability
- P(A ∪ B) = P(A) + P(B) - P(A ∩ B)
- P(A ∩ B) = P(A) × P(B|A)
- Expected value: E[X] = Σ xᵢ × P(xᵢ)

### Common Distributions
- Uniform distribution
- Binomial distribution
- Geometric distribution

## Special Number Sequences

### Fibonacci
- F(n) = F(n-1) + F(n-2)
- Matrix exponentiation for O(log n)

### Factorial
- n! = n × (n-1) × ... × 1
- Trailing zeros = count of 5s in prime factorization

### Power Set
- Number of subsets = 2^n

## Practice Problems

### Number Theory
- [ ] Count Primes
- [ ] Happy Number
- [ ] Ugly Number II
- [ ] Perfect Squares

### Combinatorics
- [ ] Pascal's Triangle
- [ ] Unique Paths
- [ ] Climbing Stairs
- [ ] Combination Sum

### Bit Manipulation
- [ ] Single Number
- [ ] Number of 1 Bits
- [ ] Reverse Bits
- [ ] Power of Two

### Mathematical
- [ ] Pow(x, n)
- [ ] Sqrt(x)
- [ ] Excel Sheet Column Number
- [ ] Factorial Trailing Zeroes
- [ ] Add Binary

### Geometry
- [ ] Valid Square
- [ ] Rectangle Overlap
- [ ] Max Points on a Line

## Advanced Topics

### Chinese Remainder Theorem
Solve system of modular equations

### Fast Fourier Transform (FFT)
Polynomial multiplication in O(n log n)

### Linear Programming
Optimization problems with constraints

### Game Theory
Nim game, Sprague-Grundy theorem

## Important Formulas

```
Sum of first n numbers: n(n+1)/2
Sum of first n squares: n(n+1)(2n+1)/6
Sum of first n cubes: [n(n+1)/2]²
Sum of GP: a(r^n - 1)/(r-1)
Sum of AP: n/2 × (2a + (n-1)d)
```

## Notes

Add your personal notes and insights here as you learn.
