package com.study._03_Operator;

public class Operator1 {
    public static void main(String[] args) {
        /*
        연산자: 계산을 수행하는 기호
        산술연산자, 비교연산자, 증감연산자, 논리연산자, 대입연산자
        */

        // 산술연산자(사칙연산)
        int a = 5;
        int b = 2;
        System.out.println(a + b); // 덧셈
        System.out.println(a - b); // 뺄셈
        System.out.println(a * b); // 곱셈
        // 나눗셈(정수만 표현, 형변환을 통해 실수부분을 표현)
        System.out.println(a / b);
        // 나머지 연산
        System.out.println(a % b); // 5 / 2 ... 1
        // 배수판별시 나머지연산 자주 사용하게 된다!
        // 페이지네이션에서 자주 사용
        // 162 게시글, 페이지당 20개씩 보여준다.
        // 162 % 20 -> 0이면 162 / 20 페이지
        // 0이 아니면 162 / 20 + 1 페이지

        // 증감연산자
        a = 1;
        // 전위 증감: 먼저 증가하고 사용된다.
        b = ++a; // a를 먼저 증가시키고, 그 값을 b에 대입
        System.out.println(a); // 2
        System.out.println(b); // 2

        // 후위 증감: 먼저 사용되고, 증가한다.
        a = 1;
        b = a++; // a가 먼저 대입되고, 증가한다.
        System.out.println(a);
        System.out.println(b);

        // 전위 감소
        a = 1;
        int c = --a; // a를 먼저 감소시키고, 대입
        // 후위 감소
        a = 1;
        c = a--; // a의 값을 먼저 대입시키고, 감소

        // 단독 사용시 전위 / 후위 결과 동일
        a++;
        ++a;

        // 비교연산자
        a = 2;
        b = 3;

        // 연산의 결과가 boolean 타입의 데이터
        System.out.println(a == b); // 같은지 비교
        System.out.println(a != b); // 다른지 비교
        System.out.println(a > b); // 초과
        System.out.println(a >= b); // 이상
        System.out.println(a < b); // 미만
        System.out.println(a <= b); // 이하

        // 결과를 변수에 저장할 수 있음
        boolean isSame = a == b;

        // 문자열의 값비교는 == 을 사용하면 x
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // == 연산자는 stack에 저장된 값을 비교하는 것
        // String 데이터는 stack에 주소값을 저장하고있어서
        // 서로 다른 주소이기 때문에 false가 결과로 나온것
        System.out.println(str1 == str2);
        /*
        - 자바의 자료형
        1. 원시자료형: int, float, long, double...
        2. 참조자료형: String, Array, 객체..

        - 자바 코드는 JVM(프로그램)위에서 실행된다.
        -> JVM의 메모리에 데이터가 로드되서 연산된다!

        - JVM 메모리 간략소개
        Stack + Heap
        Stack: 원시자료형 데이터 + 참조자료형 heap주소
        heap: 참조자료형(객체)의 데이터
        */

        // 문자열 '값' 비교
        // "." -> 참조
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));
        System.out.println("hello".equals(str1));
        System.out.println(str1.equals("hello"));


    }
}
