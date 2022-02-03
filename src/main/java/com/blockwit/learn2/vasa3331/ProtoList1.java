package com.blockwit.learn2.vasa3331;

public class ProtoList1 {
    private int[] array;

    public ProtoList1(int[] array) {
        this.array = array;
    }
    public int[] create(int size) {
        int[] array = new int[size];
        return array;
    }
    public int getSize(int[] array) {
        return array.length;
    }
    public int getIndex(int[] array, int index) {
        return array[index];
    }
}

