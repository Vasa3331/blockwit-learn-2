package com.blockwit.learn2.vasa3331;

public class Utils {
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
    public static void main(String[] args) {
        Utils mass = new Utils();
        mass.sort();
    }
}
