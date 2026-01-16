package com.study._27_NestedClass.inner;
/*
    내부클래스 - "static 내부" or 내부
    정적내부클래스 - private 필드를 접근할수있다 -> 유틸리티를 제공하겠다.
    내부클래스 - 사용하지 x, 왜 그런지?
*/
/*
    내부클래스를 사용하지 않는 이유
    내부객체는 반드시 바깥객체가 안에서만 생성될 수 있음
    -> 내부객체는 항상 바깥객체를 참조하고 있다.
    바깥객체는 더이상 사용되지 않는데, 내부객체만 사용되는 상황
    내부객체에서 참조중인 바깥객체도 Garbage Collector의
    청소 대상이 되지 못한다.
    -> 메모리에 계속 남아있게 된다(메모리 누수)
*/

public class Member {
    // 정적 내부 클래스
    // 클래스와 밀접한 유틸리티가 필요할 때

    private String name;
    private int age;
    private String email;

    // 빌더패턴 - 생성자를 대체하는 패턴
    // 필드가 많을때 생성자를 다양하게 오버로딩 해줘야함
    // 생성자는 메서드와 비슷하게 매개변수의 순서가 중요함


    // 내부에서만 생성자 호출
    private Member(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    // 정적내부 클래스
    // -> Member클래스로 내부클래스에 접근할수있게 메서드정의
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        // 1. 바깥 클래스의 필드를 동일하게 가진다.
        private String name;
        private int age;
        private String email;

        // 2. setter들 정의
        public Builder name(String name) {
            // this는 Builder 객체
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        // a.email("~@.com").age(20) -> 메서드 체이닝
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        // 3. 바깥클래스의 private 생성자를 호출
        public Member build() {
            // builder 객체를 넘겨준다(자기자신)
            Member m = new Member(this);
            return m;
        }

    }

}
