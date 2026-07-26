# Sum of All Subarray Sums

## Problem Description

You are given an integer array `A` of length `N`.

Find the sum of the sums of all possible subarrays of `A`.

A **subarray** is defined as a contiguous part of an array that can be obtained by deleting zero or more elements from either end of the array.

A **subarray sum** is the sum of all elements present in that subarray.

**Note:** Be careful of integer overflow during calculations. Use appropriate data types.

## Problem Constraints

```text
1 <= N <= 10^5
1 <= A[i] <= 10^4
```

## Input Format

```text
The first argument is the integer array A.
```

## Output Format

```text
Return a single integer denoting the sum of all subarray sums of the given array.
```

## Example Input

### Input 1

```text
A = [1, 2, 3]
```

### Input 2

```text
A = [2, 1, 3]
```

## Example Output

### Output 1

```text
20
```

### Output 2

```text
19
```

## Example Explanation

### Explanation 1

```text
The different subarrays are:

[1], [2], [3], [1, 2], [2, 3], [1, 2, 3]

Their sums are:

1 + 2 + 3 + 3 + 5 + 6 = 20
```

### Explanation 2

```text
The different subarrays are:

[2], [1], [3], [2, 1], [1, 3], [2, 1, 3]

Their sums are:

2 + 1 + 3 + 3 + 4 + 6 = 19
```