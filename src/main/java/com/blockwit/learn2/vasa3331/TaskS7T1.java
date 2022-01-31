package com.blockwit.learn2.vasa3331;

public class TaskS7T1 {
    public static int [] a = {-9, 1, 5, 6, 8};
    public static int [] b = {7, 3, 1};
    public static int [] res;

    public void printIntArray() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args) {
        res = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }
        for (int i = a.length; i < res.length; i++) {
            res[i] = b[i - a.length];
        }
        TaskS7T1 mass = new TaskS7T1();
        mass.printIntArray();
    }
}
