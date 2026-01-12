package com.study._15_Class;

public class ClassMain {
    public static void main(String[] args) {
        // 클래스 : 내가 정의하는 참조 자료형

        int[] scores = {80, 90, 40, 60}; // 누구의 점수?
        String[] names = {"홍길동1", "홍길동2"};

        // (이름, 국, 영, 수) 한셋트로 묶어서 관리 가능할까?
        // (String, int, int, int): 이런 자료들의 묶음을 정의하겠다

        // Student 자료형의 student1 변수 선언 -> stack에 student1 생성
        Student student1;

        // new : 참조자료형 데이터를 저장할때(heap 메모리공간을 할당)
        // 할당된 메모리주소를 student1에 대입
        student1 = new Student();

        // heap주소에 직접대입
        // heap주소.필드명 = 데이터
        student1.name = "홍길동";
        student1.kor = 90;
        student1.eng = 80;
        student1.math = 70;

        Student student2 = new Student();
        // student1, student2는 변수, Student는 클래스(자료형)
        // new해서 실제 heap에 올라간 데이터묶음을 객체 or 인스턴스라고 부른다

        // Student 객체들을 저장하는 배열
        Student[] students = {student1, student2};

        /*
            클래스를 정의해 주세요
            클래스이름: Car
            필드: brand(회사명), model(모델명), year(출시년도)
            Car 객체 1개를 생성하고 서로 다르게 초기화
        */
        Car car1 = new Car();
        car1.brand = "현대";
        car1.model = "소나타";
        car1.year = 2025;
        System.out.println("브랜드: " + car1.brand);
        System.out.println("모델: " + car1.model);
        System.out.println("출시년도: " + car1.year);

        Car car2 = new Car();
        car1.isEngineOn = false;
        car1.speed = 0;
        car2.isEngineOn = false;
        car2.speed = 0;

        System.out.println(car1.isEngineOn); // car1의 상태확인
        car1.engineStart(); // 객체의 상태를 메서드로 접근해서 변경
        System.out.println(car1.isEngineOn);

        // 객체의 상태를 바꿀때 검증된 상황에서만 바꿀 수 있다
        car1.accelerate();
        car2.accelerate(); // engineOn이 false이기때문에 작동x

        System.out.println("현재속도: " + car1.speed); // 상태확인
        car1.brake();
        System.out.println("현재속도: " + car1.speed);
        // 객체의 상태값을 검증하여서 안전한 값을 보관할 수 있다.
        car1.brake();
        System.out.println("현재속도: " + car1.speed);


        // 생성자
        Student st1 = new Student("홍길동", 90, 80, 70);
        int totalScore1 = st1.getTotalScore();
        System.out.println(totalScore1);

        Student st2 = new Student("김길동", 10, 20, 30);
        int totalScore2 = st2.getTotalScore();
        System.out.println(totalScore2);
        // st1과 st2는 각기 다른 주소를 this로 전달하기때문에
        // 같은 메서드 호출이지만, 서로 다른 결과가 나온다

    }
}
