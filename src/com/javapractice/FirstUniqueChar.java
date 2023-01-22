package com.javapractice;

import java.util.HashMap;

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
}
