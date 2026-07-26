# Array Rotation

## Problem Description

Given an integer array `A` of size `N` and an integer `B`, return the same array after rotating it `B` times towards the right.

## Problem Constraints

```text
1 <= N <= 10^5
1 <= A[i] <= 10^9
1 <= B <= 10^9
```

## Input Format

```text
The first argument is the integer array A.

The second argument is the integer B.
```

## Output Format

```text
Return the array A after rotating it B times towards the right.
```

## Example Input

### Input 1

```text
A = [1, 2, 3, 4]
B = 2
```

### Input 2

```text
A = [2, 5, 6]
B = 1
```

## Example Output

### Output 1

```text
[3, 4, 1, 2]
```

### Output 2

```text
[6, 2, 5]
```

## Example Explanation

### Explanation 1

```text
Rotate the array towards the right 2 times:

[1, 2, 3, 4]
→ [4, 1, 2, 3]
→ [3, 4, 1, 2]
```

### Explanation 2

```text
Rotate the array towards the right 1 time:

[2, 5, 6]
→ [6, 2, 5]
```