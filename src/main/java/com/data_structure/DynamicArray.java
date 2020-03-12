package com.data_structure;

public class DynamicArray {
    private int[] items;
    private int count;

    public DynamicArray(int size) {
        items = new int[size];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Invalid index.");
        }

        for (int i = 0; i < count; i++) {
            items[i] = items[i + 1];
        }

        count--;
    }

}
