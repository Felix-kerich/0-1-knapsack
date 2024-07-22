//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DynamicProgramming {
    public static int knapsackDP(int [] values, int [] weights, int  W) {
    int n = values.length;  // Number of items
    int[][] dp = new int[n + 1][W + 1];  // DP table to store maximum value for each weight capacity

    // //Build table dp[][] in a bottom-up manner
        for (int i = 1; i <= n; i++) {  // Loop through all items
        for (int w = 0; w <= W; w++) {  // Loop through all weight capacities from 0 to W
            if (weights[i - 1] <= w) {  // Check if the weight of the current item is less than or equal to the current weight capacity
                // Max value by either including the current item or not including it
                dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
            } else {
                dp[i][w] = dp[i - 1][w];  // If item weight is more, we can't include it
            }
        }
    }

        return dp[n][W];  // The last cell of dp table holds the result
}

public static void main(String[] args){
    int[] values = {60, 100, 120};  // Values of the items
    int[] weights = {10, 20, 30};  // Weights of the items
    int W = 50;  // Maximum weight capacity of the knapsack

    System.out.println("Maximum value in Knapsack = " + knapsackDP(values, weights, W));
 }
}
