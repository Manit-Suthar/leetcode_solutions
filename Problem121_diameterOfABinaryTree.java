package p121;
class TreeNode{
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
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        // Update diameter at this node
        diameter = Math.max(diameter, left + right);

        // Return height to parent
        return 1 + Math.max(left, right);
    }
}

public class Problem121_diameterOfABinaryTree {
    public static void main(String[] args) {
        Solution obj = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int result = obj.diameterOfBinaryTree(root);
        System.out.println(result);
    }
}
