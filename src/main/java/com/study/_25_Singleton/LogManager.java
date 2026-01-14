package com.study._25_Singleton;

public class LogManager {
    /*
    디자인 패턴 - 싱글톤(스프링부트, 서버)
    프로그램에서 단 하나의 객체(인스턴스)를 공유하도록 하고 싶다.

    */

    // 상태가 고정값 - static
    // 외부접근을 막음 - private
    // 공유할 자기자신타입의 필드를 가지고 있음
    private static LogManager instance;

    // 기본생성자 - private로 외부접근을 막는다.
    private LogManager() {}

    /*
    1. 생성자 - 외부에서 new 못하게 private
    2. 공유할 객체 변수를 필드로 가진다
    2. 외부에서 접근가능한 메서드로 단 하나의 인스턴스만 리턴한다.
    */
}
