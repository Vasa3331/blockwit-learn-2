package com.blockwit.learn2.vasa3331;

public class StackDemo {
    public static void main(String[] args) {
        Stack stk1 = new Stack(10);
        char[] name = {'T', 'o', 'm'};
        // Создать стэк из массива
        Stack stk2 = new Stack(name);
        char ch;
        int i;
        // поместить символы в stck1
        for(i = 0; i < 10; i++) {
            stk1.push((char) ('A' + i));
        }
        // Создать один стэк из другого
        Stack stk3 = new Stack(stk1);

        // отобразить стеки
        System.out.print("Содержимое stk1: ");
        for(i = 0; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Содержимое stk2: ");
        for(i = 0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Содержимое stk3: ");
        for(i = 0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }
    }
}
