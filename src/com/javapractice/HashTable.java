package com.javapractice;

import java.util.LinkedList;

public class HashTable {
    private LinkedList<KeyValuePair>[] table = new LinkedList[5];

    public void put(String key, int val) {
        // get index from hash and format key value pair object
        var idx = hash(key);
        var kvPair = new KeyValuePair(key, val);

        // if no item present, create linked list and add first item
        if (table[idx] == null) {
            var ll = new LinkedList<KeyValuePair>();
            ll.add(kvPair);
            table[idx] = ll;
        } else {
//          if items present, iterate through to check for already
//           existing key - if found, replace, if not found, add new value
            for (KeyValuePair item: table[idx]) {
                if (item.key.equals(key)) {
                    item.val = val;
                    return;
                }
            }

            table[idx].add(kvPair);
        }
    }

    public Integer get(String key) {
        var idx = hash(key);
        if (idx < 0 || idx > 5) {
            return null;
        } else {
            for (KeyValuePair item: table[idx]) {
                if (item.key.equals(key)) {
                    return item.val;
                }
            }
            return null;
        }
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
