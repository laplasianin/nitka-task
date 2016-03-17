package com.nitka.task3;

import org.junit.Assert;
import org.junit.Test;

public class BasicTreeTest {

    @Test
    public void testFindHeight() throws Exception {

        BasicTree<Integer> tree = new BasicTree<>();

        tree.insert(5);
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);

        tree.insert(6);

        Assert.assertEquals(4, tree.findHeight());
    }

    @Test
    public void testFindHeightRight() throws Exception {

        BasicTree<Integer> tree = new BasicTree<>();

        tree.insert(5);

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);

        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);

        Assert.assertEquals(5, tree.findHeight());
    }

    @Test
    public void testFindHeightRight2() throws Exception {

        BasicTree<Integer> tree = new BasicTree<>();

        tree.insert(5);

        tree.insert(1);
        tree.insert(3);
        tree.insert(-1);

        tree.insert(6);
        tree.insert(10);

        Assert.assertEquals(3, tree.findHeight());
    }
}