package com.study._15_Class;

public class Student { // Student 클래스 정의 시작
    // 클래스 -> 필드값(상태) + 메서드(동작)

    // 필드(값), 멤버(변수), 속성
    String name;
    int kor;
    int eng;
    int math;

    // 생성자 정의(객체 생성(new)시 호출되는 메서드)
    // 엄밀히 말하면 메서드는 x
    public Student(String name, int kor, int eng, int math) {
        // 명시하지는 않지만, 생성자 호출시 객체자기 자신의 heap주소를
        // this에 전달한다.
        System.out.println("생성자 호출됨!");
        // 초기화
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        // this는 객체 자신을 가르키는 heap 주소값이다.
        // 객체의 필드값들은 heap에 생성된다.
        // this는 그 힙에 있는 해당 객체의 메모리 주소를 의미한다.
    }

    public Student() {}

    int getTotalScore() {
        // 원래 메서드는? 매개변수로 점수들을 넘겨줬음
        // 객체의 상태를 참조하고있음
        // 객체.메서드() -> 인스턴스 메서드
        // 객체.메서드() 호출시 this를 넘겨줌
        int totalScore = this.kor + this.eng + this.math;
        return totalScore;
    }

} // 클래스 정의 끝
