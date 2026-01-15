package com.study._25_Singleton;

// 1. 필드 정의
// 2. 정적클래스 정의
// 3. 메서드 체이닝
// 4. 바깥클래스 생성자 정의 -> 빌더가 넘겨주는 매서드
public class User {
    private String username;
    private String name;
    private String address;

    private User(Builder builder) {
        this.username = builder.username;
        this.name = builder.name;
        this.address = builder.address;
    }

    public static class Builder {
        private String username;
        private String name;
        private String address;

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            User u = new User(this);
            return u;
        }
    }


}
