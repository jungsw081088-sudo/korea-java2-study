package com.study._30_Generic;

public class WildCard {
    // 와일드 카드 문법 <?>
    // 사용하는 측에서 구체적인 타입이 아니라 <?> 사용하는 방법


    // 와일드카드 Box<String> , Box<Integer> 타입 모두 매개변수로 받겠다
    // Box<T> box와 뭐가 다른가?: Box<T> 객체를 생성할때 유동적으로 타입지정
    // Box<?> 이미 생성되어있는 제너릭 Box들을 모두 대응하겠다.
    public static void printAnyBox(Box<?> box) {
        System.out.println(box.getItem()); // 읽기가능
        // box.setItem("문자열"); // 쓰기가 불가능

        // 오브젝트 취급 됨
        Object myData = box.getItem();

        // 서버응답 -> Response Body에 응답할 때
    }
}
