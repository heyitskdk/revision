# Subarray with Least Average

## Problem Description

Given an array `A` of size `N` and an integer `B`, find the subarray of size `B` that has the least average.

Return the index of the first element of that subarray.

## Problem Constraints

```text
1 <= B <= N <= 10^5
-10^5 <= A[i] <= 10^5
```

## Input Format

```text
The first argument is an array A of integers of size N.

The second argument is an integer B.
```

## Output Format

```text
Return the index of the first element of the subarray of size B that has the least average.

Array indexing starts from 0.
```

## Example Input

### Input 1

```text
A = [3, 7, 90, 20, 10, 50, 40]
B = 3
```

### Input 2

```text
A = [3, 7, 5, 20, -10, 0, 12]
B = 2
```

## Example Output

### Output 1

```text
3
```

### Output 2

```text
4
```

## Example Explanation

### Explanation 1

```text
The subarray from index 3 to 5 is:

[20, 10, 50]

It has the least average among all subarrays of size 3.

Hence, return 3.
```

### Explanation 2

```text
The subarray from index 4 to 5 is:

[-10, 0]

It has the minimum average among all subarrays of size 2.

Hence, return 4.
```