package com.nitka.task1;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Task1Test {

    @org.junit.Test
    public void testRemoveDuplicatesInRowOnlyFreeSameElements() throws Exception {
        List<Integer> test1 = Lists.newArrayList(1, 1, 1);
        List<Integer> test1Expected = new ArrayList<>();

        Task1.removeDuplicatesInRow(test1);
        assertThat(test1, is(test1Expected));
    }

    @org.junit.Test
    public void testRemoveDuplicatesInRowNoRemovedExpected() throws Exception {
        List<Integer> test1 = Arrays.asList(1, 2, 3, 2, 1);
        List<Integer> test1Expected = Arrays.asList(1, 2, 3, 2, 1);

        Task1.removeDuplicatesInRow(test1);
        assertThat(test1, is(test1Expected));
    }

    @org.junit.Test
    public void testRemoveDuplicatesInRowExact3TimesInRow() throws Exception {
        List<Integer> test1 = Lists.newArrayList(1, 1, 1, 2, 3, 3, 3, 2, 1);
        List<Integer> test1Expected = Lists.newArrayList(2, 2, 1);

        Task1.removeDuplicatesInRow(test1);
        assertThat(test1, is(test1Expected));
    }

    @org.junit.Test
    public void testRemoveDuplicatesInRowMoreThan3() throws Exception {
        List<Integer> test1 = Lists.newArrayList(1, 1, 1, 1, 2, 3, 3, 3, 2, 1, 1, 1, 1, 1, 2);
        List<Integer> test1Expected = Lists.newArrayList(2, 2, 2);

        Task1.removeDuplicatesInRow(test1);
        assertThat(test1, is(test1Expected));
    }

    @org.junit.Test
    public void testRemoveDuplicatesEmpty() throws Exception {
        List<Integer> test1 = new ArrayList<>();
        List<Integer> test1Expected = new ArrayList<>();

        Task1.removeDuplicatesInRow(test1);
        assertThat(test1, is(test1Expected));
    }

    @org.junit.Test
    public void testRemoveDuplicatesListOfOneElement() throws Exception {
        List<Integer> test1 = Lists.newArrayList(1);
        List<Integer> test1Expected = Lists.newArrayList(1);

        Task1.removeDuplicatesInRow(test1);
        assertThat(test1, is(test1Expected));
    }

    @org.junit.Test
    public void testRemoveDuplicatesListOfTwoElement() throws Exception {
        List<Integer> test1 = Lists.newArrayList(1, 2);
        List<Integer> test1Expected = Lists.newArrayList(1, 2);

        Task1.removeDuplicatesInRow(test1);
        assertThat(test1, is(test1Expected));
    }
}