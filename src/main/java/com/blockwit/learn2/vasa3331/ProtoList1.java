package com.blockwit.learn2.vasa3331;

public class ProtoList1 {
    int[] array;

    public void create(int size) {
        int [] array = new int[size];
        this.array = array;
    }
    public int getSize(int[] array) {
        return array.length;
    }
    public int getIndex(int[] array, int index) {
        return array[index];
    }
}