package com.nitka.task2;

import com.nitka.task1.Task1;

import java.util.Collections;
import java.util.List;

public final class Task2Unstable {

    private Task2Unstable() {}

    public static void removeDuplicates3TimesUnstable(List<Integer> list) {

        if (list == null)
            throw new IllegalArgumentException("Collection is not supposed to be null");

        Collections.sort(list);
        Task1.removeDuplicatesInRow(list);
    }

}
