package com.study._19_Static;

public class Main {
    public static void main(String[] args) {
        StaticData staticData1 = new StaticData(1);
        StaticData staticData2 = new StaticData(2);
        StaticData staticData3 = new StaticData(3);

        // 생성자 총 3회 호출
        System.out.println(staticData1.count); // 1
        System.out.println(staticData2.count); // 1
        System.out.println(staticData3.count); // 1
        // count필드는 각 객체마다 하나씩 가지고 있음

        // static 필드는 어떨까?
        // static 키워드가 붙으면, 객체가 가지고 있지 않음
        // 클래스가 가지고있는 변수
        // 그 클래스로 부터 만들어진 모든 객체가 공유한다.
        System.out.println(staticData1.staticCount);
        System.out.println(staticData2.staticCount);
        System.out.println(staticData3.staticCount);

        // 클래스이름으로 참조하는 것이 권장되는 접근
        System.out.println(StaticData.staticCount);

        /*
            메서드영역(Method Area)
            - 클래스 정보를 저장하는 공간
            - 클래스정보: 메서드정보(메서드 시그니처), static 변수, 상속정보

            참고) 메서드영역 main을 실행하자마자 먼저 로드된다.
            // -> static 변수는 객체가 생성되기 전부터 존재
        */

    }
}
