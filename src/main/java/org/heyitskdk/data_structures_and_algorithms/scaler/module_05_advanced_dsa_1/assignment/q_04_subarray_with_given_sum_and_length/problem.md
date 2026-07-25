# Subarray With Given Length and Sum

## Problem Description

Given an array `A` of length `N` and two integers `B` and `C`.

Return `1` if there exists a subarray of length `B` whose sum is exactly `C`. Otherwise, return `0`.

## Problem Constraints

```text
1 <= N <= 10^5
1 <= A[i] <= 10^4
1 <= B <= N
1 <= C <= 10^9
```

## Input Format

```text
The first argument is an array of integers A.

The remaining arguments B and C are integers.
```

## Output Format

```text
Return 1 if such a subarray exists.
Otherwise, return 0.
```

## Example Input

### Input 1

```text
A = [4, 3, 2, 6, 1]
B = 3
C = 11
```

### Input 2

```text
A = [4, 2, 2, 5, 1]
B = 4
C = 6
```

## Example Output

### Output 1

```text
1
```

### Output 2

```text
0
```

## Example Explanation

### Explanation 1

```text
The subarray [3, 2, 6] has length 3 and its sum is 11.

Hence, return 1.
```

### Explanation 2

```text
There is no subarray of length 4 whose sum is 6.

Hence, return 0.
```