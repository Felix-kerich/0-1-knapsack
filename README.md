Dynamic Programming:
$ java DynamicProgramming.java 
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Maximum value in Knapsack = 220


Brute Force:
$ java KnapsackBruteForce.java 
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Maximum value: 220

Algorithms:
Dynamic Programming:
1. Create a table `dp` of dimensions ((n+1) times (W+1); here, `dp[i][w]` means the
maximum value that can be reached using the first `(i)` items and capacity `(w)` of the
knapsack.
2. The first row and the first column should be set to 0. Cases of either no items or zero
capacity are represented by such.
3. For each item (i) (from 1 to (n)):
For each weight (w) (from 1 to (W)):
If the weight of the item (i) is less than or equal to (w), update the table entry `dp[i]
[w]` as:
[
dp[i][w] = max(dp[i-1][w], Text{value}[i-1] + dp[i-1][w-text{weight}[i-1]])
]
Otherwise, set:
[
dp[i][w] = dp[i-1][w]
]
4. The maximum value is found at `dp[n][W]`.

Brute force:
1. For any subset of items:
i. The total weight and value of the subset should be calculated.
ii. If the sum of weights is less than or equal to the knapsack capacity, update the maximum
value if the subset value is higher than the current maximum.
2. The last maximum value is optimal.

                   
