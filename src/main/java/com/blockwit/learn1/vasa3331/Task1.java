package com.blockwit.learn1.vasa3331;

import java.util.Scanner;

    public class Task1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите Ваш год рождения?");
            int year = sc.nextInt();
            sc.nextLine();
            System.out.println("Введите Ваше Имя?");
            String name = sc.nextLine();
            System.out.println(name + " ,вам: " + (2022 - year) + " лет");
        }
    }