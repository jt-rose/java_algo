package com.javapractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FirstUniqueChar {
    public static String getFirstNonRepeatingChar(String text) {
        var letterFrequencies = new HashMap<String, Integer>();
        var letters = text.split("");
        for (String letter: letters) {
            if (letterFrequencies.containsKey(letter)) {
                var current = letterFrequencies.get(letter);
                letterFrequencies.put(letter, current + 1);
            } else {
                letterFrequencies.put(letter, 1);
            }
        }

        for (String letter: letters) {
            if (letterFrequencies.get(letter) == 1) {
                return letter;
            }
        }
        return null;
    }

    static public Character getFirstRepeatingChar(String text) {
        var found = new HashSet<Character>();
        for (Character c: text.toCharArray()) {
            if (found.contains(c)) {
                return c;
            } else {
                found.add(c);
            }
        }
        return null;
    }
}
