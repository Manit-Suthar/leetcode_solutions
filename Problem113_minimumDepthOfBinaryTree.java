package p113;

import java.util.LinkedList;
import java.util.Queue;

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

//Iterative Approach
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null)
                    return depth;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            depth++;
        }

        return depth;
    }
}

// Recursive Approachs
// class Solution {
//     public int minDepth(TreeNode root) {
//         if(root == null) return 0;
//         if(root.left == null && root.right == null) return 1;
//         if(root.left == null) return minDepth(root.right) + 1;
//         if(root.right == null) return minDepth(root.left) + 1;
//         return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
//     }
// }
public class Problem113_minimumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution obj = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(7);
        int result = obj.minDepth(root);
        System.out.println(result);
    }
}
