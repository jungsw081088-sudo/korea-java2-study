package com.study._23_interface;

// 의존성 / 결합도
// dog 클래스는 AnimalManager를 의존하는가? no
// dog -> Animal 의존중
// AnimalManager -> Animal 의존중
// 의존성 방향 : [Dog] -> [Animal] <- [AnimalManager]
// -> 구체적인 크랠스끼리 의존하는게 아니라, 인터페이스를 통해 작동
// -> 결합도가 낮은 구조(변경과 추가에 유연하고 안정적이다.)

// SOLID에서 D
// DIP - 의존성역전의 원칙

// makeSound는 Animal 인터페이스를 의존
// 추상체(인터페이스, 추상클래스)를 의존하는 것과
// 구현체(구체적인 클래스)를 의존하는 것은 다르다
public class AnimalManager {
    public void makeSound(Animal animal) {
        animal.sound();
    }

    public void makeSwim(Swimmable swimmable) {
        swimmable.swim();
    }

    public void makeFly(Flyable flyable) {
        flyable.fly();
    }
}
