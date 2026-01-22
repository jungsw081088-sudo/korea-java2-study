package com.study._30_Generic.eraser;

public class Main {
    public static void main(String[] args) {
        // 제너릭 타입소거
        // 제너릭타입은 런타임에 소거된다.
        // new로 생성된 실제 객체타입은 Object!!!

        // + 오버로딩되어있는 메서드 호출시
        // -> 내가 의도한 메서드 호출이 일어나지 않음
        Box<Integer> box = new Box(0);
        box.print();
    }
}
