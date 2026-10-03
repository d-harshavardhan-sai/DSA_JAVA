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
| 11 | Count Subarrays with given XOR | [Practice](https://www.geeksforgeeks.org/problems/count-subarray-with-given-xor/1) | Prefix Sum, Counting, xor | <details><summary>Show Formula</summary>Count pairs of prefix xors:</details> |



---

### 🌈 Prefix Sum & HashMap Quick Concepts

- **Prefix Sum:** Running cumulative sum used to quickly compute range sums.
- **HashMap/HashSet:** Used for fast existence and counting checks of cumulative sums.

> ⚡ **Expand "Show Formula" for implementation hints!**

---

Feel free to add more problems or topics as you expand your practice sheet. The format is scalable and remains visually appealing for new learners and experienced coders alike


## 🔥 Sliding Window Problems

This section curates classic **Sliding Window** challenges, focusing on efficient solutions using **fixed-size** and **variable-size** window techniques.

| # | Title | 🔗 Link | 💡 Tags | Formula |
|:-:|:---------------------|:----:|:----------------------|:--------|
| 1 | Maximum Sum Subarray of Size K | [Practice](https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1) | Fixed Window, Sliding Window | <details><summary>Show Formula</summary>Add `arr[r]` to `curSum`. When window size = `k`: `maxSum = max(maxSum, curSum)`, then remove `arr[l]` and move `l++`.</details> |
| 2 | Count the Number of Subarrays | [Practice](https://www.geeksforgeeks.org/problems/count-the-number-of-subarrays/1) | Variable Window, Sliding Window, Two Pointers | <details><summary>Show Formula</summary>For positive elements, maintain `sum <= k`. When `sum > k`, shrink from left. Number of valid subarrays ending at `r` = `r - l + 1`.</details> |
| 3 | Count Distinct Elements in Every Window | [Practice](https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1) | Variable Window, Two Pointers | <details><summary>Show Formula</summary>Maintain `sum <= k`. While `sum > k`, remove elements from the left. `maxLen = max(maxLen, r-l+1)`.</details> |
| 4 | First Negative in Windows of Size K | [Practice](https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1) | Variable Window, Two Pointers | <details><summary>Show Formula</summary>Add elements until `sum > x`. Then shrink from left while possible and update minimum length.</details> |
| 5 | K Sized Subarray Maximum | [Practice](https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1) | Variable Window, Two Pointers | <details><summary>Show Formula</summary>Add elements until `sum > x`. Then shrink from left while possible and update minimum length.</details> |
| 6 | Maximum MEX from all subarrays of length K | [Practice](https://www.geeksforgeeks.org/dsa/maximum-mex-from-all-subarrays-of-length-k/) | Variable Window, Two Pointers | <details><summary>Show Formula</summary>Add elements until `sum > x`. Then shrink from left while possible and update minimum length.</details> |
| 4 | Smallest Subarray with Sum Greater Than X | [Practice](https://www.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1) | Variable Window, Two Pointers | <details><summary>Show Formula</summary>Add elements until `sum > x`. Then shrink from left while possible and update minimum length.</details> |
| 4 | Smallest Subarray with Sum Greater Than X | [Practice](https://www.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1) | Variable Window, Two Pointers | <details><summary>Show Formula</summary>Add elements until `sum > x`. Then shrink from left while possible and update minimum length.</details> |
| 5 | Longest Subarray with At Most K Distinct Elements | [Practice](https://www.geeksforgeeks.org/) | Variable Window, HashMap, Two Pointers | <details><summary>Show Formula</summary>Maintain frequency of elements in the window. While distinct elements `> k`, shrink from left. `maxLen = max(maxLen, r-l+1)`.</details> |
| 6 | Longest Substring Without Repeating Characters | [Practice](https://www.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1) | Variable Window, HashSet, Two Pointers | <details><summary>Show Formula</summary>Expand right. If duplicate appears, move `l` until the window contains unique characters. `maxLen = max(maxLen, r-l+1)`.</details> |
| 7 | Maximum Number of Consecutive 1s | [Practice](https://www.geeksforgeeks.org/) | Variable Window, Two Pointers | <details><summary>Show Formula</summary>Maintain a window satisfying the allowed number of zeroes. If zero count exceeds the limit, shrink from left.</details> |
| 8 | Maximum Consecutive Ones III | [Practice](https://leetcode.com/problems/max-consecutive-ones-iii/) | Variable Window, Two Pointers | <details><summary>Show Formula</summary>Maintain `zeroCount <= k`. When `zeroCount > k`, shrink from left. `maxLen = max(maxLen, r-l+1)`.</details> |
| 9 | Fruit Into Baskets | [Practice](https://leetcode.com/problems/fruit-into-baskets/) | Variable Window, HashMap, Two Pointers | <details><summary>Show Formula</summary>Maintain at most 2 distinct elements. If distinct count `> 2`, shrink from left. `maxLen = max(maxLen, r-l+1)`.</details> |
| 10 | Minimum Size Subarray Sum | [Practice](https://leetcode.com/problems/minimum-size-subarray-sum/) | Variable Window, Two Pointers | <details><summary>Show Formula</summary>Expand until `sum >= target`, update minimum length, then shrink from left while `sum >= target`.</details> |
| 11 | Longest Repeating Character Replacement | [Practice](https://leetcode.com/problems/longest-repeating-character-replacement/) | Variable Window, Frequency Array, Two Pointers | <details><summary>Show Formula</summary>Window is valid when `(windowSize - maxFrequency) <= k`. Otherwise shrink from left.</details> |
| 12 | Permutation in String | [Practice](https://leetcode.com/problems/permutation-in-string/) | Fixed Window, Frequency Array, Sliding Window | <details><summary>Show Formula</summary>Maintain a window of size `pattern.length()`. Compare character frequencies of the current window with the pattern.</details> |
| 13 | Find All Anagrams in a String | [Practice](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | Fixed Window, Frequency Array, Sliding Window | <details><summary>Show Formula</summary>Use a window of size `pattern.length()`. Add right character, remove left character, and compare frequencies.</details> |
| 14 | Maximum of All Subarrays of Size K | [Practice](https://www.geeksforgeeks.org/problems/maximum-of-subarrays-of-size-k3101/1) | Fixed Window, Deque, Sliding Window | <details><summary>Show Formula</summary>Maintain a decreasing deque of indices. Remove indices outside the window and smaller elements from the back.</details> |
| 15 | First Negative Integer in Every Window of Size K | [Practice](https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3347/1) | Fixed Window, Queue, Sliding Window | <details><summary>Show Formula</summary>Store indices of negative elements. For every window, remove expired indices and use the first remaining negative index.</details> |
| 16 | Count Occurrences of Anagrams | [Practice](https://www.geeksforgeeks.org/) | Fixed Window, Frequency Map, Sliding Window | <details><summary>Show Formula</summary>Maintain a window of pattern length and compare/update character frequencies while sliding.</details> |
| 17 | Longest Subarray After Deleting One Element | [Practice](https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/) | Variable Window, Two Pointers | <details><summary>Show Formula</summary>Maintain at most one `0` in the window. If zero count exceeds 1, shrink from left. Answer = `windowSize - 1`.</details> |
| 18 | Binary Subarrays With Sum | [Practice](https://leetcode.com/problems/binary-subarrays-with-sum/) | Sliding Window, Prefix Sum | <details><summary>Show Formula</summary>For binary arrays: `count(sum = goal) = count(sum <= goal) - count(sum <= goal-1)`.</details> |
| 19 | Subarrays with K Different Integers | [Practice](https://leetcode.com/problems/subarrays-with-k-different-integers/) | Variable Window, HashMap, Sliding Window | <details><summary>Show Formula</summary>`exactly(K) = atMost(K) - atMost(K-1)`.</details> |
| 20 | Subarray Product Less Than K | [Practice](https://leetcode.com/problems/subarray-product-less-than-k/) | Variable Window, Two Pointers, Sliding Window | <details><summary>Show Formula</summary>Maintain `product < k`. When `product >= k`, shrink from left. Number of valid subarrays ending at `r` = `r-l+1`.</details> |

---

### 🧠 Sliding Window Core Patterns

| Pattern | Window Type | Key Condition | Answer |
|:--|:--|:--|:--|
| **Fixed Size** | `r-l+1 == k` | Window size exactly `k` | Max / Min / Count |
| **At Most K** | Variable | Constraint `<= k` | `r-l+1` |
| **At Least K** | Variable | Constraint `>= k` | Shrink + update |
| **Exactly K** | Variable | Exact constraint | `atMost(K) - atMost(K-1)` |
| **Maximum Length** | Variable | Keep window valid | `max(maxLen, r-l+1)` |
| **Minimum Length** | Variable | Expand until valid | `min(minLen, r-l+1)` |
| **Frequency Window** | Variable | Frequency constraint | HashMap / Array |
| **Monotonic Deque** | Fixed / Variable | Maintain increasing/decreasing order | Max / Min |

---

### 🔥 Master Sliding Window Template

#### 1️⃣ Fixed-Size Window

```java
int n = arr.length;
int l = 0, r = 0;
int curSum = 0;
int ans = 0;

while (r < n) {

    curSum += arr[r];

    if (r - l + 1 == k) {

        ans = Math.max(ans, curSum);

        curSum -= arr[l];
        l++;
    }

    r++;
}
```
```
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    TreeSet<Integer> ts = new TreeSet<>();
		int[] arr = {6, 1, 3, 2, 4};
		int k=3;
		int n = arr.length;
		for(int ele:arr) ts.add(ele);
		List<Integer> ans = new ArrayList<>();
		for(int i=0; i<=n-k; i++){
		    TreeSet<Integer> cts = new TreeSet<>();
		    for(int j=i; j<i+k; j++){
		        cts.add(arr[j]);
		    }
		    int mex = 1;
		    while(cts.contains(mex)) mex++;
		    ans.add(mex);
		}
		System.out.println(ans);
		System.out.println(Collections.max(ans));
	}
}
```


