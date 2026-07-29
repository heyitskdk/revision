# First Missing Positive Integer

## Problem Description

Given an unsorted integer array, A of size N. Find the first missing positive integer.

**Note:** Your algorithm should run in O(n) time and use constant space.

## Problem Constraints

```text
1 <= N <= 1000000

-10^9 <= A[i] <= 10^9
```

## Input Format

```text
First argument is an integer array A.
```

## Output Format

```text
Return an integer denoting the first missing positive integer.
```

## Example Input

### Input 1

```text
[1, 2, 0]
```

### Input 2

```text
[3, 4, -1, 1]
```

### Input 3

```text
[-8, -7, -6]
```

## Example Output

### Output 1

```text
3
```

### Output 2

```text
2
```

### Output 3

```text
1
```

## Example Explanation

### Explanation 1

```text
A = [1, 2, 0]
First positive integer missing from the array is 3.
```

### Explanation 2

```text
A = [3, 4, -1, 1]
First positive integer missing from the array is 2.
```

### Explanation 3

```text
A = [-8, -7, -6]
First positive integer missing from the array is 1.
```