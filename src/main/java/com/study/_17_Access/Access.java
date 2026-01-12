package com.study._17_Access;

public class Access {
    /*
    접근 제어자 - (클래스), 메서드, 필드 모두 동일하게 적용
    데이터 보호: 주소로 직접참조(.)하는걸 막기 위함
    -> 메서드로 접근하도록 강제

    종류
    1. public
    - 어디서든 접근(.) 가능
    2. protected
    - 같은패키지 && 상속관계 일때만 접근(.) 가능
    3. default
    - 같은패키지 일때만 접근(.) 가능
    4. private
    - 클래스 내부가 아니면 접근(.) 불가능
    - (st1.name (x)) -> 메서드로 접근하게 강제 가능
    */

    // 대부분의 경우에 필드는 private로 선언되어야 함
    private String data;

    public Access(String data) {
        this.data = data;
    }

    // 메서드를 통해 가져올 수 있어야하고, 변경될 수 있어야한다.

    // getter - get필드명 : private 필드 가져옴
    public String getData() {
        return this.data;
    }

    // setter - set필드명 : private 필드 상태(값) 변경
    public void setData(String outerData) {
        // 검증하는 코드가 작성되어야함
        this.data = outerData;
    }



}
