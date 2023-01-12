package com.javapractice;

import java.util.Stack;

public class MStack {
    static public String reverse(String word) {
        if (word == null) {
            throw new IllegalArgumentException("word cannot be null");
        }
        var stack = new Stack<Character>();
        for (char letter: word.toCharArray()) {
            stack.push(letter);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
