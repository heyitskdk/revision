# Max Sum Contiguous Subarray

## Problem Description

Given an array `A` of length `N`, find the maximum possible sum of any non-empty contiguous subarray.

In other words, among all possible contiguous subarrays of `A`, determine the one that yields the highest sum and return that sum.

## Problem Constraints

```text
1 <= N <= 10^6
-1000 <= A[i] <= 1000
```

## Input Format

```text
The first and only argument is an integer array A.
```

## Output Format

```text
Return an integer representing the maximum possible sum of a contiguous subarray.
```

## Example Input

### Input 1

```text
A = [1, 2, 3, 4, -10]
```

### Input 2

```text
A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

## Example Output

### Output 1

```text
10
```

### Output 2

```text
6
```

## Example Explanation

### Explanation 1

```text
The subarray [1, 2, 3, 4] has the maximum possible sum.

Sum = 1 + 2 + 3 + 4 = 10
```

### Explanation 2

```text
The subarray [4, -1, 2, 1] has the maximum possible sum.

Sum = 4 + (-1) + 2 + 1 = 6
```