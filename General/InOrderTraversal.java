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

    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(Node root) {

        Node currentNode = new Node();
        currentNode = root;
        // TreeNode previousNode = root;

        if(currentNode != null){
            inorderTraversal(currentNode.left);
            list.add(currentNode.val);
            inorderTraversal(currentNode.right);
        }

        return list;
    }
}