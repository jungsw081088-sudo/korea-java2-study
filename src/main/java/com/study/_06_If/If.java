package com.study._06_If;

public class If {
    public static void main(String[] args) {
        /*
        if(boolean 데이터) {
            // boolean데이터가 true일때
            // 실행되는 코드
        }
        */
        if (true) {
            System.out.println("실행1");
        }

        if (false) {
            System.out.println("실행2");
        }

        int height = 160;
        int age = 23;

        if (height >= 120) {
            System.out.println("탑승 가능!");
        }

        // if() 소괄호 안에는
        // 최종 연산의 결과가 boolean이면 ok
        if (height >= 120 && age < 14) {
            System.out.println("탑승 가능!");
        }

        String test = "Study Java";
        if(test.contains("Java")) {
            System.out.println("자바를 포함하고있는 문자열");
        }

        // if ~ else if ~ else
        // 조건에 따라 작성할때 조건을 오름차순이나 내림차순으로 작성
        // 하나의 조건이 만족되면, 나머지는 검사하지 않음
        // 오직 하나의 블록만 실행 됨
        age = 5;
        if(age <= 7) {
            System.out.println("미취학 아동입니다");
        } else if(age <= 13) { // age > 7
            // else if 조건이 검사되는 경우: 위의 조건들이 모두 false
            System.out.println("초등학생 입니다");
        } else if(age <= 16) { // age > 7 && age > 13
            System.out.println("중학생 입니다");
        } else if(age <= 19) {
            System.out.println("고등학생 입니다");
        } else {
            System.out.println("성인입니다");
        }

        boolean isLogin = false; // 로그인되었는가?
        boolean isBanned = true; // 계정이 밴 계정인가?

        if(!isLogin) {
            // 로그인이 되지 않았다면
            System.out.println("로그인이 필요합니다.");
        } else if (isBanned) {
            System.out.println("정지된 계정입니다.");
        }

        // early return
        if(!isLogin) {
            System.out.println("로그인이 필요합니다.");
            return; // 메서드 종료
        }

        if(isBanned) {
            System.out.println("정지된 계정입니다.");
        }


    }
}
