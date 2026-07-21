package Path_sum_3;

import java.util.HashMap;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Main {
   private HashMap<Long, Integer> map = new HashMap<>();
    private int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        map.put(0L, 1); // base case: empty prefix
        dfs(root, 0L, targetSum);
        return count;
    }

    private void dfs(TreeNode node, long currSum, int target) {
        if (node == null) return;

        currSum += node.val;

        // Check if there exists a prefix sum that makes current path = target
        count += map.getOrDefault(currSum - target, 0);

        // Store current prefix sum
        map.put(currSum, map.getOrDefault(currSum, 0) + 1);

        // Explore children
        dfs(node.left, currSum, target);
        dfs(node.right, currSum, target);

        // Backtrack: remove current node’s sum before returning
        map.put(currSum, map.get(currSum) - 1);
    }

    // --- For testing in VS Code ---
    public static void main(String[] args) {
        Main sol = new Main();

        // Build a sample tree:
        //       10
        //      /  \
        //     5   -3
        //    / \    \
        //   3   2    11
        //  / \   \
        // 3  -2   1

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);

        int targetSum = 8;
        int result = sol.pathSum(root, targetSum);

        System.out.println("Number of paths with sum " + targetSum + " = " + result);
    }
}
