public class KnapsackBruteForce {
    public static int knapsack(int[] values, int[] weights, int capacity) {
        return knapsackRec(values, weights, capacity, 0);
    }

    private static int knapsackRec(int[] values, int[] weights, int capacity, int index) {
        if (index >= values.length || capacity == 0) {
            return 0;
        }

        // Case 1: Do not include the current item
        int exclude = knapsackRec(values, weights, capacity, index + 1);

        // Case 2: Include the current item (if it fits)
        int include = 0;
        if (weights[index] <= capacity) {
            include = values[index] + knapsackRec(values, weights, capacity - weights[index], index + 1);
        }

        return Math.max(exclude, include);
    }

    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;
        System.out.println("Maximum value: " + knapsack(values, weights, capacity));
    }
}

