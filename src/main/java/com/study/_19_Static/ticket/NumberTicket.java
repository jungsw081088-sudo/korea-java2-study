package com.study._19_Static.ticket;

public class NumberTicket {
    /*
        생성될때 마다 NumberTicket의 객체는
        num 필드가 1씩 증가하면서 생성된다.
        ex) 처음 생성한 NumberTicket의 num은 1
        ex) 두번째 생성한 NumberTicket의 num은 2
        // ... new만 호출하더라도 자동 증가하도록
        NumberTicket클래스를 정의해주세요
    */

    // 모든 객체가 공유하는 static 변수
    // 클래스가 저장하는 데이터
    public static int nextNum = 1;

    // 인스턴스 필드
    private int num;

    public NumberTicket() {
        this.num = nextNum++;
        System.out.println("번호표 발급! 번호: " + this.num);
    }

    public int getNum() {
        return num;
    }
}
