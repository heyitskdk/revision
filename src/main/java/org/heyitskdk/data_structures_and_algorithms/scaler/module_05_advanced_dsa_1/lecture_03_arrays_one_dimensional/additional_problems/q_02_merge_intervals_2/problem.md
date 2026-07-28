# Merge Intervals 2

## Problem Description

You have a set of non-overlapping intervals. You are given a new interval `[start, end]`,
insert this new interval into the set of intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

## Problem Constraints

```text
0 <= |intervals| <= 10^5
```

## Input Format

```text
First argument is the vector of intervals

second argument is the new interval to be merged
```

## Output Format

```text
Return the vector of intervals after merging
```

## Example Input

### Input 1

```text
Given intervals [1, 3], [6, 9] insert and merge [2, 5] .
```

### Input 2

```text
Given intervals [1, 3], [6, 9] insert and merge [2, 6] .
```

## Example Output

### Output 1

```text
[ [1, 5], [6, 9] ]
```

### Output 2

```text
[ [1, 9] ]
```

## Example Explanation

### Explanation 1

```text
(2,5) does not completely merge the given intervals
```

### Explanation 2

```text
(2,6) completely merges the given intervals
```