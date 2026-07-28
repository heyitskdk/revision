# Flip

## Problem Description

You are given a binary string `A` consisting only of the characters `0` and `1`.

In a single operation, you may choose two indices `L` and `R` such that:

```text
1 <= L <= R <= N
```

Then flip every character from index `L` to index `R`, both inclusive.

Flipping means:

```text
0 becomes 1
1 becomes 0
```

You may perform **at most one operation**. Your goal is to maximize the number of `1`s in the final string.

If you do not want to perform any operation, return an empty array.

Otherwise, return an array containing two integers `[L, R]`.

If multiple pairs produce the maximum possible number of `1`s, return the lexicographically smallest pair.

A pair `(a, b)` is lexicographically smaller than `(c, d)` if:

```text
a < c
```

or:

```text
a == c and b < d
```

## Problem Constraints

```text
1 <= length of A <= 100000
```

## Input Format

```text
The first and only argument is a binary string A.
```

## Output Format

```text
Return an integer array containing the indices [L, R].

If no operation should be performed, return an empty array.
```

## Example Input

### Input 1

```text
A = "010"
```

### Input 2

```text
A = "111"
```

## Example Output

### Output 1

```text
[1, 1]
```

### Output 2

```text
[]
```

## Example Explanation

### Explanation 1

```text
A = "010"

Pair [L, R]   Final String
[1, 1]        "110"
[1, 2]        "100"
[1, 3]        "101"
[2, 2]        "000"
[2, 3]        "001"
[3, 3]        "011"

The pairs [1, 1] and [1, 3] produce the same maximum number of 1s.

Since [1, 1] is lexicographically smaller, return [1, 1].
```

### Explanation 2

```text
A = "111"

No operation can increase the number of 1s.

Hence, return an empty array.
```