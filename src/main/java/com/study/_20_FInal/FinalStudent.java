package com.study._20_Final;

public class FinalStudent {
    private final String name;
    private final int studentId;
    private int age;

    // 생성자 통해 필드가 초기화되는 코드가 클래스내에 존재해야함
    public FinalStudent(String name, int studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    // 조회는 언제나 가능
    public String getName() {
        return this.name;
    }

//    public void setStudentId(int studentId) {
//        // final이기 때문에 setter를 통해서 재대입이 불가능
//        this.studentId = studentId;
//    }

    public void setAge(int age) {
        this.age = age;
    }

    // final 파라미터
    public void printInfo(final String schoolName) {
        // 외부에서 전달받은 schoolName값을 함수내에서 변경 x
        // schoolName = "자바고등학교"; - 재대입 x
        System.out.println("학교명: " + schoolName);
        System.out.println("이름: " + this.name);
        System.out.println("학번: " + this.studentId);
    }

}
