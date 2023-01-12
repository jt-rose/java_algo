package com.javapractice;

public class ArrayQueue {

    private int[] queue;

    public ArrayQueue() {
        queue = new int[5];
    }

    public int[] getQueue() {
        return queue;
    }

    // enqueue
    public void enqueue(int value) {
        var len = getActualLength();

        if (len == 5) {
            System.out.println("Cannot add to queue, already full");
        } else {
            queue[len] = value;
        }
    }

    // dequeue
    public Integer dequeue() {
        var len = getActualLength();

        if (len == 0) {
            return null;
        } else {
            var item = queue[len - 1];
            queue[len - 1] = 0;
            return item;
        }
    }

    // peek
    public Integer peek() {
        var len = getActualLength();
        if (len == 0) {
            return null;
        }

        return queue[len - 1];
    }

    private int getActualLength() {
        var len = 0;
        for (int val: queue) {
            if (val != 0) {
                len++;
            }
        }
        return len;
    }

    // isEmpty
    public boolean isEmpty() {
        return getActualLength() == 0;
    }

    // isFull
    public boolean isFull() {
        return getActualLength() == 5;
    }

}
