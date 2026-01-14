package com.study._25_Singleton;

public class AppConfig {
    private String apikey;
    private String appMode;

    private static AppConfig instance;

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig(); // private라도, 내부호출이니 상관x
        }
        return instance;
    }
    // 생성자 - private
    private AppConfig() {
        this.apikey = "MY_API_KEY";
        this.appMode = "DEV_MODE";
    }

    public String toString() {
        return "AppConfig{" +
                "apiKey='" + apikey + '\'' +
                ", appMode='" + appMode + '\'' +
                '}';
    }

    public void setAppMode(String appMode) {
        this.appMode = appMode;
    }
}
