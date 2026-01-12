package com.study._20_FInal;

public class FinalStudent {
    private final String name;
    private final int studentId;
    private int age;

    public FinalStudent(String name, int studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //final 파라미터
    public void printInfo(final String schoolName) {
        // 외부에서 전달받은 schoolName 값을 함수내에서 변경 x
        System.out.println("학교명 : " + schoolName);
        System.out.println("Id : " + studentId);
        System.out.println("나이 : " + age);
    }


}
