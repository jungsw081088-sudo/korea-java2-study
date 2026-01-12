package com.study._19_Static;

public class StaticData {
    private int id;
    public int count;

    public static int staticCount;

    public StaticData(int id) {
        this.id = id;
        staticCount++; // 생성자 호출시 +1
        this.count++; // 생성자 호출시 +1
    }
}
