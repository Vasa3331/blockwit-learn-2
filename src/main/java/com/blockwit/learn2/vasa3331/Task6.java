package com.blockwit.learn2.vasa3331;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter 4 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        if (d > a)
            sb.append(d)
                    .append(" ")
                    .append(b)
                    .append(" ")
                    .append(c)
                    .append(" ")
                    .append(a);
        else
            sb.append(a)
                    .append(" ")
                    .append(b)
                    .append(" ")
                    .append(c)
                    .append(" ")
                    .append(d);
        System.out.println(sb);

    }
}
