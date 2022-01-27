package com.blockwit.learn1.vasa3331;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array[] = new String[5]; // Создаём массив размером в 5 имен
        System.out.println("Введите 5 имен");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextLine(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
    }
}
