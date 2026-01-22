package com.study._33_Stream;

import java.util.Arrays;
import java.util.List;

public class OperationMain {
    public static void main(String[] args) {
        // 정렬 > 정렬알고리즘 = 다양
        // 4. sorted(Comparator<T> c)
        // 함수형 인터페이스 Comparator<T>를 매개변수로 받는다.
        // compare(T o1, T o2)

        List<Integer> numbers = Arrays.asList(1, 3, 5, 4, 2, 9, 10);
        List<Integer> sortedNums = numbers.stream()
                .sorted((n1, n2) -> n1 - n2)
                .toList();
        // 정렬의 결과는 우리가 작성한 람다함수의 리턴값에 따라 달라진다

        // 오름차순일 때
        // n1과 n2가 같으면 0을 리턴
        // n1 > n2 양수
        // n1 < n2 음수
        System.out.println(sortedNums);

        // 내림차순?
        List<Integer> sortedNums2 = numbers.stream()
                .sorted((n1, n2) -> n2 - n1)
                .toList();

        System.out.println(sortedNums2);

        List<String> names = Arrays.asList("김자바", "이파이썬",
                "박스프링", "김자바", "정리엑트");

        // 문자정렬
        // 기본: 사전순 정렬
        // 문자는 숫자로 변환 가능
        // - 사전에서 뒤에 출현하는 문자가 더 큰 숫자

        List<String> sortedNames = names.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .toList(); // 사전순 정렬

        List<String> sortedNames2 = names.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .toList(); // 사전역순 정렬
    }
}
