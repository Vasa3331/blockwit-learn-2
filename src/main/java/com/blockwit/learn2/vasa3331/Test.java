package com.blockwit.learn2.vasa3331;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        MyIntArrayList list = new MyIntArrayList();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            int x = r.nextInt();
            list.add(x);
        }
        System.out.println(list.size());
        Helper helper = new Helper();
        helper.printInList(list.elements);
        list.clear();
    }
}
