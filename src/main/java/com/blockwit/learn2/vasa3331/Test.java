package com.blockwit.learn2.vasa3331;

public class Test {
    public static void main(String[] args) {
        MyIntArrayList list = new MyIntArrayList();
        for (int i = 0; i < 999; i++) {
            list.add(i);
        }
        System.out.println(list.size());
        Helper helper = new Helper();
        helper.printInList(list.elements);
        list.clear();
    }
}
