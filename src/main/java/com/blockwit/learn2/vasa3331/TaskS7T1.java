package com.blockwit.learn2.vasa3331;

public class TaskS7T1 {
    public static void main(String[] args) {
        int [] a = {-9, 1, 5, 6, 8};
        int [] b = {7, 3, 1};
        int [] res;
        res = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }
        for (int i = a.length; i < res.length; i++) {
            res[i] = b[i - a.length];
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
