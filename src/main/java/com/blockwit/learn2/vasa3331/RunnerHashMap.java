package com.blockwit.learn2.vasa3331;

import java.util.*;

public class RunnerHashMap {
    public static void main(String[] args) {
        Map<Integer, IBook> books = new HashMap();
        Book book1 = new Book("Война и мир");
        Book book2 = new Book("Идиот");
        Book book3 = new Book("Преступление и наказание");
        Book book4 = new Book("Петр I");
        Book book5 = new Book("Капитанская дочка");
        Book book6 = new Book("Анна Каренина");

        books.put(1234567, book1);
        books.put(2457894, book2);
        books.put(4309857, book3);
        books.put(5069773, book4);
        books.put(4096783, book5);
        books.put(4964769, book6);
        IBook bookN = books.get(5069773);


        System.out.println(bookN.getName());


    }

}
