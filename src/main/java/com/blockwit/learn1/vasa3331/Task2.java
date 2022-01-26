package com.blockwit.learn1.vasa3331;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите Ваш год рождения");
        int year = sc.nextInt();
        System.out.print("Введите Ваше Имя");
        String name = sc.nextLine();
        sc.close();
        System.out.print(name + " ,вам: " + (2022 - year) + " лет");
    }
}
