package com.blockwit.learn2.vasa3331;

public class Book {

    private String name;

    private int ISBN;

    public Book(String name, int ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }


    public String getName(){
        return name;
    }

    public int getISBN() {
        return ISBN;
    }

}
