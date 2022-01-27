package com.blockwit.learn2.vasa3331;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp[] = new int[3]; // Создаём массив размером в 3 значения
        /*Пройдёмся по массиву, заполняя его*/
        System.out.println("Введите температуру вчера");
        temp[0] = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите температуру позавчера");
        temp[1] = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите температуру позапозавчера");
        temp[2] = sc.nextInt();
        sc.nextLine();
        Double f = (temp[0] + temp[1] + temp[2]) / 3.0;
        System.out.println("Средняя температура за прошедшие дни составила: " + f); // Выводим на экран, полученный массив
       }
    }



