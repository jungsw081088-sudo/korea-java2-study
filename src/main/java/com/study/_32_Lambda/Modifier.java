package com.study._32_Lambda;

@FunctionalInterface
public interface Modifier<T> {
    T modify(T t);
}
