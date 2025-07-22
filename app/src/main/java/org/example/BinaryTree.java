package org.example;

public class BinaryTree {
    private Node root;

    public BinaryTree() {//creates an empty tree
        root = null;
    }

    public BinaryTree(Squirrel Rootdata) {//creates a tree with a root 
        root = new Node(Rootdata);
        root.left = null;
        root.right = null;
    }

    public void set_left(Node node) {//sets the left child of the root node
        root.left = node;
    }

    public void set_right(Node node) {//sets the right child of the root node
        root.right = node;
    }

    public void set_root(Squirrel data) {//sets the root node
        root.data = data;
    }

    public Node left() {// returns the left child of the root node
        if (root.left == null) {
            return null; // If there is no left child, return null
        }
        return root.left;
    }

    public Node right() {// returns the right child of the root node
        if (root.right == null) {
            return null; // If there is no right child, return null
        }
        return root.right;
    }

    public Node root() {// returns the root node
        if (root == null) {
            return null; // If the tree is empty, return null
        }
        return root;
    }
}

