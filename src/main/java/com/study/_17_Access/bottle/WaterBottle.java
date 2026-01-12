package com.study._17_Access.bottle;

public class WaterBottle {
    private int currentWater; // 현재 물의 양
    /*
    클래스를 요구사항에 맞게 완성해주세요
    - fill(int amount)
    amount가 음수x
    총량(1000ml) 넘을 수 없다.
    유효하면 "물을 채웠습니다" 출력
    - drink(int amount)
    amount가 음수x
    현재 물의 양보다 더 많은 양을 마실 수 없음
    유효하면 "물을 마셨습니다" 출력
    - getCurrentWater() -> "현재 물의양: ~ml" 출력
    */

    // 생성자를 통한 값 검증
    public WaterBottle(int currentWater) {
        if (currentWater < 0) {
            System.out.println("물은 음수 x");
            return; // 예외를 던져야함
        }

        if (currentWater > 1000) {
            System.out.println("물병의 최대용량은 1000");
            return; // 예외를 던져야함
        }

        this.currentWater = currentWater;

    }


    public int getCurrentWater() {
        System.out.println("현재 물의 양: " + currentWater + "ml");
        return currentWater;
    }

    public void fill(int amount) {
        if (amount < 0) {
            System.out.println("물의 양은 음수일 수 없습니다.");
            return;
        }
        // 현재물의양 + amount > 1000
        int result = this.currentWater + amount;
        if (result > 1000) {
            System.out.println("물병의 최대용량은 1000ml입니다. 초과 할 수 없습니다.");
            return;
        }

        this.currentWater += amount;
        System.out.println("물을 채웠습니다.");
    }

    public void drink(int amount) {
        if (amount < 0) {
            System.out.println("물의 양은 음수일 수 없습니다.");
            return;
        }

        if (amount > this.currentWater) {
            System.out.println("현재 물의양보다 더 많이 마실 수 없습니다.");
            return;
        }

        currentWater -= amount;
        System.out.println("물을 마셨습니다.");
    }
}
