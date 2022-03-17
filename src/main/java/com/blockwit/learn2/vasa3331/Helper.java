package com.blockwit.learn2.vasa3331;

import java.util.*;

public class Helper {

    public void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public void printInList(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
    }
    public Book getBook(Map<Integer, Book> books, int ISBN) {
        return books.get(ISBN);
    }
}