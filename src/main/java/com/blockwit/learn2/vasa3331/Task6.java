package com.blockwit.learn2.vasa3331;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[4];
        System.out.println("please enter 4 numbers");
        for (int i = 0; i < 4; i++) {
            numbers [i] = sc.nextInt();// Input the array with elements entered from the keyboard
            sc.nextLine();
        }
        int tmp;
        if (numbers[3] > numbers[0]) {
            tmp = numbers[3];
            numbers[0] = numbers[3];
            numbers[3] = tmp;
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
