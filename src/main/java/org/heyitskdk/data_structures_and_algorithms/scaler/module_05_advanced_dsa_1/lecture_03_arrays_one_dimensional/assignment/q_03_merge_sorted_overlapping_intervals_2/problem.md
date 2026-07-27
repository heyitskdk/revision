# Merge Sorted Overlapping Intervals - 2

## Problem Description

You are given a collection of intervals `A` in a 2-dimensional array, where each interval is represented as a pair of integers:

```text
[start, end]
```

The intervals are sorted in ascending order based on their start values.

Your task is to merge all overlapping intervals and return the resulting list of non-overlapping intervals.

## Problem Constraints

```text
1 <= len(A) <= 100000
1 <= A[i][0] <= A[i][1] <= 100000
```

```text
A is sorted based on the start value (A[i][0]).
```

## Input Format

```text
The first argument is a 2-dimensional array representing the list of intervals.
```

## Output Format

```text
Return the sorted list of intervals after merging all the overlapping intervals.
```

## Example Input

### Input 1

```text
A = [[1, 3], [2, 6], [8, 10], [15, 18]]
```

### Input 2

```text
A = [[2, 10], [4, 9], [6, 7]]
```

## Example Output

### Output 1

```text
[[1, 6], [8, 10], [15, 18]]
```

### Output 2

```text
[[2, 10]]
```

## Example Explanation

### Explanation 1

```text
Merge the overlapping intervals:

[1, 3] and [2, 6] → [1, 6]

The remaining intervals do not overlap.

Hence, the final merged intervals are:

[[1, 6], [8, 10], [15, 18]]
```

### Explanation 2

```text
The intervals [4, 9] and [6, 7] lie completely inside [2, 10].

Therefore, all three intervals merge into:

[[2, 10]]
```