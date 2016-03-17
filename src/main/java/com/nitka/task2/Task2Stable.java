package com.nitka.task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public final class Task2Stable {

    public static final int ELEMENTS_MIN_COUNT_TO_REMOVE = 3;

    private Task2Stable() {}

    public static void removeDuplicates3TimesStable(List<Integer> list) {

        if (list == null)
            throw new IllegalArgumentException("Collection is not supposed to be null");

        Map<Integer, Integer> counter = new HashMap<>();

        for (Integer element : list) {
            if (counter.containsKey(element)) {
                Integer oldValue = counter.get(element);
                counter.put(element, oldValue + 1);
            } else {
                counter.put(element, 1);
            }
        }

        counter.entrySet().stream()
                .filter(entry -> entry.getValue() >= ELEMENTS_MIN_COUNT_TO_REMOVE)
                .forEach(entry -> IntStream.rangeClosed(1, entry.getValue())
                        .forEach(a -> list.remove(entry.getKey())));

    }

}
