package com.blockwit.learn2.vasa3331;

public class tu1 {
    int[] a = {12, 7, 89, -4, 8, 9};

    public void printIntArray() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Helper mass = new Helper();
        mass.printIntArray();
    }
}
