package com.study._23_interface;

public class Main {
    public static void main(String[] args) {
        /*
            상속의 한계
            1. 자식클래스로 갈수록, heap 영역이 방대해진다.
            2. 다중삭속이 불가능, 하나의 클래스는 하나의 부모클래스만 가진다.
            상속은 is - a 관계, Mage is a Character

            인터페이스
            can - do 관계 dog can Swim
            1. 필드확장이 아니라, 오로지 기능 조립, 조합
            2. 다중이식이 가능!
        */

        // 인터페이스도 타입
        Animal dog = new Dog(); // (사이드) 캐스팅

        Animal duck = new Duck();

        Animal[] animals = {dog, duck};
        for (Animal animal : animals) {
            animal.sound();
            if (animal instanceof Flyable) {
                // 임시캐스팅
                ((Flyable) animal).fly();
            }
            if(animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
        }

        AnimalManager manager = new AnimalManager();

        manager.makeSound(dog);
        manager.makeSound(duck);


    }
}
