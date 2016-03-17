package com.nitka.task2;

import com.google.common.collect.Lists;
import com.nitka.task1.Task1;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Task2StableTest {

    @Test
    public void testRemoveDuplicates3TimesUnstableVersionExact3Times() throws Exception {
        List<Integer> test1 = Lists.newArrayList(1, 2, 1, 2, 1);
        List<Integer> test1Expected = Lists.newArrayList(2, 2);

        Task2Stable.removeDuplicates3TimesStable(test1);
        assertThat(test1, is(test1Expected));
    }

    @Test
    public void testRemoveDuplicates3TimesUnstableVersion() throws Exception {
        List<Integer> test1 = Lists.newArrayList(1, 2, 1, 2, 1, 1, 3, 3, 3, 3, 3, 4, 4, 4, 7, 8, 9, 7, 8, 9, 7);
        List<Integer> test1Expected = Lists.newArrayList(2, 2, 8, 9, 8, 9);

        Task2Stable.removeDuplicates3TimesStable(test1);
        assertThat(test1, is(test1Expected));
    }

    @Test
    public void testRemoveDuplicates3TimesUnstableVersionEmpty() throws Exception {
        List<Integer> test1 = new ArrayList<>();
        List<Integer> test1Expected = new ArrayList<>();

        Task2Stable.removeDuplicates3TimesStable(test1);
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