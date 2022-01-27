package com.blockwit.learn2.vasa3331;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the quantity of your friends");
        int size = sc.nextInt();
        sc.nextLine();
        String names[] = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the name " + (i + 1) + " :");
            names[i] = sc.nextLine();
        }
        System.out.println("All names in reverse order:");
        for (int i = (size - 1); i >= 0; --i) {
            System.out.println(names[i]);
        }
    }
}

