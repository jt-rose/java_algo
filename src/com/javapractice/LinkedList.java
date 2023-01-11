package com.javapractice;

public class LinkedList {
    private class Node {
        private String val;
        private Node next;

        private Node(String val) {
            this.val = val;
        }
    }
    private Node head;
    private Node tail;

    public LinkedList(String val) {
        var singleNode = new Node(val);
        this.head = singleNode;
        this.tail = singleNode;
    }

    //add_head
    public void addHead(String val) {
        var newHead = new Node(val);
        newHead.next = head;
        head = newHead;
    }

    //add_tail
    public void addTail(String val) {
        var newTail = new Node(val);
        if (tail != null) {
            tail.next = newTail;
        }
        if (head == null) {
            head = newTail;
        } else if (head.next == null) {
            head.next = newTail;
        }
        this.tail = newTail;
    }

    //remove_head
    public void removeHead() {
        if (head != null) {
            if (head.next == null) {
                this.head = null;
                this.tail = null;
            } else {
                // to work with the GC, head.next must be set to null before
                // changing it to second
                var second = head.next;
                head.next = null;
                head = second;
            }
        }
    }

    //remove_tail
    public void removeTail() {
        if (tail != null) {
            Node secondToLast = head;
            boolean nextStep = true;
            while (nextStep) {
                if (secondToLast.next == null) {
                    nextStep = false;
                } else {
                    secondToLast = secondToLast.next;
                }
            }

            tail = secondToLast;
        }
    }

    //index_of
    public int index_of(String searchTerm) {
        return search(searchTerm, head, 0);
    }

    //contains
    public boolean contains(String searchTerm) {
        int result = search(searchTerm, head, 0);
        return result != -1;
    }
    private int search(String searchTerm, Node node, int index) {
        if (node == null) {
            return -1;
        }
        if (node.val.equals(searchTerm)) {
            return index;
        } else {
            return search(searchTerm, node.next, index + 1);
        }
    }

    public void reverse() {
        if (head != null) {
            var startingHead = head;
            rev(head, head.next);
            startingHead.next = null;
            head = tail;
            tail = startingHead;
        }
    }

    public String getNthFromEnd(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }
        return nthFromEnd(n, head, head, 0);
    }

    private String nthFromEnd(int n, Node current, Node distanceNode,
                              int actual_dist) {
        if (current.next == null) {
            if (distanceNode == null) {
                return null;
            } else {
                return distanceNode.val;
            }
        }

        if (actual_dist == n) {
            return nthFromEnd(n, current.next, distanceNode.next, actual_dist);
        } else {
            return nthFromEnd(n, current.next, distanceNode, actual_dist + 1);
        }
    }

    private void rev(Node node, Node secondNode) {
        if (secondNode != null) {
            var thirdNode = secondNode.next;
            secondNode.next = node;

            rev(secondNode, thirdNode);
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}
