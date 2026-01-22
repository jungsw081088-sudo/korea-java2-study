package com.study._31_Collections;

import java.util.ArrayList;
import java.util.List;

// 컬렉션 자료구조 - 데이터를 저장하는 타입
// List, Map, Set - 셋 다 추상체, 구현체 여러개 존재한다.
public class ListMain {
    public static void main(String[] args) {
        // List(인터페이스) - ArrayList(동적배열)
        // List - LinkedList (노드: next에 대한 정보)
        // LinkedList - 중간 삽입이 많은 서비스에서 고려
        // ArrayList - 탐색이 많은 서비스에서 고려


        // 배열을 필드로 가지고 있음
        // 배열의 크기를 점점 늘려가면서 확장이 가능
        List<String> fruits = new ArrayList<>();

        // C(추가)R(읽기)U(수정)D(삭제)

        // 추가 - add()
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("오렌지");
        // 기존 idx 1인 데이터 및 뒤쪽 idx 데이터들이
        // 한칸씩 밀려난다
        fruits.add(1, "망고");

        // 길이 - size()
        System.out.println(fruits.size());

        // 읽기 - get(index)
        System.out.println(fruits.get(0));

        // 수정- set(index, 데이터)
        fruits.set(0, "키위");

        // 제거 - remove(index), remove(데이터)
        // 제거 하더라도, 해당 인덱스 자리가 비어있지 않음
        // 뒤쪽 데이터들의 index가 하나씩 줄어듬
        fruits.remove(1);
        System.out.println(fruits.get(1)); // null x
        // 중복값이 있다면 index 빠른 것 먼저 제거
        fruits.remove("키위");

        // 포함여부 - contains(데이터)
        System.out.println(fruits.contains("바나나"));

        // for문
        for (String fruit : fruits) {
            System.out.println("과일: " + fruit);
        }

        // TodoList !

    }
}
