package General;

import Algorithms.Node;
import Algorithms.BinaryTree;

public class SymmetricBinaryTree{
    public static void main(String[] args){
        Node tree = new Node();
        BinaryTree bt = new BinaryTree();
        Solution64 sol = new Solution64();

        tree = new Node(1, new Node(2), new Node(2));

        BinaryTree.inOrderTraversal(tree);

        boolean result = sol.isSymmetric(tree);
        System.out.println(result);
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution64 {


    public boolean isMirror(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        else if(root1 == null || root2 == null){
            return false;
        }
        else{
            return (root1.val == root2.val) && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
        }
    }


    public boolean isSymmetric(Node root) {
        
        if(root == null){
            return false;
        }
        else{
            return isMirror(root.left, root.right);
        }
    }
}