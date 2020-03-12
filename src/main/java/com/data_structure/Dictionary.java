package com.data_structure;

public class Dictionary<K, V> {

    private static final int INITIAL_CAPACITY = 16;

    private static int size = 0;

    private Node<K, V>[] nodes;
    private Node<K, V>[] tempNodes;

    private class Node<K, V> {
        private final int hash;
        private final K key;
        private V value;
        private Node<K, V> next;

        Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
        public int getHash() {
            return hash;
        }
        public K getKey() {
            return key;
        }
        public V getValue() {
            return value;
        }
        public void setValue(V value) {
            this.value = value;
        }
        public Node<K, V> getNext() {
            return next;
        }
        public void setNext(Node<K, V> next) {
            this.next = next;
        }
    }

    public Dictionary(int capacity) {
        nodes = new Node[capacity];
    }

    public Dictionary() {
        nodes = new Node[INITIAL_CAPACITY];
    }

    private int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    public void put(K key, V value) {
        if (size == 0)
            nodes[hash(key)] = new Node<>(value.hashCode(), key, value, null);

        //TODO: finish implementing this step
        if (size == INITIAL_CAPACITY) {

        }

    }

}
