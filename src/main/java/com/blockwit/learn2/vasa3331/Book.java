package com.blockwit.learn2.vasa3331;

public class Book implements IBook{

    String name;

    int ISBN;

    public Book(String name) {
        this.name = name;
    }


    public String getName(){
        return name;
    }

}
