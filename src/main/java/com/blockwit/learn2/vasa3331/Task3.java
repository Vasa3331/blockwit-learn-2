package com.blockwit.learn2.vasa3331;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp[] = new int[3]; // Создаём массив размером в 3 значения
        /*Пройдёмся по массиву, заполняя его*/
        System.out.println("Input the temperature for the last three days");
        for (int i = 0; i < 3; i++) {
            temp[i] = sc.nextInt();// Заполняем массив элементами, введёнными с клавиатуры
            sc.nextLine();
        }
        Double f = (temp[0] + temp[1] + temp[2]) / 3.0;
        System.out.println("Средняя температура за прошедшие дни составила: " + f); // Выводим на экран, полученный массив
        }
}



