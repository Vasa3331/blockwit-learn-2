package com.blockwit.learn2.vasa3331;

public class tu0 {
    public static void main(String[] args) {
        int[] array = {12, 7, 89, -4, 8, 9};
        for (int i = 0; i < 6; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
            }
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
