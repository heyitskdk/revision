# Product Array Puzzle

## Problem Description

Given an array of integers `A`, find and return the product array of the same size, where the `i`-th element of the product array is equal to the product of all the elements of the array except `A[i]`.

**Note:**

- It is always possible to form the product array with 32-bit integer values.
- Solve the problem **without using the division operator**.

## Problem Constraints

```text
2 <= length of the array <= 1000
1 <= A[i] <= 10
```

## Input Format

```text
The only argument is the integer array A.
```

## Output Format

```text
Return the product array.
```

## Example Input

### Input 1

```text
A = [1, 2, 3, 4, 5]
```

### Input 2

```text
A = [5, 1, 10, 1]
```

## Example Output

### Output 1

```text
[120, 60, 40, 30, 24]
```

### Output 2

```text
[10, 50, 5, 50]
```

## Example Explanation

### Explanation 1

```text
For each index, multiply all the elements except the current one.

Index 0: 2 × 3 × 4 × 5 = 120
Index 1: 1 × 3 × 4 × 5 = 60
Index 2: 1 × 2 × 4 × 5 = 40
Index 3: 1 × 2 × 3 × 5 = 30
Index 4: 1 × 2 × 3 × 4 = 24
```

### Explanation 2

```text
For each index, multiply all the elements except the current one.

Index 0: 1 × 10 × 1 = 10
Index 1: 5 × 10 × 1 = 50
Index 2: 5 × 1 × 1 = 5
Index 3: 5 × 1 × 10 = 50
```