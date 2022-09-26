package com.fbaa.app.btree;

public class Node<T> {
    public Node<T> left;
    public Node<T> right;
    public T value;
    Node(T value) {
        this.value = value;
        this.left = this.right = null;
    }
}

