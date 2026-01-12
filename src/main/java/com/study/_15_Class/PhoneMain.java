package com.study._15_Class;

public class PhoneMain {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        // 필드데이터에 직접 접근 중
        myPhone.battery = 50;
        myPhone.isPowerOn = false;

        // 필드데이터에 메서드로 간접 접근
        // 캡슐화 - 내부구현은 호출하는 쪽에서 알 수 없음
        // 검증로직 알수없음 다만, 안전하다.
        myPhone.playYoutube(); // 배터리소모 x -> 전원이 안켜져서
        myPhone.turnOn();
        myPhone.playYoutube();
        myPhone.charge();
        myPhone.turnOff();

    }
}
