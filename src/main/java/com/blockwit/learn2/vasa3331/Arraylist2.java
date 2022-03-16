package com.blockwit.learn2.vasa3331;

import java.util.ArrayList;

import java.util.List;

import java.util.Random;

public class Arraylist2 {
    public static void main(String[] args) {
        List a = new ArrayList();
        long startTime1 = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            a.add(random.nextInt());
        }
        long endTime1 = System.currentTimeMillis();

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(a.get(i));
        }
        long endTime2 = System.currentTimeMillis();
        System.out.print("Время заполнения списка: ");
        System.out.println(endTime1 - startTime1);
        System.out.print("Время чтения списка: ");
        System.out.println(endTime2 - startTime2);
    }
}
