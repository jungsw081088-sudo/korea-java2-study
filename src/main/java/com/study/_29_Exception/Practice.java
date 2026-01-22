package com.study._29_Exception;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이메일을 입력하세요 >");
        String email = scanner.nextLine();
        
        // 커스텀예외를 만들어주세요(InvalidEmailException)
        // 조건
        // 1. 빈문자열이면 예외생성 : 이메일이 비었습니다 : {입력값}
        // 2. "@"가 업으면 예외생성: 이메일에 @가 없습니다 : {입력값}
        // 정상이면 "유효한 이메일입니다 : {입력값}"

        try {
            // 문자열.length() == 0 or 문자열.equals("")
            if (email.isEmpty()) {
                throw new InvalidEmailException("이메일이 비어있습니다", email);
            }

            if (!email.contains("@")) {
                throw new InvalidEmailException("이메일에 @가 없습니다", email);
            }

        // 자식타입먼저 catch -> 부모타입 catch ....
        } catch (InvalidEmailException e) {
            System.out.println("커스텀으로 캐치함");
            System.out.println(e.getMessage());
        // 상속받은 부모타입으로도 캐치 가능
        } catch (RuntimeException e) {
            System.out.println("부모타입으로 캐치함");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("상위 부모타입으로 캐치함");
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
