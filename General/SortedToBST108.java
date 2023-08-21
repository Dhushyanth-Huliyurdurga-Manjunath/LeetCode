import Algorithms.Node;
import Algorithms.BinaryTree;

public class SortedToBST108{
    public static void main(String[] args){
        Solution65 sol = new Solution65();
        BinaryTree bt = new BinaryTree();

        int[] nums = {-10, -3, 0, 5, 9};
        Node result = sol.sortedArrayToBST(nums);
        
        BinaryTree.preOrderTraversal(result);
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
class Solution65 {

    
    public Node build(int[] array, int left, int right, Node currentNode){
        if(left > right){
            return null;
        }
        int mid = (left + right) / 2;
        if(currentNode == null){
            Node newNode = new Node(array[mid]);
            currentNode = newNode;
            // return currentNode;
            currentNode.left = build(array, left, mid - 1, currentNode.left);
            currentNode.right = build(array, mid + 1, right, currentNode.right);
        }
        else
            currentNode.val = array[mid];
        currentNode.left = build(array, left, mid - 1, currentNode.left);
        currentNode.right = build(array, mid + 1, right, currentNode.right);
        return currentNode;
    }

    public Node sortedArrayToBST(int[] nums) {
        Node tree = null;
        Node currentNode = tree;

        currentNode = build(nums, 0, nums.length - 1, currentNode);

        return currentNode;
    }
}