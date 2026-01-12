package com.study._11_BreakContinue;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // while문 내에서 비밀번호를 콘솔창으로 입력받아주세요
        // 비밀번호가 틀리면, 다시 입력(시도횟수 증가)
        // 최대 5회까지 시도가능, 5회에 도달하면 "계정이 잠겼습니다"출력, 탈출
        // 입력이 비어있으면(""), 다시입력하세요 출력->다시입력!(시도횟수 증가x)

        String password = "1q2w3e4r";
        Scanner scanner = new Scanner(System.in);
        int count = 0; // 시도횟수 카운팅
        while(true) {
            // 입력받기
            System.out.print("비밀번호를 입력하세요 >>");
            String myInput = scanner.nextLine();

            // 공백입력시 처리(공백의 길이는 0) - 시도횟수증가 x
            // 문자열.isEmpty(): 문자열.length() == 0
            // 문자열.isBlank(): 공백을제거한문자열.length() == 0
            if(myInput.isEmpty()) {
                System.out.println("다시 입력하세요");
                continue; // 다음반복으로
            }

            // 비밀번호 대조
            if (myInput.equals(password)) { // 패스워드 맞췄다면
                System.out.println("로그인성공!");
                break;
            } else {
                count++; // 시도횟수 증가
                System.out.println("비밀번호가 틀렸습니다!");
            }

            // count 5회 누적시 처리
            if (count == 5) {
                System.out.println("계정이 잠겼습니다.");
                break;
            }
        }
    }
}
