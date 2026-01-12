package com.study._15_Class;

public class Phone {
    int battery;
    boolean isPowerOn;
    /*
    turnOn: 전원켜기(배터리가 10%이상일때만) isPowerOn true로
    turnOff: 전원끄기 - isPowerOn false로
    charge: 충전하기(20% 충전, 최대 100%)
    playYoutube: 전원이 켜져있고, 배터리가 5%이상일때만, 실행시 5%소모
    */
    // 전원 켜기
    void turnOn() {
        if(battery < 10) {
            System.out.println("배터리가 부족합니다!");
            return;
        }

        isPowerOn = true;
        System.out.println("핸드폰 전원을 켭니다!");
    }
    void turnOff() {
        // 이미 false인 경우
        if(!isPowerOn) {
            System.out.println("이미 전원이 꺼져있습니다.");
            return;
        }

        // 추가로직

        isPowerOn = false;
        System.out.println("전원을 끕니다!");
    }
    void charge() {
        battery += 20;
        if (battery > 100) {
            System.out.println("완충되었습니다.");
            battery = 100;
        } else {
            System.out.println("배터리를 충전했습니다.");
        }
    }
    void playYoutube() {

        if(!isPowerOn) {
            System.out.println("전원을 먼저 켜주세요");
            return;
        }

        if(battery < 5) {
            System.out.println("배터리가 부족합니다. 충전필요");
            return;
        }

        battery -= 5;
        System.out.println("유투브 시청!");
    }

}
