package com.blockwit.learn2.vasa3331;

public class Test {
    public static void main(String[] args) {
        ProtoList1 array1 = new ProtoList1();
        ProtoList1 array2 = new ProtoList1();
        int[] a1 = array1.create(4);
        int[] a2 = array2.create(6);
        System.out.println(array1.getSize(a1));
        System.out.println(array2.getSize(a2));
        System.out.println(array1.getIndex(a1, 3));
        System.out.println(array2.getIndex(a2, 0));
    }
}




