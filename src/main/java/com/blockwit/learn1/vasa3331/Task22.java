package com.blockwit.learn1.vasa3331;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[] = new String[4]; // Создаём массив размером в 4 имени
        int years[] = new int[4]; // Создаём массив размером в 4 года рождения
       /*Пройдёмся по массивам, заполняя их*/
        for (int i = 0; i < names.length; i++) {
            System.out.println("Введите имя");
            names[i] = sc.nextLine();// Заполняем массив элементами, введёнными с клавиатуры
            System.out.println("Введите год рождения");
            years[i] = sc.nextInt();// Заполняем массив элементами, введёнными с клавиатуры
            sc.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + (2022 - years[i]) + " лет."); // Выводим на экран, полученный массив
        }
    }
}
