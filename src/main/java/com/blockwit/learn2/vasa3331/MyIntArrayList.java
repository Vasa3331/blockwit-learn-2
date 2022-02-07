package com.blockwit.learn2.vasa3331;

public class MyIntArrayList {
    int[] elements;
    int count;

    public MyIntArrayList() {
        elements = new int[0];
        count = 0;
    }
    public int size() {
        return count;
    }
    public void clear() {
        elements = new int[0];
        count = 0;
    }
    public int get(int i) {
        return elements[i];
    }
    public void add(int newValue) {
        if (count == elements.length) {
            int[] newElements = new int[elements.length + 1];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            newElements[newElements.length - 1] = newValue;
            elements = newElements;
        } else {
            elements[count - 1] = newValue;
        }
        count++;
    }
}
