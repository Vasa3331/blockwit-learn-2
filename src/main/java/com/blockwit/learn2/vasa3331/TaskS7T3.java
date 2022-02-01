package com.blockwit.learn2.vasa3331;

public class TaskS7T3 {
    public static void main(String[] args) {
        int[] a = {7, 4, 2, 8, 6, 7};
        int[] b = {6, 2, 9};
        int[] res;
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
        Helper mass1 = new Helper();
        mass1.printIntArray(a);
        System.out.println(" - Массив a");
        Helper mass2 = new Helper();
        mass2.printIntArray(b);
        System.out.println(" - Массив b");
        Helper mass3 = new Helper();
        mass3.printIntArray(res);
        System.out.println(" - Массив res");
    }
}

