package com.data_structure;

public class LinkedList {

    public static class Node {
        public Node(int value) {
            this.value = value;
        }
        private int value;
        private Node next;
    }

    private Node first;
    private Node last;

    public void addLast(int item) {
        Node node = new Node(item);

        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
        }
    }

}
