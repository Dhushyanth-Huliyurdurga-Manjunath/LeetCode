package Algorithms;

public class BinaryTree {

    public static void inOrderTraversal(Node currentNode){
        if(currentNode != null) {
            inOrderTraversal(currentNode.left);
            System.out.print(currentNode.val+" ");
            inOrderTraversal(currentNode.right);
        }
    }

    public static void preOrderTraversal(Node currentNode){
        if(currentNode != null){
            System.out.print(currentNode.val+" ");
            preOrderTraversal(currentNode.left);
            preOrderTraversal(currentNode.right);
        }
    }

    public static void postOrderTraversal(Node currentNode){
        if(currentNode != null){
            postOrderTraversal(currentNode.left);
            postOrderTraversal(currentNode.right);
            System.out.print(currentNode.val+" ");
        }
    }
    public static void main(String[] args){
        Node tree = new Node();

        tree = tree.insertValue(100);
        tree.insertValue(20);
        tree.insertValue(200);
        tree.insertValue(10);
        tree.insertValue(30);
        tree.insertValue(150);
        tree.insertValue(300);

        System.out.println("In-order traversal");
        inOrderTraversal(tree);

        System.out.println("\nPre-order traversal");
        preOrderTraversal(tree);

        System.out.println("\nPre-order traversal");
        postOrderTraversal(tree);
    }
}
