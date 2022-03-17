package com.blockwit.learn2.vasa3331;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        Queue q1 = new Queue(10);
        char[] name = {'T', 'o', 'm'};
        Queue q2 = new Queue(name);
        char ch;
        int i;
        // Поместить ряд символов в очередь q1
        for (i = 0; i < 10; i++) q1.put((char)('A' + i));
        // Создание очереди на основе другой
        Queue q3 = new Queue(q1);
        // Показать очереди
        System.out.print("Содержимое q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Содержимое q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Содержимое q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("Использование очереди bigQ для сохранения алфавита");
        // Помесить буквенные символы в очередь bigQ
        for(i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));
        // извлечь буквенные символы из очереди bigQ и отобразить
        System.out.println("Содержимое очереди bigQ: ");
        for(i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Использование очереди smallQ для генерации ошибок");
        // Использование очереди smallQ для генерации ошибок
        for(i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        // Дополнительные ощибки при обращении к очереди SmallQ
        System.out.println("Содержимое очереди smallQ: ");
        for(i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}
