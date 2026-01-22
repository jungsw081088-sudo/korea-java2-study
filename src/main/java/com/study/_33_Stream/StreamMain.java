package com.study._33_Stream;

import com.study._32_Lambda.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 람다 & 스트림 -> 자바8(jdk 8) 부터 지원
// 1. 원본을 변경하지 않는다 (new로 리턴)
// 2. 파이프라인구조(체이닝) - 자기자신을 리턴
public class StreamMain {
    public static void main(String[] args) {
        // 스트림을 생성하는 방법들
        // 1. 컬렉션.stream() - List, Set...
        // 2. Arrays.stream() - 배열
        List<String> names = Arrays.asList(
                "김자바", "이파이썬", "박스프링",
                "최코틀린", "김자바", "정리액트"
        );
        names.stream() // 스트림으로 변환
                // forEach(): 매개변수로 Consumer를 받음
                // 우리는 인라인으로 Consumer를 이식받은 익명객체를 구현
                .forEach(name -> System.out.println(name));

        // forEach같은 함수들을 stream 연산이라고 한다
        // Stream 연산의 종류
        // 1. 중간연산: 체이닝 가능(여러 단계 가능), 지연연산(최종연산을 할때까지 실행x)
        // 2. 최종연산: 체이닝 x, 최종연산시 중간연산들을 실행


        // 중간연산들
        // 1. filter(Predicate<T> p)
        // 함수결과가 true인 데이터만 남긴다
        List<String> kims = names.stream() // 스트림변환
                .filter(name -> name.startsWith("김")) // 중간연산
                .toList(); // 최종연산

        System.out.println(kims);

        // 2. map(Function<T, R> f)
        // 데이터를 변환할때 사용
        List<Person> people = names.stream()
                .map(name -> new Person(name, 0))
                .toList();

        System.out.println(people);

        // 3. distinct() - 중복제거(객체의 경우 equals, hashcode 결과 비교)
        // 4. limit(갯수) - 갯수제한
        List<String> unique4Names = names.stream()
                .distinct() // 중복제거
                .filter(name -> name.length() == 4) // 필터링
                .limit(2) // 2명만
                .toList(); // 최종연산

        // 최종연산
        // 1. collect(Collector<T, A, R> c)
        // 내부적으로 여러 함수형 인터페이스를 조합(복잡함)
        // 그래서 직접 구현x 자바에서 미리 정의되어있음
        // Collectors.toList(), Collectors.toSet() - 자바 8 기준
        // toList(), toSet() - 자바 17기준

        // 2. forEach(Consumer<T> c)
        names.stream()
                .filter(name -> name.length() == 4)
                .forEach(name -> System.out.println(name));


        // 실습) nums를 stream API를 사용하여
        // 홀수들만 골라내서 제곱한 결과를 출력해 주세요
        List<Integer> nums = Arrays.asList(1, 2, 4, 10, 15, 20);
        nums.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .forEach(m -> System.out.println(m));
    }
}
