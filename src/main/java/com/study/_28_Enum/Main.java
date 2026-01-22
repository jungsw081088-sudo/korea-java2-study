package com.study._28_Enum;

public class Main {
    // 할인율 차등적용한 가격을 리턴하는 메서드
    public static double discount(int price, ClassGrade grade) {
        int discountRate = 0;
        // == 연산자 사용 가능하다! (주소비교도 가능하다!)
        if (grade == ClassGrade.BASIC) {
            // 매직넘버 예방이 가능하다.
            discountRate = ClassGrade.BASIC.getDiscountRate();
        } else if (grade == ClassGrade.GOLD) {
            discountRate = ClassGrade.GOLD.getDiscountRate();
        } else if (grade == ClassGrade.DIAMOND) {
            discountRate = ClassGrade.DIAMOND.getDiscountRate();
        } else {
            System.out.println("할인없음!");
        }

        double finalPrice = price * discountRate / 100.0;
        return finalPrice;
    }
    public static void main(String[] args) {
        int price = 10000;
        // 회원의 등급을 가져오는 코드


        // 객체를 상수처럼 쓰면서, 컴파일시점에 에러(타입검증) 볼수있다.
        // 문법적으로 상수사용을 강제하는 시스템을 만들 수 있다.
        double result = discount(10000, ClassGrade.GOLD);

        double diamondResult = Grade.DIAMOND.getDiscountPrice(price);

        // enum은 Enum클래스 상속 -> Enum클래스에 정의된 메서드 사용o
        // 1. String -> enum의 상수이름
        Grade goldConstantObj = Grade.valueOf("GOLD");
        System.out.println(goldConstantObj == Grade.GOLD);
        System.out.println(goldConstantObj.getDiscountRate());

        // 2. enum의 상수이름 -> String
        String goldName = Grade.GOLD.name();
        System.out.println(goldName.equals("GOLD"));

    }
}
