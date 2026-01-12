package com.study._14_Method;

public class Return {
    // 리턴이 존재한다면, void대신 리턴할 데이터의 자료형을 정의해준다
    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    // "홍길동" -> "홍길동님"
    public static String addNim(String name) {
        String result = name + "님";
        return result;
    }

    public static void main(String[] args) {
        // 리턴? 호출결과
        // 리턴되는 데이터가 값이면 값처럼,
        // 객체면 객체처럼 다룰 수 있다.

        int sum = add(10, 20);
        System.out.println(sum); // 30
        // 호출결과가 값이면 값처럼
        // f(g()) -> g()호출되고, f()호출된다.
        int sum2 = add(10, add(10, 20)); // 40
        // 리턴되어 돌아온 값 또한 stack값을 복사해서 가져온 것!

        String name = "홍길동";
        String nim = addNim(name);
        System.out.println(nim); // "홍길동님"
        // 리턴되는 데이터가 참조자료형이면 참조할 수 있다.
        // ~님으로 끝나나?
        if(nim.endsWith("님")) {
            System.out.println("님으로 끝나는 문자열입니다.");
        }

        if(addNim(name).endsWith("님")) {
            System.out.println("님으로 끝나는 문자열입니다.");
        }

        int lenOfStr = addNim(name).length();

    }
}
