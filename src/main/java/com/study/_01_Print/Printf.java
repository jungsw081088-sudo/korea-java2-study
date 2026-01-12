package com.study._01_Print;

public class Printf {
    public static void main(String[] args) {
        int age = 25;
        double height = 173.5;
        String name = "홍길동";

        // "제 이름은 ~이고, 나이는 ~살, 키는 ~cm입니다"
        /*
            %d(decimal) -> 정수
            %f(float) -> 실수
            %s(string) -> 문자열
        */
        System.out.printf(
                "제 이름은 %s이고, 나이는 %d살, 키는 %.2fcm입니다",
                name,
                age,
                height
                );
    }
}
