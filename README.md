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


# 🔥 Graph Algorithms — Java DSA Roadmap

A structured collection of Graph concepts, Java implementations, algorithm patterns, and GFG/LeetCode practice problems. Organized from fundamentals to advanced graph algorithms for coding interviews and competitive programming.

## 📚 Table of Contents

1. Graph Representations
2. BFS and DFS Traversals
3. Connected Components and Grid Problems
4. Cycle Detection
5. Bipartite Graph
6. Topological Sorting
7. Shortest Path Algorithms
8. Minimum Spanning Tree (MST)
9. Disjoint Set Union (DSU)
10. Strongly Connected Components (SCC)
11. Bridges and Articulation Points
12. Graph Algorithm Selection Cheat Sheet

---

## 1. 🧱 Graph Representations

A graph consists of vertices (V) and edges (E).

| # | Graph Type | Representation | Key Formula / Rule |
|:-:|:--|:--|:--|
| 1 | Unweighted Directed | Adjacency List | `adj[u].add(v)` |
| 2 | Unweighted Undirected | Adjacency List | `adj[u].add(v); adj[v].add(u)` |
| 3 | Weighted Directed | Adjacency List | `adj[u].add(new Edge(v, w))` |
| 4 | Weighted Undirected | Adjacency List | Add weighted edges in both directions |
| 5 | Unweighted Directed | Adjacency Matrix | `mat[u][v] = 1` |
| 6 | Unweighted Undirected | Adjacency Matrix | `mat[u][v] = mat[v][u] = 1` |
| 7 | Weighted Directed | Adjacency Matrix | `mat[u][v] = w` |
| 8 | Weighted Undirected | Adjacency Matrix | `mat[u][v] = mat[v][u] = w` |

### Java Template — Unweighted Adjacency List

```java
import java.util.*;

class Graph {
    List<List<Integer>> adj;

    Graph(int v) {
        adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Directed graph
    void addDirectedEdge(int u, int v) {
        adj.get(u).add(v);
    }

    // Undirected graph
    void addUndirectedEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void print() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");

            for (int neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }
}
```

### Java Template — Weighted Adjacency List

```java
import java.util.*;

class WeightedGraph {
    static class Edge {
        int to, weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    List<List<Edge>> adj;

    WeightedGraph(int v) {
        adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addDirectedEdge(int u, int v, int w) {
        adj.get(u).add(new Edge(v, w));
    }

    void addUndirectedEdge(int u, int v, int w) {
        adj.get(u).add(new Edge(v, w));
        adj.get(v).add(new Edge(u, w));
    }
}
```

### Adjacency List vs Adjacency Matrix

| Feature | Adjacency List | Adjacency Matrix |
|:--|:--|:--|
| Space | `O(V + E)` | `O(V²)` |
| Check edge | `O(degree)` | `O(1)` |
| Iterate neighbors | `O(degree)` | `O(V)` |
| Best suited for | Sparse graphs | Dense graphs |

**Important:** An adjacency matrix initialized with `0` cannot distinguish a missing edge from a valid zero-weight edge without an additional representation, such as `boolean[][]` or infinity for missing weighted edges.

---

## 2. 🚀 BFS and DFS Traversals

### BFS — Breadth First Search

**Pattern:** Queue + Visited Array

```java
static void bfs(List<List<Integer>> adj, int start) {
    boolean[] visited = new boolean[adj.size()];
    Queue<Integer> q = new LinkedList<>();

    visited[start] = true;
    q.offer(start);

    while (!q.isEmpty()) {
        int cur = q.poll();
        System.out.print(cur + " ");

        for (int nei : adj.get(cur)) {
            if (!visited[nei]) {
                visited[nei] = true;
                q.offer(nei);
            }
        }
    }
}
```

### DFS — Depth First Search

**Pattern:** Recursion + Visited Array

```java
static void dfs(List<List<Integer>> adj,
                int cur, boolean[] visited) {

    visited[cur] = true;
    System.out.print(cur + " ");

    for (int nei : adj.get(cur)) {
        if (!visited[nei]) {
            dfs(adj, nei, visited);
        }
    }
}
```

### Disconnected Graph Traversal

A traversal starting from one vertex visits only reachable vertices. To visit every component:

```java
for (int i = 0; i < v; i++) {
    if (!visited[i]) {
        dfs(adj, i, visited);
    }
}
```

| Algorithm | Time Complexity | Auxiliary Space |
|:--|:--|:--|
| BFS using adjacency list | `O(V + E)` | `O(V)` |
| DFS using adjacency list | `O(V + E)` | `O(V)` |

### Practice Problems

| # | Problem | Link | Pattern |
|:-:|:--|:--|:--|
| 1 | BFS Traversal of Graph | [GFG](https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1) | Queue, Visited |
| 2 | DFS Traversal of Graph | [GFG](https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1) | Recursion, Visited |

---

## 3. 🌍 Connected Components and Grid Problems

### Core Patterns

- Connected Components → Start BFS/DFS from every unvisited vertex.
- Grid DFS/BFS → Explore valid neighboring cells.
- Multi-source BFS → Insert every initial source into the queue before processing.
- Flood Fill → Traverse cells with the original color and change them.
- Boundary Traversal → Start from boundary cells and mark reachable cells.

### Practice Problems

| # | Problem | Link | Pattern |
|:-:|:--|:--|:--|
| 1 | Number of Provinces | [LeetCode](https://leetcode.com/problems/number-of-provinces/) | Components, DFS/BFS |
| 2 | Number of Islands | [LeetCode](https://leetcode.com/problems/number-of-islands/) | Grid DFS/BFS |
| 3 | Number of Islands 2| [GFG](https://www.geeksforgeeks.org/problems/find-the-number-of-islands/1) | Grid DFS/BFS |
| 4 | Flood Fill | [LeetCode](https://leetcode.com/problems/flood-fill/) | Grid DFS/BFS |
| 5 | Rotting Oranges | [LeetCode](https://leetcode.com/problems/rotting-oranges/) | Multi-source BFS |
| 6 | 01 Matrix | [LeetCode](https://leetcode.com/problems/01-matrix/) | Multi-source BFS |
| 7 | Surrounded Regions | [LeetCode](https://leetcode.com/problems/surrounded-regions/) | Boundary DFS/BFS |
| 8 | Number of Enclaves | [LeetCode](https://leetcode.com/problems/number-of-enclaves/) | Boundary DFS/BFS |
| 9 | Number of Distinct Islands | [GFG](https://www.geeksforgeeks.org/problems/number-of-distinct-islands/1) | Shape Encoding |

---

## 4. 🔄 Cycle Detection

### Undirected Graph — BFS

**Rule:** If a visited neighbor is not the current vertex's parent, a cycle exists.

```java
static boolean hasCycleBFS(
        List<List<Integer>> adj, int start,
        boolean[] visited) {

    Queue<int[]> q = new LinkedList<>();
    q.offer(new int[]{start, -1});
    visited[start] = true;

    while (!q.isEmpty()) {
        int[] cur = q.poll();
        int node = cur[0];
        int parent = cur[1];

        for (int nei : adj.get(node)) {
            if (!visited[nei]) {
                visited[nei] = true;
                q.offer(new int[]{nei, node});
            } else if (nei != parent) {
                return true;
            }
        }
    }

    return false;
}
```

### Undirected Graph — DFS

```java
static boolean hasCycleDFS(
        List<List<Integer>> adj,
        int node, int parent, boolean[] visited) {

    visited[node] = true;

    for (int nei : adj.get(node)) {
        if (!visited[nei]) {
            if (hasCycleDFS(adj, nei, node, visited)) {
                return true;
            }
        } else if (nei != parent) {
            return true;
        }
    }

    return false;
}
```

### Directed Graph — DFS

**Rule:** A back edge to a vertex currently in the recursion path indicates a directed cycle.

Use three states:

- `0` → Unvisited
- `1` → Currently in recursion path
- `2` → Fully processed

```java
static boolean hasCycleDirected(
        List<List<Integer>> adj,
        int node, int[] state) {

    state[node] = 1;

    for (int nei : adj.get(node)) {
        if (state[nei] == 1) {
            return true;
        }

        if (state[nei] == 0 &&
            hasCycleDirected(adj, nei, state)) {
            return true;
        }
    }

    state[node] = 2;
    return false;
}
```

### Practice Problems

| # | Problem | Link | Pattern |
|:-:|:--|:--|:--|
| 1 | Undirected Graph Cycle | [GFG](https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1) | BFS / DFS, Parent |
| 2 | Directed Graph Cycle | [GFG](https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1) | DFS, Recursion State |
| 3 | Course Schedule | [LeetCode](https://leetcode.com/problems/course-schedule/) | Directed Cycle |
| 4 | Course Schedule II | [LeetCode](https://leetcode.com/problems/course-schedule-ii/) | Cycle, Topological Sort |

---

## 5. 🎨 Bipartite Graph

A graph is bipartite if its vertices can be colored using **at most two colors** such that every edge connects vertices of different colors.

**Key rule:** An undirected graph is bipartite if and only if it has no odd-length cycle.

### BFS Coloring

1. Initialize every vertex color to `-1`.
2. Assign the starting vertex color `0`.
3. Assign each uncolored neighbor the opposite color.
4. If an edge connects vertices with the same color, return `false`.
5. Repeat for disconnected components.

### Practice Problem

| # | Problem | Link | Pattern |
|:-:|:--|:--|:--|
| 1 | Is Graph Bipartite? | [LeetCode](https://leetcode.com/problems/is-graph-bipartite/) | BFS / DFS Coloring |

---

## 6. 📊 Topological Sorting

**Definition:** A linear ordering of vertices in a directed acyclic graph (DAG), where every edge `u -> v` places `u` before `v`.

### A. Topological Sort — DFS

**Pattern:** DFS + Stack

1. Visit each unvisited vertex.
2. Process all its outgoing neighbors.
3. Push the vertex onto the stack after processing its neighbors.
4. Pop the stack to obtain the topological order.

### B. Kahn's Algorithm — BFS

**Pattern:** Indegree + Queue

1. Calculate the indegree of every vertex.
2. Add all vertices with indegree `0` to the queue.
3. Remove a vertex and append it to the answer.
4. Decrease the indegree of its neighbors.
5. Add neighbors whose indegree becomes `0`.
6. If the processed vertex count is less than `V`, the graph contains a cycle.

### C. Course Schedule

- Course Schedule I → Check whether a valid ordering exists.
- Course Schedule II → Return a valid course ordering.
- Prerequisite Tasks → Topological ordering.
- Alien Dictionary → Infer character ordering from sorted words.

### Practice Problems

| # | Problem | Link | Pattern |
|:-:|:--|:--|:--|
| 1 | Topological Sort | [GFG](https://www.geeksforgeeks.org/problems/topological-sort/1) | DFS / Stack |
| 2 | Course Schedule I | [LeetCode](https://leetcode.com/problems/course-schedule/) | Kahn's Algorithm |
| 3 | Course Schedule II | [LeetCode](https://leetcode.com/problems/course-schedule-ii/) | Topological Sort |
| 4 | Alien Dictionary | [GFG](https://www.geeksforgeeks.org/problems/alien-dictionary/1) | Indegree, Ordering |
| 5 | Eventual Safe States | [GFG](https://www.geeksforgeeks.org/problems/eventual-safe-states/1) | Reverse Graph, BFS |
| 6 | Shortest Path in DAG | [GFG](https://www.geeksforgeeks.org/problems/shortest-path-in-undirected-graph/1) | Topological Order |

**Complexity:** `O(V + E)` time and `O(V)` auxiliary space, excluding graph storage.

---

## 7. 🛣️ Shortest Path Algorithms

Choose the algorithm based on the graph's edge weights and structure.

| Algorithm | When to Use | Time Complexity |
|:--|:--|:--|
| BFS | Unweighted graph / equal edge costs | `O(V + E)` |
| DAG Shortest Path | Directed acyclic graph; negative edges allowed | `O(V + E)` |
| Dijkstra | Non-negative edge weights | `O((V + E) log V)` with a priority queue |
| Bellman-Ford | Negative edges; detect reachable negative cycles | `O(VE)` |
| Floyd-Warshall | All-pairs shortest paths | `O(V³)` |

### A. BFS Shortest Path

For an unweighted graph, BFS finds the minimum number of edges from the source to each reachable vertex.

```java
int[] dist = new int[v];
Arrays.fill(dist, -1);

Queue<Integer> q = new LinkedList<>();
dist[src] = 0;
q.offer(src);

while (!q.isEmpty()) {
    int node = q.poll();

    for (int nei : adj.get(node)) {
        if (dist[nei] == -1) {
            dist[nei] = dist[node] + 1;
            q.offer(nei);
        }
    }
}
```

### B. Dijkstra's Algorithm

**Pattern:** Min-Heap + Distance Array + Relaxation

For an edge `u -> v` with weight `w`:

`if (dist[u] + w < dist[v])`

Update the distance and insert the improved candidate into the priority queue.

```java
PriorityQueue<long[]> pq =
    new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));

long[] dist = new long[v];
Arrays.fill(dist, Long.MAX_VALUE);

dist[src] = 0;
pq.offer(new long[]{src, 0});

while (!pq.isEmpty()) {
    long[] cur = pq.poll();
    int node = (int) cur[0];
    long d = cur[1];

    if (d != dist[node]) continue;

    for (Edge e : adj.get(node)) {
        long nd = d + e.weight;

        if (nd < dist[e.to]) {
            dist[e.to] = nd;
            pq.offer(new long[]{e.to, nd});
        }
    }
}
```

This template assumes `Edge` has fields `to` and `weight` and that all edge weights are non-negative.

### C. Bellman-Ford

**Pattern:** Relax all edges up to `V - 1` times.

For every edge `u -> v` with weight `w`:

`dist[v] = min(dist[v], dist[u] + w)`

If another relaxation is possible on the next pass, a negative-weight cycle is reachable from the source.

### D. Floyd-Warshall

**Pattern:** Three nested loops over intermediate vertex `k`, source `i`, and destination `j`.

`dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])`

Use infinity for unreachable pairs and avoid adding infinity to finite values. A negative diagonal entry after the algorithm indicates a negative cycle.

### E. Other Shortest Path Patterns

| # | Problem | Link | Pattern |
|:-:|:--|:--|:--|
| 1 | Shortest Path in an Undirected Graph with Unit Weights | [GFG](https://www.geeksforgeeks.org/problems/shortest-path-in-undirected-graph/1) | BFS |
| 2 | Word Ladder I | [LeetCode](https://leetcode.com/problems/word-ladder/) | BFS, State Transformation |
| 3 | Word Ladder II | [LeetCode](https://leetcode.com/problems/word-ladder-ii/) | BFS Levels, Paths |
| 4 | Network Delay Time | [LeetCode](https://leetcode.com/problems/network-delay-time/) | Dijkstra |
| 5 | Path With Minimum Effort | [LeetCode](https://leetcode.com/problems/path-with-minimum-effort/) | Min-Heap, Relaxation |
| 6 | Cheapest Flights Within K Stops | [LeetCode](https://leetcode.com/problems/cheapest-flights-within-k-stops/) | Bounded Relaxation |
| 7 | Minimum Multiplications to Reach End | [GFG](https://www.geeksforgeeks.org/problems/minimum-multiplications-to-reach-end/1) | BFS on States |
| 8 | Number of Ways to Arrive at Destination | [LeetCode](https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/) | Dijkstra + Counting |
| 9 | Find the City With the Smallest Number of Neighbors at a Threshold Distance | [LeetCode](https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/) | Floyd-Warshall / Dijkstra |

---

## 8. 🌳 Minimum Spanning Tree (MST)

A minimum spanning tree of a connected, undirected, weighted graph connects all vertices with minimum total edge weight and no cycles.

**Number of edges in a spanning tree:** `V - 1`

### A. Prim's Algorithm

**Pattern:** Greedy + Min-Heap

1. Start from any vertex.
2. Select the minimum-weight edge connecting the current tree to an unvisited vertex.
3. Add that vertex and its edge weight.
4. Continue until all vertices are included.

For disconnected graphs, the same process can construct a minimum spanning forest.

### B. Kruskal's Algorithm

**Pattern:** Sort Edges + DSU

1. Sort all edges by ascending weight.
2. Process edges in sorted order.
3. If an edge connects different components, include it.
4. Union those components.
5. Stop after selecting `V - 1` edges for a connected graph.

### Practice Problems

| # | Problem | Link | Pattern |
|:-:|:--|:--|:--|
| 1 | Minimum Spanning Tree | [GFG](https://www.geeksforgeeks.org/problems/minimum-spanning-tree/1) | Prim's Algorithm |
| 2 | Min Cost to Connect All Points | [LeetCode](https://leetcode.com/problems/min-cost-to-connect-all-points/) | Prim's / Kruskal's |

---

## 9. 🔗 Disjoint Set Union (DSU)

DSU maintains connected components and supports efficient union and connectivity queries.

### Core Operations

- `find(x)` → Find the representative of the component containing `x`.
- `union(a, b)` → Merge two components if they are different.
- Path Compression → Flatten the tree during `find`.
- Union by Size / Rank → Attach the smaller or lower-rank tree below the larger or higher-rank tree.

### Java Template

```java
class DSU {
    int[] parent, size;

    DSU(int n) {
        parent = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }

        return parent[x];
    }

    boolean union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a == b) return false;

        if (size[a] < size[b]) {
            int temp = a;
            a = b;
            b = temp;
        }

        parent[b] = a;
        size[a] += size[b];

        return true;
    }
}
```

**Complexity:** Amortized `O(α(V))` per operation with path compression and union by size, where `α` is the inverse Ackermann function.

### Practice Problems

| # | Problem | Link | Pattern |
|:-:|:--|:--|:--|
| 1 | Number of Provinces | [LeetCode](https://leetcode.com/problems/number-of-provinces/) | DSU |
| 2 | Number of Operations to Make Network Connected | [LeetCode](https://leetcode.com/problems/number-of-operations-to-make-network-connected/) | Components, DSU |
| 3 | Accounts Merge | [LeetCode](https://leetcode.com/problems/accounts-merge/) | DSU, HashMap |
| 4 | Number of Islands II | [LeetCode](https://leetcode.com/problems/number-of-islands-ii/) | Dynamic Connectivity |
| 5 | Making a Large Island | [LeetCode](https://leetcode.com/problems/making-a-large-island/) | Component Sizes |
| 6 | Most Stones Removed with Same Row or Column | [LeetCode](https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/) | DSU, Components |

---

## 10. 🧩 Strongly Connected Components (SCC)

A strongly connected component is a maximal set of vertices in a directed graph where every vertex can reach every other vertex.

### Kosaraju's Algorithm

1. DFS on the original graph and push vertices onto a stack after processing their neighbors.
2. Reverse every edge to create the transpose graph.
3. Process vertices in decreasing finishing-time order.
4. Run DFS on the transpose graph from each unvisited vertex. Each traversal identifies one SCC.

**Time Complexity:** `O(V + E)`

### Practice Problems

| # | Problem | Link | Pattern |
|:-:|:--|:--|:--|
| 1 | Strongly Connected Components | [GFG](https://www.geeksforgeeks.org/problems/strongly-connected-components-kosarajus-algo/1) | Kosaraju |
| 2 | Critical Connections in a Network | [LeetCode](https://leetcode.com/problems/critical-connections-in-a-network/) | Tarjan, Bridges |

---

## 11. 🌉 Bridges and Articulation Points

Both algorithms use DFS discovery times and low-link values.

- `tin[u]` → Discovery time of vertex `u`.
- `low[u]` → Earliest discovery time reachable from the subtree of `u`, using tree edges and at most one back edge.

### A. Bridges

An edge `(u, v)` is a bridge if removing it increases the number of connected components.

For a DFS tree edge from `u` to `v`:

`low[v] > tin[u]`

### B. Articulation Points

A vertex is an articulation point if removing it increases the number of connected components.

For a non-root DFS vertex `u`, it is an articulation point if some DFS child `v` satisfies:

`low[v] >= tin[u]`

For a DFS root, it is an articulation point if it has more than one DFS-tree child.

**Time Complexity:** `O(V + E)` for each algorithm.

### Practice Problems

| # | Problem | Link | Pattern |
|:-:|:--|:--|:--|
| 1 | Bridge Edge in Graph | [GFG](https://www.geeksforgeeks.org/problems/bridge-edge-in-graph/1) | Tarjan |
| 2 | Articulation Point | [GFG](https://www.geeksforgeeks.org/problems/articulation-point-1/1) | Low-Link Values |
| 3 | Critical Connections in a Network | [LeetCode](https://leetcode.com/problems/critical-connections-in-a-network/) | Bridges |

---

## 12. ⚡ Graph Algorithm Selection Cheat Sheet

| Problem Clue | Algorithm / Technique |
|:--|:--|
| Visit neighbors level by level | BFS |
| Explore deeply and backtrack | DFS |
| Count connected components | BFS / DFS / DSU |
| Minimum edges in an unweighted graph | BFS |
| Multiple starting points in a grid | Multi-source BFS |
| Detect a cycle in an undirected graph | DFS/BFS + Parent, or DSU |
| Detect a cycle in a directed graph | DFS State or Kahn's Algorithm |
| Color graph with two colors | Bipartite BFS / DFS |
| Dependency ordering | Topological Sort |
| Directed acyclic graph shortest path | Topological Sort + Relaxation |
| Shortest path with non-negative weights | Dijkstra |
| Negative edge weights | Bellman-Ford |
| All-pairs shortest paths | Floyd-Warshall |
| Minimum cost to connect vertices | Prim's / Kruskal's |
| Merge components efficiently | DSU |
| Strongly connected components | Kosaraju / Tarjan |
| Find critical edges | Bridges |
| Find critical vertices | Articulation Points |

---

## 🎯 Recommended Practice Order

### Phase 1 — Fundamentals
- [ ] Graph Representations
- [ ] BFS Traversal
- [ ] DFS Traversal
- [ ] Number of Provinces
- [ ] Number of Islands
- [ ] Flood Fill
- [ ] Rotting Oranges

### Phase 2 — Core Graph Patterns
- [ ] Undirected Cycle Detection
- [ ] Directed Cycle Detection
- [ ] Bipartite Graph
- [ ] 01 Matrix
- [ ] Surrounded Regions
- [ ] Number of Enclaves
- [ ] Number of Distinct Islands

### Phase 3 — Ordering and Dependencies
- [ ] Topological Sort using DFS
- [ ] Kahn's Algorithm
- [ ] Course Schedule I and II
- [ ] Eventual Safe States
- [ ] Alien Dictionary
- [ ] Shortest Path in DAG

### Phase 4 — Shortest Paths
- [ ] Shortest Path in an Unweighted Graph
- [ ] Word Ladder I
- [ ] Dijkstra using PriorityQueue
- [ ] Print Shortest Path
- [ ] Shortest Distance in a Binary Maze
- [ ] Path With Minimum Effort
- [ ] Cheapest Flights Within K Stops
- [ ] Minimum Multiplications to Reach End
- [ ] Number of Ways to Arrive at Destination
- [ ] Bellman-Ford
- [ ] Floyd-Warshall
- [ ] Find the City With the Smallest Number of Neighbors

### Phase 5 — MST and DSU
- [ ] Prim's Algorithm
- [ ] Kruskal's Algorithm
- [ ] DSU: Union by Size
- [ ] DSU: Union by Rank
- [ ] Path Compression
- [ ] Number of Operations to Make Network Connected
- [ ] Accounts Merge
- [ ] Number of Islands II
- [ ] Making a Large Island
- [ ] Most Stones Removed with Same Row or Column

### Phase 6 — Advanced Graphs
- [ ] Kosaraju's Algorithm
- [ ] Bridges using Tarjan's Algorithm
- [ ] Articulation Points

---

## 🧠 Final Revision Rules

1. **Mark a vertex visited when adding it to a BFS queue**, not when removing it, to avoid duplicate insertions.
2. **Handle disconnected graphs** by starting a traversal from every unvisited vertex.
3. **Dijkstra does not support negative edge weights.**
4. **Topological ordering exists only for DAGs.**
5. **A graph is bipartite if and only if it contains no odd cycle.**
6. **An undirected cycle-detection DFS must track the parent.**
7. **For a directed graph, use recursion-path state or Kahn's algorithm to detect cycles.**
8. **For grid problems, verify boundaries before accessing neighboring cells.**
9. **For MST, use Prim's or Kruskal's; shortest paths are a different problem.**
10. **For bridges and articulation points, distinguish `low[v] > tin[u]` from `low[v] >= tin[u]`.**

**Goal:** Understand the pattern, implement the algorithm without looking at notes, analyze its complexity, and then solve variations of the problem independently.
