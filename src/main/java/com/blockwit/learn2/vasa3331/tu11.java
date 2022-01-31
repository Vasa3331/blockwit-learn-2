package com.blockwit.learn2.vasa3331;

public class tu11 {
    int[] a = {12, 7, 89, -4, 8, 9};

    public void sort() {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }
    public void printIntArray() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        tu11 mass = new tu11();
        mass.sort();
        mass.printIntArray();
    }
}
