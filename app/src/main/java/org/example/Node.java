package org.example;

public class Node {//a node in the binary tree
    public Node left;
    public Node right;
    public Squirrel data;

    public Node(Squirrel data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
