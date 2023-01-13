package com.javapractice;

public class ArrayQueue {

    private int[] queue;
    private int start;
    private int end; // inclusive

    public ArrayQueue() {
        queue = new int[5];
        start = 0;
        end = 0;
    }

    public int[] getQueue() {
        return queue;
    }

    // enqueue
    public void enqueue(int value) {
        if (end < 4) {

            queue[end] = value;
            end++;
        } else if (start > 0){
            start--;
            queue[start] = value;
        } else {
            System.out.println("Queue is already full!");
        }
    }

    // dequeue
    public Integer dequeue() {
        if (!isEmpty()) {
            var item = queue[start];
            start++;
            return item;
        } else {
            return null;
        }
    }

    // peek
    public Integer peek() {
        if (start != end && end > 0) {
            return queue[start];
        } else {
            return null;
        }
    }

    // isEmpty
    public boolean isEmpty() {
        return start == end;
    }

    // isFull
    public boolean isFull() {
        return start == 0 && end == 4;
    }

}
