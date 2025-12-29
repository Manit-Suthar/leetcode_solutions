package p106;
import java.util.ArrayList;
import java.util.List;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> result = new ArrayList<>();
//         if (root == null) return result; // handle empty tree 

//         if (root.left != null) {
//             result.addAll(postorderTraversal(root.left));
//         }

//         if (root.right != null) {
//             result.addAll(postorderTraversal(root.right));
//         }

//         result.add(root.val);

//         return result;
//     }
// }

//Itererative approach

class Solution{
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result; // handle empty tree

        List<TreeNode> stack = new ArrayList<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.remove(stack.size() - 1);
            result.add(0, currentNode.val); // Add to the front of the list

            if (currentNode.left != null) {
                stack.add(currentNode.left);
            }

            if (currentNode.right != null) {
                stack.add(currentNode.right);
            }
        }

        return result;
    }
}

public class Problem106_BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        // Post order = left -> right -> root
        Solution obj = new Solution();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> postorderList = obj.postorderTraversal(root); 
        for (int val : postorderList) {
            System.out.print(val + " ");
        }   
    }
}
