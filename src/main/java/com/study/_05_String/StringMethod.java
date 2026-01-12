package com.study._05_String;

public class StringMethod {
    public static void main(String[] args) {
        /*
            자료형분류
            1. 첫글자가 소문자: 원시자료형
            2. 첫글자가 대문자: 참조자료형

            JVM: .class파일을 읽고 코드를 실행시키는 주체
            - JVM의 메모리
            1. stack
                - 원시자료형 실제 값이 저장된다.
                - 참조자료형의 메모리주소(heap주소)가 저장된다.
            2. heap - 참조자료형의 실제 값이 저장된다.
        */

        // String은 참조자료형이기때문에
        // 참조를 통해 여러 기능을 사용할 수 있음

        String str = "My name is Son";
        // 문자열데이터의 길이(문자가 몇개?)
        int lengthOfStr = str.length();
        System.out.println("문자열 길이: " + lengthOfStr);

        // 특정 문자열의 포함 여부 : 결과가 boolean
        boolean isContainName = str.contains("name");

        // 문자열은 문자들이 이어져있는 구조다.
        // 순서(index)가 존재
        str = "We Study java";

        // 특정 문자열이 어디서 시작하는지(indexOf)
        int indexOfStudy = str.indexOf("Study");
        System.out.println(indexOfStudy);

        // 부분문자열 추출(substring)
        // 문자열.substring(index) : 해당 index부터 끝까지
        System.out.println(str.substring(3));
        // 문자열.substring(index1, index2) : index1이상 index2미만
        System.out.println(str.substring(3, 8)); // 3이상 8미만(3~7)


        // 실습) "Java"를 추출
        str = "We Study Java";
        String targetStr = "Study";

        // 1. "Java"가 있는지 확인 - contains()
        boolean isTargetExist = str.contains(targetStr);
        System.out.println("target이 존재합니까? " + isTargetExist);

        // 2. "Java"의 index를 찾기 - indexOf()
        int idxOfTarget = str.indexOf(targetStr);
        System.out.println("target의 index: " + idxOfTarget);

        // 3. 잘라오자! - 숫자대신 변수
        int lengthOfJava = targetStr.length();
        String myTarget = str.substring(idxOfTarget, idxOfTarget + lengthOfJava);
        System.out.println("잘라온 결과: " + myTarget);

    }
}
