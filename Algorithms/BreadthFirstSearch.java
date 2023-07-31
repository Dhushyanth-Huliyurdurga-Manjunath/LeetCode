package Algorithms;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Dhushyanth Huliyurdurga Manjunath
 * @since: 7/30/23 4:56 PM
 */
public class BreadthFirstSearch {
    public static void main(String[] args){
        TNode root = new TNode("A");
        root.addChild(new TNode("B"));
        root.addChild(new TNode("C"));
        root.getChildren().get(0).addChild(new TNode("D"));
        root.getChildren().get(0).addChild(new TNode("E"));
        root.getChildren().get(1).addChild(new TNode("F"));
        root.getChildren().get(1).addChild(new TNode("G"));

        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TNode node = queue.poll();
            System.out.println(node.data);
            for(TNode child : node.children){
                queue.add(child);
            }
        }
    }
}

class TNode{
    String data;
    LinkedList<TNode> children;

    public TNode(String data){
        this.data = data;
        this.children = new LinkedList<>();
    }

    public void addChild(TNode child){
        this.children.add(child);
    }

    public LinkedList<TNode> getChildren(){
        return this.children;
    }
}