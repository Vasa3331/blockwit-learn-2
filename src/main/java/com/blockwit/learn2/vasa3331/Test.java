package com.blockwit.learn2.vasa3331;

public class Test {
    public static void main(String[] args) {
        MyIntArrayList list = new MyIntArrayList();
        for (int i = 0; i < 999; i++) {
            list.add(i);
        }
        System.out.println(list.size());
        System.out.println(list.get(555));
        list.clear();
        System.out.println(list.size());
        list.add(444);
        list.add(333);
        System.out.println(list.get(1));
    }
}
