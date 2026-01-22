package com.study._32_Lambda;

// FunctionalInterface 어노테이션
// -> 컴파일시점에 인터페이스에 함수가 하나만 있는지 검사
@FunctionalInterface
public interface StringProcessor {
    String process(String str);
}
