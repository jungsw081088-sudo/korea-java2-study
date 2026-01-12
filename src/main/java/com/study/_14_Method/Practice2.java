package com.study._14_Method;

import java.util.Scanner;

public class Practice2 {

    public static boolean validateEmail(String email) {
        // email에 "@"있나? 문자열.contains()
        // email에 "."있나?
        if(email.contains("@") && email.contains(".")) {
            System.out.println("유효합니다!");
            return true; // 얼리리턴 패턴
        }

        System.out.println("유효하지 않습니다");
        return false;
    }

    public static void main(String[] args) {
        // 이메일을 스캐너를 통해 입력받고 -> 매개변수로 전달
        // 유효한 이메일인지 검사하는 메서드를 작성
        // 유효하면 유효합니다! 출력 후 true 반환
        // 유효기준: "@"가 있는지? && "."가 있는지?

        Scanner scanner = new Scanner(System.in);
        System.out.print("이메일을 입력해 주세요 >");
        String email = scanner.nextLine();
        boolean result = validateEmail(email);
        System.out.println("결과: " + result);
    }
}
