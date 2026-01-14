package com.study._25_Singleton;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();
        System.out.println(config1 == config2); // true

        // 설정값(객체 상태)를 공유한다.
        System.out.println(config1);
        System.out.println(config2);

        config1.setAppMode("PRODUCTION_MODE");

        System.out.println(config1);
        System.out.println(config2);

    }


}
