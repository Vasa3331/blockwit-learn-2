package com.blockwit.learn2.vasa3331;

public class Stack {
    private char[] stck; // массив для хранения элементов стэка
    private int tos;
    // Конструктор при создании стэка с нуля
    Stack(int size) {
        stck = new char[size];
        tos = 0;
    }
// Создать один стэк из другого
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];
        // Скопировать элементы
        for (int i = 0; i < tos; i++) {
            stck[i] = ob.stck[i];

        }
    }
    // создание стэка с начальными значениями
    Stack(char[] a) {
        stck = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }
    // Поместить символы в стэк
    void push(char ch) {
        if(tos == stck.length) {
            System.out.println(" - Стэк заполнен");
            return;
        }
        stck[tos] = ch;
        tos++;
    }
    // метод извлечения из стэка
    char pop() {
        if (tos == 0) {
            System.out.println(" - Стэк пуст");
            return (char) 0;
        }
        tos--;
        return stck[tos];
    }
}
