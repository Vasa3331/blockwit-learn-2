package com.blockwit.learn2.vasa3331;

import java.util.*;

public class RunnerHashMap {
    public static void main(String[] args) {
        Map<Integer, Book> books = new HashMap();
        Book book1 = new Book("Война и мир", 1234567);
        Book book2 = new Book("Идиот", 2457894);
        Book book3 = new Book("Преступление и наказание", 4309857);
        Book book4 = new Book("Петр I", 5069773);
        Book book5 = new Book("Капитанская дочка", 4096783);
        Book book6 = new Book("Анна Каренина", 4964769);

        books.put(book1.getISBN(), book1);
        books.put(book2.getISBN(), book2);
        books.put(book3.getISBN(), book3);
        books.put(book4.getISBN(), book4);
        books.put(book5.getISBN(), book5);
        books.put(book6.getISBN(), book6);



    }

}
