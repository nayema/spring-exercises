package com.nayema.springexercises.exercise_01.models;

import java.util.ArrayList;

public class BookRepository {
    private static ArrayList<Book> bookList = new ArrayList<>();

    public static void persistBook(Book book) {
        bookList.add(book);
    }

    public static ArrayList<Book> getBookList() {
        return bookList;
    }
}
