package p105;
import java.util.ArrayList;
import java.util.List;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution{
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null) return result; // handle empty tree

        if(root.left != null){
            result.addAll(inorderTraversal(root.left));
        }

        result.add(root.val);

        if(root.right != null){
            result.addAll(inorderTraversal(root.right));
        }

        return result;
    }
}
public class Problem105_BinaryTreeInOrdeTraversal {
    public static void main(String[] args) {
        Solution obj = new Solution();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> inorderList = obj.inorderTraversal(root);
        for(int val : inorderList){
            System.out.print(val + " ");
        }

    }
}
