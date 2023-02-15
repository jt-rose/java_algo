package com.javapractice;

import java.util.LinkedList;

public class HashTable {
    private LinkedList<KeyValuePair>[] table = new LinkedList[5];

    public void put(String key, int val) {
        // get index from hash
        var idx = hash(key);

        // if no item present, create linked list and add first item
        if (table[idx] == null) {
            table[idx] = new LinkedList<KeyValuePair>();
            table[idx].add(new KeyValuePair(key, val));
        } else {
//          if items present, iterate through to check for already
//           existing key - if found, replace, if not found, add new value
            for (KeyValuePair item: table[idx]) {
                if (item.key.equals(key)) {
                    item.val = val;
                    return;
                }
            }

            table[idx].add(new KeyValuePair(key, val));
        }
    }

    public Integer get(String key) {
        var idx = hash(key);
        if (table[idx] == null) {
            return null;
        }

        for (KeyValuePair item: table[idx]) {
            if (item.key.equals(key)) {
                return item.val;
            }
        }
        return null;
    }

    public void remove(String key) {
        var idx = hash(key);
        var iter = 0;
        for (KeyValuePair item: table[idx]) {
            if (item.key.equals(key)) {
                table[idx].remove(iter);
                return;
            } else {
                iter++;
            }
        }
    }

    private int hash(String value) {
        int idx = 0;

        for (int ascii: value.toCharArray()) {
            idx += ascii;
        }

        return idx % 5;
    }

    private class KeyValuePair {
        String key;
        int val;

        public KeyValuePair(String key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
