package com.javapractice;

public class BinaryTree {
    private final Node root;

    public BinaryTree(Integer value) {
        this.root = new Node(value);
    }

    public void insert(int value) {
        var currentNode = this.root;
        while (true) {
            if (currentNode.value == value) {
                return;
            }
            if (currentNode.value > value) {
                if (currentNode.leftChild == null) {
                    currentNode.leftChild = new Node(value);
                    return;
                } else {
                    currentNode = currentNode.leftChild;
                }
            } else {
                if (currentNode.rightChild == null) {
                    currentNode.rightChild = new Node(value);
                    return;
                } else {
                    currentNode = currentNode.rightChild;
                }
            }
        }
    }

    public boolean find(int value) {
        var currentNode = this.root;
        while (true) {
            if (currentNode.value == value) {
                return true;
            }
            if (currentNode.value > value) {
                if (currentNode.leftChild == null) return false;
                currentNode = currentNode.leftChild;
            } else {
                if (currentNode.rightChild == null) return false;
                currentNode = currentNode.rightChild;
            }
        }
    }

    private class Node {
        public Integer value;
        public Node leftChild;
        public Node rightChild;

        public Node(int value) {
            this.value = value;
        }
    }



}
