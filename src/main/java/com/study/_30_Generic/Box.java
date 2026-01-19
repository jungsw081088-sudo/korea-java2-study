package com.study._30_Generic;

// 타입 매개변수
// <T>, <K, T>, <K, V, E>
public class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }
}
