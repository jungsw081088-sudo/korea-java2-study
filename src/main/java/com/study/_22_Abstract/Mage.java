package com.study._22_Abstract;

public class Mage extends Character{
    public Mage(String name) {
        super(name, 80, 30);
    }
    @Override
    public void attack(Character target) {
        String targetName = target.getName();
        System.out.println(this.name + "이" + targetName + "에게 폭풍쇄도로 공격합니다.");
        target.receiveDamage(attackDamage);
        System.out.println(targetName + "이" + attackDamage + "의 데미지를 받았습니다.");
    }
}
