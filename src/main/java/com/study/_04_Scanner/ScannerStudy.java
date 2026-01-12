package com.study._04_Scanner;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        // 스캐너 - 외부(키보드)로 부터 데이터를 java안으로 받아오는 "객체"
        // 스캐너의 데이터타입(자료형): Scanner (참조자료형)
        // new -> heap메모리에 데이터를 생성하라!
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 >>");
        // nextInt() 숫자까지만 잘라옴
        int myInt = scanner.nextInt();
        System.out.println("입력받은 정수: " + myInt);

        scanner.nextLine(); // 남아있는 엔터키 제거

        System.out.print("문자열을 입력하세요 >>");
        // nextLine() : 엔터키까지 인식해서 데이터를 가져온다
        String myStr = scanner.nextLine();
        System.out.println("입력받은 문자열: " + myStr);

        System.out.println(); // 줄바꿈
        // 이름과 나이를 스캐너를 통해 입력받아 출력!
        System.out.print("이름을 입력하세요 >>");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요 >>");
        int age = scanner.nextInt();

        System.out.println("입력한 이름: " + name);
        System.out.println("입력한 나이: " + age);

        scanner.close(); // 스캐너를 반납 - 메모리에서 제거

    }
}
