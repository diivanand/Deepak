package com.deepak.cs.practice;

import java.util.Collection;
import java.util.StringJoiner;

public class Utils {

    public static <T> void printCollectionContents(Collection<T> items) {
        StringJoiner sj = new StringJoiner(",");
        for (T item : items) {
            sj.add(item.toString());
        }
        System.out.println("[" + sj.toString() + "]");
    }
}
