package com.blockwit.learn2.vasa3331;

import java.util.Scanner;

public class ProtoList1 {
    int[] array;

    public ProtoList1(int[] array) {
        this.array = array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the size of the array?");
        int size = sc.nextInt();
        Create array = new Create();
        array.create(size);
        GetSize array = new GetSize();
        int returnValue = array.getSize(z);
        array.getSize(z);
        Get array = new Get();
        array.getIndex();
    }
    public int[] create(int size) {
        int[] array = new int[size];
        return array;
    }
}

