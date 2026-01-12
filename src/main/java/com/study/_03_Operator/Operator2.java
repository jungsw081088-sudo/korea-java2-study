package com.study._03_Operator;

public class Operator2 {
    public static void main(String[] args) {
        // 논리연산 (and, or, not)
        // 피연산자가 boolean 데이터
        // && : and - 둘다 true여야 true
        // || : or - 둘중 하나만 true여도 true
        // ! : true -> false, false -> true

        int age = 25;
        boolean hasLicense = true;
        boolean canDrive = (age > 18) && hasLicense;
        System.out.println(canDrive);
        String a = "hello";
        // boolean 데이터에 !연산시 결과가 반전
        System.out.println(!a.equals("hello"));
    }
}
