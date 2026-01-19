package com.study._30_Generic.animal;

// 상한 경계 설정
public class AnimalHospital<T extends Animal> {

    private T animal;

    // 필드에 있는 animal은 T로는 업캐스팅되어 Object가 되기 떄문에
    // sound 매서드가 없음
    public void makeSound() {
        animal.sound();
    }
}
