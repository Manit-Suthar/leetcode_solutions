package p107;

//BSF approach to traverse the binary tree level by level

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result; // handle empty tree

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}

public class Problem107_BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Solution obj = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> levelOrderList = obj.levelOrder(root);
        for (List<Integer> level : levelOrderList) {
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

// class Tnode {
// int val;
// Tnode left;
// Tnode right;

// Tnode(int val) {
// this.val = val;
// this.left = null;
// this.right = null;
// }

// Tnode() {
// }

// Tnode(int val, Tnode left, Tnode right) {
// this.val = val;
// this.left = left;
// this.right = right;
// }
// }

// class Solution {
// public List<List<Integer>> BFSTraversal(Tnode root) {
// List<List<Integer>> result = new ArrayList<>();
// if (root == null)
// return result;
// Queue<Tnode> q = new LinkedList<>();
// q.offer(root); // q.add(root);
// while (!q.isEmpty()) {
// List<Integer> cuurentLevelNodes = new ArrayList<>();
// int currentLevelSize = q.size();
// for (int i = 0; i < currentLevelSize; i++) {
// Tnode currentNode = q.poll(); // q.remove();
// cuurentLevelNodes.add(currentNode.val);
// if (currentNode.left != null) {
// q.offer(currentNode.left);
// }
// if (currentNode.right != null) {
// q.offer(currentNode.right);
// }
// }
// result.add(cuurentLevelNodes);
// }
// return result;
// }
// }

// public class Problem107_BinaryTreeLevelOrderTraversal {
// public static void main(String[] args) {
// Solution obj = new Solution();
// Tnode root = new Tnode(1);
// root.right = new Tnode(3);
// root.left = new Tnode(2);
// root.left.right = new Tnode(5);
// root.right.right = new Tnode(7);
// List<List<Integer>> levelOrderList = obj.BFSTraversal(root);
// for (List<Integer> level : levelOrderList) {
// for (int val : level) {
// System.out.print(val + " ");
// }
// System.out.println();
// }

// }
// }