package com.study._23_Interface;

public class Main {
    public static void main(String[] args) {
        /*
            상속의 한계
            1. 자식클래스로 갈수록, heap영역이 방대해진다.
            2. 다중상속이 불가능. 하나의 클래스는 하나의 부모클래스만 가진다.
            상속은 is - a 관계. Mage is a Character

            인터페이스
            can - do 관계 Dog can Swim
            1. 필드확장이 아니라, 오로지 기능 조립/조합
            2. 다중이식이 가능!
        */

        // 인터페이스도 타입
        Animal dog = new Dog(); // (사이드) 캐스팅
        Animal duck = new Duck(); // (사이드) 캐스팅

        Animal[] animals = {dog, duck};
        for (Animal animal : animals) {
            animal.sound(); // 다형성 구현
            if (animal instanceof Flyable) {
                // 임시캐스팅: 캐스팅했다가 다시 원복
                ((Flyable) animal).fly();
            }
            if(animal instanceof Swimmable) {
                // 임시캐스팅
                ((Swimmable) animal).swim();
            }
        }

        AnimalManager manager = new AnimalManager();

        Dog dog2 = new Dog();
        Duck duck2 = new Duck();

        // 매개변수로 넘어갈때 Animal타입으로
        // 캐스팅되서 넘어간다고 생각해도 된다.
        manager.makeSound(dog2);
        manager.makeSound(duck2);

        manager.makeSwim(dog2);
        manager.makeSwim(duck2);

    }
}
