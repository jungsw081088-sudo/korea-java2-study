package com.study._23_Interface;

// 인터페이스
public interface Animal {
    // 필드 선언이 불가능
    // static 필드 선언은 가능(상수)
    // String name = "어쩌고"로 선언하면
    // public static final가 생략되어있음
    // public static final String name = "홍길동";

    // 기능만 정의
    // 메서드는 시그니처만 정의
    // 모든 메서드는 public abstract가 생략되어있다.
    void sound();
    void move();

}
