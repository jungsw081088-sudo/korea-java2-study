package com.study._17_Access;

public class Test {
    private int a;
    private int b;


    // 필드가 선언되면 작성되어야하는 코드들이 존재
    // -> 보일러 플레이트 코드
    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        //
        this.a = a;
    }

    public void setB(int b) {
        //
        this.b = b;
    }
}
