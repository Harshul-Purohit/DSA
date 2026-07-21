package Path_sum_3;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Main {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        // Count paths starting from this node
        int pathsFromRoot = countPaths(root, targetSum);

        // Recursively check left and right subtrees
        int pathsFromLeft = pathSum(root.left, targetSum);
        int pathsFromRight = pathSum(root.right, targetSum);

        // Total paths = from root + from left subtree + from right subtree
        return pathsFromRoot + pathsFromLeft + pathsFromRight;
    }

    // Helper function: count paths starting at a given node
    private int countPaths(TreeNode node, int targetSum) {
        if (node == null) return 0;

        int count = 0;

        // If current node value matches target, we found one path
        if (node.val == targetSum) {
            count++;
        }

        // Continue searching downwards (subtract current node value)
        count += countPaths(node.left, targetSum - node.val);
        count += countPaths(node.right, targetSum - node.val);

        return count;
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
