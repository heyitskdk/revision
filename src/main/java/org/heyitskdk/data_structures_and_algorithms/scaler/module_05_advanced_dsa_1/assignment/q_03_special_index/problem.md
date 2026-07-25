# Special Index

## Problem Description

Given an array `A` of size `N`, find the count of array indices such that removing the element at that index makes the sum of elements at even indices equal to the sum of elements at odd indices in the resulting array.

## Problem Constraints

```text
1 <= N <= 10^5
-10^5 <= A[i] <= 10^5
Sum of all elements of A <= 10^9
```

## Input Format

```text
The first argument contains an array A of integers of size N.
```

## Output Format

```text
Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed elements equal.
```

## Example Input

### Input 1

```text
A = [2, 1, 6, 4]
```

### Input 2

```text
A = [1, 1, 1]
```

## Example Output

### Output 1

```text
1
```

### Output 2

```text
3
```

## Example Explanation

### Explanation 1

```text
Removing A[1] modifies the array to:

[2, 6, 4]

Now,

A[0] + A[2] = 2 + 4 = 6
A[1] = 6

The sum of elements at even indices equals the sum of elements at odd indices.

Hence, the answer is 1.
```

### Explanation 2

```text
Removing A[0] modifies the array to:

[1, 1]

Even-index sum = Odd-index sum.

Removing A[1] modifies the array to:

[1, 1]

Even-index sum = Odd-index sum.

Removing A[2] modifies the array to:

[1, 1]

Even-index sum = Odd-index sum.

Hence, the answer is 3.
```