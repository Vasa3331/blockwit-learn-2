package com.blockwit.learn2.vasa3331;

public class TaskS7T2 {
    public static int [] a = {6, 3, 8, 9};
    public static int [] b = {0, 3, 1, 5};
    public static int [] res;

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
        for (int i = 0; i < res.length; i = i + 2) {
            res[i] = a[i/2];
        }
        for (int j = 0; j < b.length; j++) {
            res[j * 2 + 1] = b[j];
        }
        TaskS7T2 mass = new TaskS7T2();
        mass.printIntArray();
    }
}
