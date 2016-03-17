package com.nitka.task1;

import java.util.List;

public final class Task1 {

    public static final int MIN_INT_COUNT_TO_REMOVE = 3;

    private Task1() {}

    public static void removeDuplicatesInRow(List<Integer> list) {

        if (list == null)
            throw new IllegalArgumentException("Collection is not supposed to be null");

        int size = list.size();
        if (size < MIN_INT_COUNT_TO_REMOVE) {
            return;
        }
        int lastNumber = list.get(0);
        int lastNumberCount = 1;
        for (int i = 1; i < size; i++) {
            if (list.get(i) == lastNumber) {
                lastNumberCount++;
            } else {
                if (lastNumberCount >= MIN_INT_COUNT_TO_REMOVE) {
                    list.subList(i - lastNumberCount, i).clear();
                    size -= lastNumberCount;
                    i -= lastNumberCount;
                }
                lastNumber = list.get(i);
                lastNumberCount = 1;
            }
        }

        if (lastNumberCount >= MIN_INT_COUNT_TO_REMOVE) {
            list.subList(size - lastNumberCount, size).clear();
        }
    }

    /*too naive implementation*/
    /*public static void removeDuplicatesInRow(List<Integer> list) {

        for (int i = 0; i < list.size(); ) {

            if (i + 2 >= list.size()) {
                return;
            }

            Integer first = list.get(i);
            Integer second = list.get(i + 1);
            Integer third = list.get(i + 2);

            if (first.equals(second) && first.equals(third) && second.equals(third)) {
                while (i < list.size() && list.get(i).equals(first)) {
                    list.remove(i);
                }
            } else {
                i++;
            }
        }
    }*/

}
