package com.study._24_Object;

import java.util.Objects;

public class ObjectStudent {

    private int age;
    private String name;

    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        ObjectStudent that = (ObjectStudent) o;
        // 필드값비교 - 원시자료형 == 연산자
        boolean isSameAge = this.age == that.age;
        // 참조자료형 비교 - Objects.equals()
        boolean isSameName = Objects.equals(name, that.name);
        return isSameName && isSameAge;
    }
}
