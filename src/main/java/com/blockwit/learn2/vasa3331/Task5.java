package com.blockwit.learn2.vasa3331;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[4];
        System.out.println("please enter 4 numbers");
        for (int i = 0; i < 4; i++) {
            numbers [i] = sc.nextInt();// Input the array with elements entered from the keyboard
            sc.nextLine();
        }
        StringBuilder sb = new StringBuilder(numbers[3] + " " + numbers[1]  + " " + numbers[2]  + " " + numbers[0] );
        System.out.println(sb);

    }
}


