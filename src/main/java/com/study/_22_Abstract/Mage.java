package com.study._22_Abstract;

public class Mage extends Character {
    public Mage(String name) {
        super(name, 80, 120);
    }

    @Override
    public void attack(Character target) {
        String targetName = target.getName();
        System.out.println(name + "가" + targetName +"에게 매직미사일을 날립니다.");
        target.receiveDamage(attackDamage);
        System.out.println(targetName + "가" + attackDamage + "의 데미지를 받았습니다.");
    }
}
