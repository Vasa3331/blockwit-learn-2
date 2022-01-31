package com.blockwit.learn2.vasa3331;

public class TaskS7T3 {
    public static int[] a = {7, 4, 2, 8, 6, 7};
    public static int[] b = {6, 2, 9};
    public static int[] res;

    public void printIntArray() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" - Массив a");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(" - Массив b");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println(" - Массив res");
    }

    public static void main(String[] args) {
        res = new int[a.length + b.length];
        for (int i = 0; i < res.length - b.length; i++) {
            if (a.length > b.length) {
                if (i * 2 <= b.length * 2) {
                    res[i * 2] = a[i];
                } else {
                    res[i + 3] = a[i];
                }
            }
        }
        for (int j = 0; j < b.length; j++) {
            res[j * 2 + 1] = b[j];
        }
        TaskS7T3 mass = new TaskS7T3();
        mass.printIntArray();
    }
}

