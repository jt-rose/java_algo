package com.javapractice;

import java.util.Stack;
// queue - fifo
// stack - filo

public class SQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public SQueue(Integer value) {
        s1 = new Stack<>();
        s2 = new Stack<>();

        s1.push(value);
    }

    public void add(Integer value) {
        s1.push(value);
    }

    // to create fifo with stacks, move items from s1 to s2, pop s2
    public Integer remove() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        if (s2.isEmpty()) {
            return null;
        } else {
            return s2.pop();
        }
    }
}
