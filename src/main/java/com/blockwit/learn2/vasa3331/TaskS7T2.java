package com.blockwit.learn2.vasa3331;

public class TaskS7T2 {
    public static void main(String[] args) {
        int [] a = {6, 3, 8, 9};
        int [] b = {0, 3, 1, 5};
        int [] res;
        res = new int[a.length + b.length];
        for (int i = 0; i < res.length; i = i + 2) {
            res[i] = a[i/2];
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
