[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/p_5VJwdK)
# Experiment 24: Spiral Matrix

## Problem Statement

Given a matrix of size $r \times c$, where $r$ is the number of rows and $c$ is the number of columns. Traverse the matrix in **spiral form**.

Spiral traversal starts at the top-left corner and proceeds in a clockwise direction, spiraling inwards.

## Input Format

* The first line contains two integers $r$ and $c$.
* The next $r$ lines contain $c$ space-separated integers each.

## Output Format

Print the spiral traversal of the matrix elements in a single line.

### Example 1

**Input:**

```text
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
```

**Output:**

```text
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
```

**Explanation:**
The traversal path is:
1. Top row (left to right): 1 2 3 4
2. Right column (top to bottom): 8 12 16
3. Bottom row (right to left): 15 14 13
4. Left column (bottom to top): 9 5
5. Inner top row: 6 7
6. Inner right column: 11
7. Inner bottom row: 10
