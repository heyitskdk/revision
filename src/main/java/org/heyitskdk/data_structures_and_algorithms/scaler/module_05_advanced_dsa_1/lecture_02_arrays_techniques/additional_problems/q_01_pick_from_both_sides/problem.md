# Pick From Both Sides

## Problem Description

You are given an integer array `A` of size `N`.

You have to perform exactly `B` operations. In each operation, you can remove either the leftmost or the rightmost element of the array.

Find and return the maximum possible sum of the `B` elements removed after performing all `B` operations.

**Note:** If `B = 3` and the array contains `10` elements, then the possible choices are:

- Remove 3 elements from the front and 0 from the back.
- Remove 2 elements from the front and 1 from the back.
- Remove 1 element from the front and 2 from the back.
- Remove 0 elements from the front and 3 from the back.

## Problem Constraints

```text
1 <= N <= 10^5
1 <= B <= N
-10^3 <= A[i] <= 10^3
```

## Input Format

```text
The first argument is an integer array A.

The second argument is an integer B.
```

## Output Format

```text
Return an integer denoting the maximum possible sum of the removed elements.
```

## Example Input

### Input 1

```text
A = [5, -2, 3, 1, 2]
B = 3
```

### Input 2

```text
A = [2, 3, -1, 4, 2, 1]
B = 4
```

## Example Output

### Output 1

```text
8
```

### Output 2

```text
9
```

## Example Explanation

### Explanation 1

```text
Remove 5 from the front and 1, 2 from the back.

Sum = 5 + 1 + 2 = 8
```

### Explanation 2

```text
Remove the first element and the last three elements.

Removed elements: 2, 4, 2, 1

Sum = 2 + 4 + 2 + 1 = 9
```