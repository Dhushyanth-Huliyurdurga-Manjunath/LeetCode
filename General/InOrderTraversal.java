import Algorithms.Node;
import java.util.*;

public class InOrderTraversal {
    public static void main(String[] args){
        Solution62 sol = new Solution62();  
        Node tree = new Node();

        tree = tree.insertValue(1);
        tree.insertValue(2);
        tree.insertValue(3);

        List<Integer> result = new ArrayList<>();

        result = sol.inorderTraversal(tree);
        System.out.println(result);

    }    
}

class Solution62 {

//    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(Node root) {
        Stack<Node> stack = new Stack<Node>();
        List<Integer> list = new ArrayList<Integer>();
        Node currentNode = root;

        while(!stack.empty() || currentNode != null){
            while(currentNode != null){
                stack.add(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            list.add(currentNode.val);
            currentNode = currentNode.right;
        }

        return list;





        // TreeNode currentNode = root;
        // if(currentNode.left != null){
        //     list = inorderTraversal(currentNode.left);
        // }
        // if(currentNode.left == null){
        //     list.add(currentNode.val);
        //     inorderTraversal(currentNode.right);
        // }
        // list.add(currentNode.val);
        // return list;
    }
//    public List<Integer> inorderTraversal(Node root) {
//
//        Node currentNode = new Node();
//        currentNode = root;
//        // TreeNode previousNode = root;
//
//        if(currentNode != null){
//            inorderTraversal(currentNode.left);
//            list.add(currentNode.val);
//            inorderTraversal(currentNode.right);
//        }
//
//        return list;
//    }
}