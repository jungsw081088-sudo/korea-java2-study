package com.study._16_Constructor;

public class Student {
    String name;
    int kor;
    int eng;
    int math;

    /*
    생성자
    1. 클래스 이름과 동일
    2. 리턴을 명시하지 않는 메서드처럼 작성
    3. 객체생성시(new 연산시) 자동으로 호출된다.
    */

    // AllArgsConstructor
    public Student(String name, int kor, int eng, int math) {
        // this ?
        // 객체 자기자신을 의미
        // 객체의 주소를 this라는 매개변수로 전달한다

        // 매개변수로 들어온 값도 검증할 수 있어야함
        if(kor > 100 || kor < 0) {
            // 정석은 예외를 던져야합니다.
            return;
        }

        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 클래스에서 static키워드가 없으면 인스턴스 메서드다
    // 1. 객체의 상태(필드값)을 언제나 참조할수 있음
    // -> 객체 자신의 주소를 this라는 매개변수로 넘겨줌
    // 2. 인스턴스 메서드는 객체가 생성된 이후에 호출가능
    public int getTotalScore() {
        int sum = this.kor + this.eng + this.math;
        return sum;
    }

    // 생성자도 오버로딩 가능
    // 기본생성자(NoArgsConstructor)
    public Student() {}

    public Student(String name) {
        // Student(name, kor, eng, math) -> AllArgsConstructor
        this(name, 0, 0, 0);
        // this()와 this는 아무런 상관이 없다.
        // this()는 같은 이름의 생성자를 호출 -> 오버로딩된 생성자 호출

        // 제약사항: 생성자의 가장 첫줄에 선언되어야 함


    }
}
