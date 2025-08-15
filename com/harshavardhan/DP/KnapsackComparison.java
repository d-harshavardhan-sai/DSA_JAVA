package com.harshavardhan.DP;

/*
------------------------------------------------------------
0/1 KNAPSACK – THREE APPROACHES COMPARISON
------------------------------------------------------------

APPROACH 1: Pure Recursion
    - TIME: O(2^n) (tries all subsets)
    - SPACE: O(n) stack (no DP table)
    - PROS: Very simple to code, great for learning recursion
    - CONS: Extremely slow for large n (n > 25)

APPROACH 2: Memoization (Top-Down DP)
    - TIME: O(n * W)  (stores results to avoid recomputation)
    - SPACE: O(n * W) for table + O(n) for recursion stack
    - PROS: Still recursive & easy to map to recurrence
    - CONS: Recursion depth limit for very large n

APPROACH 3: Tabulation (Bottom-Up DP)
    - TIME: O(n * W)
    - SPACE: O(n * W)  (can be optimized to O(W))
    - PROS: Iterative, no recursion depth issue, usually faster in practice
    - CONS: Needs careful index handling

------------------------------------------------------------
| Approach      | Time Complexity| Space Complexity | Pros                                      | Cons                               |
|---------------|----------------|------------------|-------------------------------------------|------------------------------------|
| Recursion     | O(2^n)         | O(n)             | Simple, teaches recursion                 | Very slow, redundant calls         |
| Memoization   | O(n*W)         | O(n*W) + O(n)    | Faster, maps to recursive formula         | Recursion depth limit              |
| Tabulation    | O(n*W)         | O(n*W)           | No recursion depth, fast in production    | Slightly harder to visualize flow  |
------------------------------------------------------------
*/

import java.util.*;

public class KnapsackComparison {

    // ------------------------ APPROACH 1: PURE RECURSION ------------------------
    static int knapSackRec(int[] wt, int[] val, int n, int w) {
        if (n == 0 || w == 0) return 0; // Base case
        if (wt[n - 1] <= w) {
            // Include or exclude
            return Math.max(
                val[n - 1] + knapSackRec(wt, val, n - 1, w - wt[n - 1]),
                knapSackRec(wt, val, n - 1, w)
            );
        } else {
            // Skip item
            return knapSackRec(wt, val, n - 1, w);
        }
    }

    // ------------------------ APPROACH 2: MEMOIZATION ------------------------
    static int[][] memo;
    static int knapSackMem(int[] wt, int[] val, int n, int w) {
        if (n == 0 || w == 0) return 0;
        if (memo[n][w] != -1) return memo[n][w]; // already computed

        if (wt[n - 1] <= w) {
            memo[n][w] = Math.max(
                val[n - 1] + knapSackMem(wt, val, n - 1, w - wt[n - 1]),
                knapSackMem(wt, val, n - 1, w)
            );
        } else {
            memo[n][w] = knapSackMem(wt, val, n - 1, w);
        }
        return memo[n][w];
    }

    // ------------------------ APPROACH 3: TABULATION ------------------------
    static int[][] tab;
    static int knapSackTab(int[] wt, int[] val, int n, int w) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (wt[i - 1] <= j) {
                    tab[i][j] = Math.max(
                        val[i - 1] + tab[i - 1][j - wt[i - 1]],
                        tab[i - 1][j]
                    );
                } else {
                    tab[i][j] = tab[i - 1][j];
                }
            }
        }
        return tab[n][w];
    }

    public static void main(String[] args) {
        int[] wt = { 2, 5, 4, 1, 6, 3 };
        int[] val = { 10, 30, 15, 10, 40, 50 };
        int n = wt.length;
        int W = 10;

        // ----------- Approach 1: Pure Recursion -----------
        System.out.println("=== Approach 1: Pure Recursion ===");
        System.out.println("Expected: Slow for large n, simple to code");
        int ans1 = knapSackRec(wt, val, n, W);
        System.out.println("Max Value (Pure Recursion) = " + ans1);
        System.out.println();

        // ----------- Approach 2: Memoization -----------
        System.out.println("=== Approach 2: Memoization (Top-Down DP) ===");
        memo = new int[n + 1][W + 1];
        for (int[] row : memo) Arrays.fill(row, -1);
        int ans2 = knapSackMem(wt, val, n, W);
        System.out.println("Max Value (Memoization) = " + ans2);
        System.out.println();

        // ----------- Approach 3: Tabulation -----------
        System.out.println("=== Approach 3: Tabulation (Bottom-Up DP) ===");
        tab = new int[n + 1][W + 1];
        int ans3 = knapSackTab(wt, val, n, W);
        System.out.println("Max Value (Tabulation) = " + ans3);
        System.out.println();

        // ----------- Summary table printed at runtime -----------
        System.out.println("------------------------------------------------------------");
        System.out.println("APPROACH COMPARISON SUMMARY");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-12s %-15s %-18s %-30s %-30s%n",
                "Approach", "Time Complexity", "Space Complexity", "Pros", "Cons");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-12s %-15s %-18s %-30s %-30s%n",
                "Recursion", "O(2^n)", "O(n)", "Easy to write, good for learning", "Very slow, redundant work");
        System.out.printf("%-12s %-15s %-18s %-30s %-30s%n",
                "Memoization", "O(n*W)", "O(n*W)+O(n)", "Recursive but fast", "Stack overflow if n large");
        System.out.printf("%-12s %-15s %-18s %-30s %-30s%n",
                "Tabulation", "O(n*W)", "O(n*W)", "Fast, no recursion limit", "More setup, less intuitive");
        System.out.println("------------------------------------------------------------");
    }
}

