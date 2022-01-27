package com.blockwit.learn2.vasa3331;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter 4 numbers");
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();
        StringBuilder sb = new StringBuilder(d + " " + b + " " + c + " " + a);
        System.out.println(sb);

    }
}


