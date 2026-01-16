package com.study._25_Singleton;

public class AppConfig {
    private String apiKey;
    private String appMode;
    private static AppConfig instance;

    // 생성자 - private
    private AppConfig() {
        this.apiKey = "MY_API_KEY";
        this.appMode = "DEV_MODE";
    }

    // 나머지 코드를 작성하셔서 AppConfig에 싱글톤패턴을 적용해주세요
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public void setAppMode(String appMode) {
        this.appMode = appMode;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "apiKey='" + apiKey + '\'' +
                ", appMode='" + appMode + '\'' +
                '}';
    }
}
