package com.blockwit.learn2.vasa3331;
import java.util.*;

public class tu0 {
    public static void main(String[] args) {
        int[] a = {12, 7, 89, -4, 8, 9};
        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + " ");
        }
        Arrays.sort(a);
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
