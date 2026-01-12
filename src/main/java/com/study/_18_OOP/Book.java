package com.study._18_OOP;

public class Book {
    private String title; // 책 제목
    private String author; // 책 저자

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
}
