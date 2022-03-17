package com.blockwit.learn2.vasa3331;

public class Quicksort {
    static void qsort(char [] items) {
        qs(items, 0, items.length - 1);
    }
    private static void qs(char [] items, int left, int right) {
        int i, j;
        char x, y;
        i = left; j = right;
        x = items[(left + right)/2];
        while (i <= j) {
            while ((items[i] < x) && (i < right)) {
                i++;
            }
            while ((items[j] > x) && (j > left)) {
                j--;
            }

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        }
        if (left < j) qs(items, left, j);
        if (right > i) qs(items, i, right);
    }
}
