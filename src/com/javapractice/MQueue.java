package com.javapractice;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Stack;

public class MQueue {
    private Queue<Integer> queue;

    public MQueue(int[] values) {
        queue = new ArrayDeque<>();
        for (int val: values) {
            queue.add(val);
        }
    }

    public Queue<Integer> getQueue() {
        return queue;
    }

    public void reverse() {
        var stack = new Stack<Integer>();
        while (!queue.isEmpty()) {
            var item = queue.remove();
            stack.push(item);
        }

        while (!stack.isEmpty()) {
            var item = stack.pop();
            queue.add(item);
        }
    }



}
