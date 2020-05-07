package edu.northeastern.ashish;

public class Node<T> {
    public T data;
    public Node left;
    public Node right;

    private Node(){}

    public Node(T data){
        this.data = data;
    }
}
