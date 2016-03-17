package com.nitka.task3;

import static java.lang.Math.max;

public class BasicTree<T extends Comparable> {

    private Node<T> root;

    private static class Node<T> {
        Node<T> left;
        Node<T> right;
        T data;

        Node(T newData) {
            left = null;
            right = null;
            data = newData;
        }
    }

    public void insert(T data) {

        if (data == null)
            throw new IllegalArgumentException("Insertion data is not supposed to be null");

        root = insert(root, data);
    }

    private Node<T> insert(Node<T> node, T data) {
        if (node == null) {
            node = new Node<>(data);
        } else {
            if (data.compareTo(node.data) <= 0) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }

        return node;
    }

    public int findHeight() {
        return findHeight(root);
    }

    private int findHeight(Node<T> node) {
        if (node == null) {
            return 0;
        }
        else {
            int leftDepth = findHeight(node.left);
            int rightDepth = findHeight(node.right);
            return max(leftDepth, rightDepth) + 1;
        }
    }
}
