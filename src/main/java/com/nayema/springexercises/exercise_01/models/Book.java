package com.nayema.springexercises.exercise_01.models;

public class Book {
    private String title;
    private String author;
    private String publishedDate;
    private double price;

    public Book(String title, String author, String publishedDate, double price) {
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
        this.price = price;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
