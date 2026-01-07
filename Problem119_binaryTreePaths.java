package p119;
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        dfs(root, "", result);
        return result;
    }
    private void dfs(TreeNode node, String path, List<String> result) {
        if (node == null) {
            return;
        }
        if (path.isEmpty()) {
            path += node.val;
        } else {
            path += "->" + node.val;
        }
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }
        dfs(node.left, path, result);
        dfs(node.right, path, result);
    }
}
public class Problem119_binaryTreePaths {
    public static void main(String[] args) {
        Solution obj = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        List<String> result = obj.binaryTreePaths(root);
        System.out.println(result);
        
    }
}
