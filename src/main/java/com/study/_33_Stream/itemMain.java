package com.study._33_Stream;

import java.util.Arrays;
import java.util.List;

public class itemMain {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("삼성 노트북", 5, true, 1000000),
                new Item("로지텍 마우스", 0, true, 30000),
                new Item("삼성 키보드", 10, false, 50000),
                new Item("헤드셋", 3, true, 80000),
                new Item("마이크", 0, false, 60000)
        );

        // 이름에 삼성이 들어간 상품 중 10만원 이하 찾기
        List<Item> result1 = items.stream()
                .filter(i -> i.getName().contains("삼성"))
                .filter(i -> i.getPrice() <= 100000)
                .toList();

        System.out.println(result1);

        // 이름에 로지텍이 없는 상품 및 세일중인 상품 중 10만원 이하 상품 찾기
        List<Item> result2 = items.stream()
                .filter(i -> !i.getName().contains("로지텍"))
                .filter(i -> i.isOnSale())
                .filter(i -> i.getPrice() <= 100000)
                .toList();

        System.out.println(result2);

        // 세일중인 상품들 전체 가격 총합

        // 최종연산자
        // reduce(초기값, (누적변수, 꺼내올변수) -> 연산식)
        // 초기값 -> 누적변수의 초기값
        // 리턴된 값은 누적변수에 재대입
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int total = nums.stream()
                .reduce(0, (sum2, num) -> sum2 + num);


        int result3 = 0;
        List<Integer> totalPrices = items.stream()
                .filter(i -> i.isOnSale())
                .map(i -> i.getStock() * i.getPrice())
                .toList();

        for(Integer price : totalPrices) {
            result3 += price;
        } // sadf

        System.out.println(result3);


    }
}
