package p118;
import java.util.ArrayList;
import java.util.List;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, new ArrayList<>());
        return result;
    }

    private void dfs(TreeNode node, int sum, List<Integer> path) {
        if (node == null) return;

        path.add(node.val);

        if (node.left == null && node.right == null && sum == node.val) {
            result.add(new ArrayList<>(path));
        }

        dfs(node.left, sum - node.val, path);
        dfs(node.right, sum - node.val, path);

        path.remove(path.size() - 1); // BACKTRACK
    }
}

public class Problem118_pathSumTwo {
    public static void main(String[] args) {
        Solution obj = new Solution();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        int targetSum = 22;
        List<List<Integer>> result = obj.pathSum(root, targetSum);
        System.out.println(result);
        
    }
}
