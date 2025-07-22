package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
    @Test
    public void testBinaryTreeCreation() {
        Squirrel squirrel1 = new Squirrel("Squirrel 1");
        Squirrel squirrel2 = new Squirrel("Squirrel 2");
        Squirrel squirrel3 = new Squirrel("Squirrel 3");

        Node node2 = new Node(squirrel2);
        Node node3 = new Node(squirrel3);

        BinaryTree TreeTest = new BinaryTree(squirrel1);// creates a tree with squirrel1 as root
        assertNotNull(TreeTest.root());// checks that the root is not null

        BinaryTree NullTreeTest = new BinaryTree();// creates an empty tree
        assertNull(NullTreeTest.root());// checks that the root is null

        TreeTest.set_left(node2);
        TreeTest.set_right(node3);

        assertNotNull(TreeTest.left());// checks that the left child is not null
        assertNotNull(TreeTest.right());// checks that the right child is not null
    }
    @Test
    public void testLeft() {
        Squirrel squirrel1 = new Squirrel("Squirrel 1");
        Squirrel squirrel2 = new Squirrel("Squirrel 2");

        Node node2 = new Node(squirrel2);

        BinaryTree leftTreeTest = new BinaryTree(squirrel1);// creates a tree with squirrel1 as root

        leftTreeTest.set_left(node2);

        assertNotNull(leftTreeTest.left());// checks that the left child is not null
        assertNull(leftTreeTest.right());// checks that the right child is null

        assertEquals(squirrel2, leftTreeTest.left().data);// checks that the left child's data is squirrel2

        assertNull(leftTreeTest.left().left);// checks that the left child of the left node is null
    }
    @Test
    public void testRight() {
        Squirrel squirrel1 = new Squirrel("Squirrel 1");
        Squirrel squirrel2 = new Squirrel("Squirrel 2");

        Node node2 = new Node(squirrel2);

        BinaryTree rightTreeTest = new BinaryTree(squirrel1);// creates a tree with squirrel1 as root

        rightTreeTest.set_right(node2);

        assertNotNull(rightTreeTest.right());// checks that the right child is not null
        assertNull(rightTreeTest.left());// checks that the left child is null

        assertEquals(squirrel2, rightTreeTest.right().data);// checks that the right child's data is squirrel2
    
        assertNull(rightTreeTest.right().right);// checks that the right child of the right node is null
    }
    @Test
    public void testRoot() {
        Squirrel squirrel1 = new Squirrel("Squirrel 1");
        Squirrel squirrel2 = new Squirrel("Squirrel 2");

        BinaryTree rootTreeTest = new BinaryTree(squirrel1);// creates a tree with squirrel1 as root

        assertNotNull(rootTreeTest.root());// checks that the root is not null
        assertEquals(squirrel1, rootTreeTest.root().data);// checks that the root's data is squirrel1

        rootTreeTest.set_root(squirrel2);// changes the root's data to squirrel2
        assertEquals(squirrel2, rootTreeTest.root().data);// checks that the root's data is now squirrel2

        BinaryTree emptyRootTreeTest = new BinaryTree();// creates an empty tree
        assertNull(emptyRootTreeTest.root());// checks that the root is null
    }
}
