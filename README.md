<div align="center">

# 🌟 Dynamic Programming Easy Practice Sheet

</div>

<div align="center">

🔗 Your first step towards mastering DP in interviews!  
Level up with the most effective starter problems.

</div>

---

## 🚀 Why This Sheet?

Build your intuition for dynamic programming through fun, interview-grade problems and step-by-step practice.  
Each problem is handpicked for clear state definition, transition logic, and DP optimization skills!

---

## ✨ Problems Gallery

| # | Title | 🔗 Link | 💡 Tags | Formula |
|:-:|:---------------------|:----:|:----------------------|:--------|
| 1 | Climbing Stairs | [Practice](https://leetcode.com/problems/climbing-stairs/description/) | Basic DP, Fibonacci | <details><summary>Show Formula</summary>dp[i] = dp[i-1] + dp[i-2]</details> |
| 2 | Min Cost Climbing Stairs | [Practice](https://leetcode.com/problems/min-cost-climbing-stairs/description/) | Path DP, Minimum Cost | <details><summary>Show Formula</summary>dp[i] = cost[i] + min(dp[i-1], dp[i-2])</details> |
| 3 | Fibonacci Number | [Practice](https://leetcode.com/problems/fibonacci-number/description/) | Recursive DP | <details><summary>Show Formula</summary>fib(n) = fib(n-1) + fib(n-2)</details> |
| 4 | N-th Tribonacci Number | [Practice](https://leetcode.com/problems/n-th-tribonacci-number/description/) | Extended Recursion, DP | <details><summary>Show Formula</summary>trib(n) = trib(n-1) + trib(n-2) + trib(n-3)</details> |
| 5 | Count Number of Ways to Place Houses | [Practice](https://leetcode.com/problems/count-number-of-ways-to-place-houses/description/) | Combinatorics, DP | <details><summary>Show Formula</summary>dp[i] = dp[i-1] + dp[i-2]</details> |

---

## 🏁 How to Practice

1. **Read the problem** - Understand the constraints and the goal.
2. **Start simple** - Try recursion first, then introduce memoization or tabulation.
3. **Track patterns** - Notice the subproblem relationships, form your 'state'.
4. **Optimize** - Always check if your solution can be made more efficient.

---

## 📚 Quick DP Concepts

- **State:** What defines your subproblem? (e.g., steps, index, choices)
- **Transition:** How do previous states build the solution?
- **Base Case:** When does DP stop recurring or iterating?
- **Memoization/Tabulation:** Store answers to avoid recalculation.

---

> 💬 **Share and discuss solutions — collaboration brings mastery!**

<div align="center">

🧠 ***Consistent practice = DP intuition. Start now, crack your dream job later!***

</div>

---

### 🥇 Pro Tip

Try each problem in both recursive (top-down) and iterative (bottom-up) versions.  
Compare their space and time efficiency.

---

<div align="center">

Made for ambitious DSA learners 🚀  
Happy problem solving! 🧑‍💻✨

</div>

---

## 🔥 Subarray Problems (Prefix Sum & HashMap)

This section curates classic subarray challenges, focusing on efficient sum calculations using prefix sums and hashmap-based techniques.

| # | Title | 🔗 Link | 💡 Tags | Formula |
|:-:|:---------------------|:----:|:----------------------|:--------|
| 1 | Subarray with Given Sum | [Practice](https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1) | Sliding Window, Prefix Sum | <details><summary>Show Formula</summary>Use sliding window or prefix sums to find subarray with sum = target.</details> |
| 2 | Longest Subarray with Sum K | [Practice](https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1) | Prefix Sum, HashMap | <details><summary>Show Formula</summary>If curr_sum-k exists in map:<br>ans = max(ans, i - map[curr_sum-k])<br>curr_sum += arr[i]</details> |
| 3 | Largest Subarray with 0 Sum | [Practice](https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1) | Prefix Sum, HashMap, Zero Sum | <details><summary>Show Formula</summary>If curr_sum = 0 or curr_sum exists in map:<br>ans = max(ans, i - map[curr_sum])<br>curr_sum += arr[i]</details> |
| 4 | Largest Subarray of 0s and 1s | [Practice](https://www.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/1) | Prefix Sum, HashMap, Binary Array | <details><summary>Show Formula</summary>Convert 0 to -1, then find largest subarray with sum 0 using prefix sums.</details> |
| 5 | Count Subarrays with Equal 1s and 0s | [Practice](https://www.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1) | Prefix Sum, HashMap, Counting | <details><summary>Show Formula</summary>Convert 0 to -1, count prefix sums, count pairs with same sum.</details> |
| 6 | Subarrays with Sum K | [Practice](https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1) | Prefix Sum, HashMap, Counting | <details><summary>Show Formula</summary>If curr_sum-k exists in map:<br>count += map[curr_sum-k]<br>curr_sum += arr[i]</details> |
| 7 | Zero Sum Subarrays | [Practice](https://www.geeksforgeeks.org/problems/zero-sum-subarrays1825/1) | HashMap, Prefix Sum | <details><summary>Show Formula</summary>If curr_sum exists in map:<br>count += map[curr_sum]<br>map[curr_sum]++<br>curr_sum += arr[i]</details> |
| 8 | Subarray with 0 Sum | [Practice](https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1) | HashSet, Prefix Sum | <details><summary>Show Formula</summary>If curr_sum == 0 or curr_sum in set:<br>return True<br>curr_sum += arr[i]</details> |
| 9 | Longest Subarray with Sum Divisible by K | [Practice](https://www.geeksforgeeks.org/problems/longest-subarray-with-sum-divisible-by-k1259/1) | Prefix Sum, HashMap, Modulo | <details><summary>Show Formula</summary>Use prefix sums and mod k:<br>if (curr_sum % k) seen before at index j:<br>ans = max(ans, i-j)</details> |
| 10 | Sub-array Sum Divisible by K | [Practice](https://www.geeksforgeeks.org/problems/sub-array-sum-divisible-by-k2617/1) | Prefix Sum, Counting, Modulo | <details><summary>Show Formula</summary>Count pairs of prefix sums with same mod k value:</details> |



---

### 🌈 Prefix Sum & HashMap Quick Concepts

- **Prefix Sum:** Running cumulative sum used to quickly compute range sums.
- **HashMap/HashSet:** Used for fast existence and counting checks of cumulative sums.

> ⚡ **Expand "Show Formula" for implementation hints!**

---

Feel free to add more problems or topics as you expand your practice sheet. The format is scalable and remains visually appealing for new learners and experienced coders alike
