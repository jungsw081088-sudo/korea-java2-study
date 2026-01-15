package com.study._22_Abstract;

public class Warrior extends Character {
    public Warrior(String name) {
        // 추상클래스는 직접 객체를 만들수 없기 때문에
        // 자식클래스에서 super()호출을 통해 초기화해줘야한다.
        super(name, 120, 25);
    }

    @Override
    public void attack(Character target) {
        String targetName = target.getName();
        System.out.println(this.name + "이" + targetName + "에게 몽둥이로 공격합니다.");
        target.receiveDamage(attackDamage);
        System.out.println(targetName + "이" + attackDamage + "의 데미지를 받았습니다.");
    }
}
