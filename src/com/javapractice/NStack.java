package com.javapractice;

import java.util.Arrays;

public class NStack {
    private int[] stack;

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

    public NStack(int[] values) {
        stack = values;
    }

    // push, pop, peek, isEmpty

    public void push(int value) {
        var newStack = new int[stack.length + 1];
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        newStack[stack.length] = value;
        stack = newStack;
    }

    public int pop() {
        var newStack = new int[stack.length - 1];
        for (int i = 0; i < newStack.length; i++) {
            newStack[i] = stack[i];
        }
        var poppedItem = stack[stack.length - 1];
        stack = newStack;
        return poppedItem;
    }

    public int peek() {
        return stack[stack.length -1];
    }

    public boolean isEmpty() {
        return stack.length == 0;
    }
    }


