package com.javapractice;

import java.util.Stack;

public class MStack {
    static private final char[] openingCharacters =  "([<{".toCharArray();
    static private final char[] closingCharacters = ")]>}".toCharArray();

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

    static public boolean hasBalancedEnclosures(String expr) {
        var enclosures = new Stack<Character>();
        for (Character ch: expr.toCharArray()) {
            if (isEnclosureOpening(ch)) {
                enclosures.push(ch);
            } else if (isEnclosureClosing(ch)) {
                if (enclosures.isEmpty()) {
                    return false;
                }
                var lastEnc = enclosures.pop();
                if (!isMatchingEnclosure(lastEnc, ch)) {
                    return false;
                }
            }
        }
        return enclosures.isEmpty();
    }

    private static boolean isEnclosureOpening(Character ch) {
        var isEnclosure = false;

        for (Character enclosure: openingCharacters) {
            if (enclosure.equals(ch)) {
                isEnclosure = true;
                break;
            }
        }

        return isEnclosure;
    }

    private static boolean isEnclosureClosing(Character ch) {
        var isEnclosure = false;

        for (Character enclosure: closingCharacters) {
            if (enclosure.equals(ch)) {
                isEnclosure = true;
                break;
            }
        }

        return isEnclosure;
    }

    private static boolean isMatchingEnclosure(Character opening,
                                         Character closing) {
        var o = opening.toString();
        var c = closing.toString();
        if (o.equals("(") && c.equals(")")) return true;
        if (o.equals("[") && c.equals("]")) return true;
        if (o.equals("<") && c.equals(">")) return true;
        if (o.equals("{") && c.equals("}")) return true;
        return false;
    }
}
