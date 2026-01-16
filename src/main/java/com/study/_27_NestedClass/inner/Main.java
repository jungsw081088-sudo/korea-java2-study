package com.study._27_NestedClass.inner;

public class Main {
    public static void main(String[] args) {
        Member m1 = Member // 클래스 참조
                .builder() // Builder 객체
                .age(20) // Builder 객체에 set
                .name("홍길동") // Builder 객체에 set
                .email("java@mail.com") // Builder 객체에 set
                .build(); // 그대로 필드값들 복사해서 m1으로 전달

        LombokUser u1 = LombokUser.builder()
                .username("롬복맨")
                .name("롬복")
                .address("미국")
                .build();

        LombokUser u2 = new LombokUser(
                "롬복맨",
                "롬복",
                "미국"
        );

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u1.equals(u2));
    }
}
