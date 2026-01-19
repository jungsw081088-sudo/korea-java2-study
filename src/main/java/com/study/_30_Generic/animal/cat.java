package com.study._30_Generic.animal;

public class cat extends Animal {
    public cat(String name, int size) {
        super(name, size);
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
