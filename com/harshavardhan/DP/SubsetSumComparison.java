package com.harshavardhan.DP;

/*
===============================================================================
                   SUBSET SUM PROBLEM — 3 APPROACHES COMPARISON
===============================================================================

Problem:
--------
Given an array of integers and a target sum W, determine if there is a subset
of the given set with a sum equal to W.

Approaches implemented:
-----------------------
1. Pure Recursion (Brute Force)
2. Memoization (Top-Down Dynamic Programming)
3. Tabulation (Bottom-Up Dynamic Programming)

-------------------------------------------------------------------------------
| Approach      | Time Complexity | Space Complexity | Pros                   | Cons                               |
|---------------|-----------------|------------------|------------------------|------------------------------------|
| Recursion     | O(2^n)          | O(n)             | Very simple & intuitive| Extremely slow for large n         |
| Memoization   | O(n*W)          | O(n*W)+O(n)      | Faster, avoids repeats | Uses extra memory, recursion depth |
| Tabulation    | O(n*W)          | O(n*W)           | No recursion, fast     | Needs careful table setup          |
-------------------------------------------------------------------------------
n = number of items
W = target sum

Key Points:
-----------
✓ Base cases: 
  - If sum == 0 → TRUE (empty subset works)
  - If n == 0 & sum > 0 → FALSE

✓ Recurrence for both Memoization and Tabulation:
    if val[n-1] <= sum:
        include = dp[n-1][sum - val[n-1]]
        exclude = dp[n-1][sum]
        dp[n][sum] = include OR exclude
    else:
        dp[n][sum] = dp[n-1][sum]

===============================================================================
*/

import java.util.*;

public class SubsetSumComparison {

    // -------------------- 1. PURE RECURSION --------------------
    static boolean subsetSumRec(int[] val, int n, int w) {
        if (w == 0) return true;           // found sum
        if (n == 0) return false;          // no elements left
        if (val[n-1] <= w) {
            return subsetSumRec(val, n-1, w - val[n-1]) || subsetSumRec(val, n-1, w);
        } else {
            return subsetSumRec(val, n-1, w);
        }
    }

    // -------------------- 2. MEMOIZATION --------------------
    static Boolean[][] memo;
    static boolean subsetSumMemo(int[] val, int n, int w) {
        if (w == 0) return true;
        if (n == 0) return false;
        if (memo[n][w] != null) return memo[n][w];
        if (val[n-1] <= w) {
            memo[n][w] = subsetSumMemo(val, n-1, w - val[n-1]) || subsetSumMemo(val, n-1, w);
        } else {
            memo[n][w] = subsetSumMemo(val, n-1, w);
        }
        return memo[n][w];
    }

    // -------------------- 3. TABULATION --------------------
    static boolean[][] dp;
    static boolean subsetSumTab(int[] val, int n, int w) {
        for (int i = 0; i <= n; i++) dp[i][0] = true;   // sum 0 is always true
        for (int j = 1; j <= w; j++) dp[0][j] = false;  // 0 items → no positive sum

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (val[i-1] <= j) {
                    dp[i][j] = dp[i-1][j - val[i-1]] || dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][w];
    }

    public static void main(String[] args) {
        int[] val = {2, 3, 7, 8, 10};
        int w = 11;
        int n = val.length;

        // ---------------- RUNNING ALL APPROACHES ----------------
        System.out.println("==== SUBSET SUM PROBLEM — THREE APPROACHES ====\n");

        // 1. Pure recursion
        System.out.println("1) Pure Recursion:");
        System.out.println("   Expected: Very slow for large inputs, simple logic.");
        boolean ans1 = subsetSumRec(val, n, w);
        System.out.println("   Result: " + ans1 + "\n");

        // 2. Memoization
        System.out.println("2) Recursion with Memoization:");
        memo = new Boolean[n+1][w+1];
        boolean ans2 = subsetSumMemo(val, n, w);
        System.out.println("   Result: " + ans2 + "\n");

        // 3. Tabulation
        System.out.println("3) Iterative Tabulation:");
        dp = new boolean[n+1][w+1];
        boolean ans3 = subsetSumTab(val, n, w);
        System.out.println("   Result: " + ans3 + "\n");

        // Summary table at runtime
        System.out.println("----------------------------------------------------------");
        System.out.println("Approach   | Time     | Space      | Pros                | Cons");
        System.out.println("----------------------------------------------------------");
        System.out.println("Recursion  | O(2^n)   | O(n)       | Easy to write       | Very slow");
        System.out.println("Memoization| O(n*W)   | O(n*W)+O(n)| Faster, simple DP   | Recursion depth limit");
        System.out.println("Tabulation | O(n*W)   | O(n*W)     | Fast, no recursion  | Needs careful setup");
        System.out.println("----------------------------------------------------------");
    }
}

