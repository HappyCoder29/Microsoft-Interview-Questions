package edu.northeastern.ashish;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinTree <T>{

    public Node<T> root;

    public BinTree(){
    }



    public void zigZag() {

        if (root == null) {
            return;
        }

        Queue<Node<T>> queue = new LinkedList<Node<T>>();
        Stack<Node<T>> stack = new Stack<>();
        boolean bPrint = true;

        queue.add(root);
        queue.add(null);

        while (queue.size() > 0) {
            Node<T> node = queue.remove();
            if (node != null) {
                if (bPrint) {
                    System.out.printf(node.data + "\t");
                } else {
                    stack.push(node);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                } else {

                }
            }else{
                while(stack.size() > 0){
                    System.out.printf(stack.pop().data + "\t");
                }
                System.out.println();

                bPrint = !bPrint;

                if(queue.size() == 0)
                    break;
                queue.add(null);
            }
        }// end of while
        System.out.printf("");

    }
}
