# Continuous Sum Query

## Problem Description

There are `A` beggars sitting in a row outside a temple. Initially, each beggar has an empty pot.

Each devotee donates a fixed number of coins to a contiguous group of beggars.

For each devotee, the donation is represented as:

- `L` – starting beggar index (1-based)
- `R` – ending beggar index (1-based)
- `P` – number of coins donated to each beggar in the range

The donations are given as a 2D array `B`, where:

```text
B[i][0] = L
B[i][1] = R
B[i][2] = P
```

Determine the final number of coins in each beggar's pot after all devotees have made their donations.

## Problem Constraints

```text
1 <= A <= 2 × 10^5
1 <= L <= R <= A
1 <= P <= 10^3
0 <= len(B) <= 10^5
```

## Input Format

```text
The first argument is an integer A.

The second argument is a 2D integer array B.
```

## Output Format

```text
Return a 0-based integer array representing the total number of coins in each beggar's pot.
```

## Example Input

### Input 1

```text
A = 5

B = [
    [1, 2, 10],
    [2, 3, 20],
    [2, 5, 25]
]
```

## Example Output

### Output 1

```text
[10, 55, 45, 25, 25]
```

## Example Explanation

### Explanation 1

```text
Initially:

[0, 0, 0, 0, 0]

After the first devotee donates 10 coins to beggars 1 through 2:

[10, 10, 0, 0, 0]

After the second devotee donates 20 coins to beggars 2 through 3:

[10, 30, 20, 0, 0]

After the third devotee donates 25 coins to beggars 2 through 5:

[10, 55, 45, 25, 25]

Hence, the final answer is:

[10, 55, 45, 25, 25]
```