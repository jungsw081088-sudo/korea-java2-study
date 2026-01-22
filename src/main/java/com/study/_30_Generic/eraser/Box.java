package com.study._30_Generic.eraser;

public class Box<T> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    public void print() {
        Printer printer = new Printer();
        printer.print(this.value);
    }
}
