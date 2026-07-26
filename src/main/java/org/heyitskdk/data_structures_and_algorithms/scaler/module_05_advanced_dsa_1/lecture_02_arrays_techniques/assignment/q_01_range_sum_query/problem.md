# Range Sum Query

## Problem Description

You are given an integer array `A` of length `N`.

You are also given a 2D integer array `B` with dimensions `M × 2`, where each row represents a query `[L, R]`.

For each query, find the sum of all elements from index `L` to index `R` (both inclusive) in array `A`.

More formally, for each query, compute:

```text
A[L] + A[L + 1] + A[L + 2] + ... + A[R]
```

## Problem Constraints

```text
1 <= N, M <= 10^5
1 <= A[i] <= 10^9
0 <= L <= R < N
```

## Input Format

```text
The first argument is the integer array A.
The second argument is the 2D integer array B.
```

## Output Format

```text
Return an integer array of length M, where the i-th element is the answer for the i-th query in B.
```

## Example Input

### Input 1

```text
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
```

### Input 2

```text
A = [2, 2, 2]
B = [[0, 0], [1, 2]]
```

## Example Output

### Output 1

```text
[10, 5]
```

### Output 2

```text
[2, 4]
```

## Example Explanation

### Explanation 1

```text
The sum of all elements from A[0] to A[3] is:

1 + 2 + 3 + 4 = 10

The sum of all elements from A[1] to A[2] is:

2 + 3 = 5
```

### Explanation 2

```text
The sum of all elements from A[0] to A[0] is:

2

The sum of all elements from A[1] to A[2] is:

2 + 2 = 4
```