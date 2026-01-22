package com.study._30_Generic.animal;

// 상한 경계 설정
// T extends A
// T 는 A타입이거나, A를 상속받은 타입이어야 한다.
// 최상위 부모 Object까지 업캐스팅 x
// A 타입 까지만 업캐스팅된다 (컴파일러가)
public class AnimalHospital<T extends Animal> {

    private T animal;

    // 필드에 있는 animal은 T로는 업캐스팅되어 Object가 되기때문에
    // sound 메서드가 없음.
    public void makeSound() {
        // 상한경계로 인해 Animal타입으로 업캐스팅되기 때문에
        // sound()메서드가 있다는걸 보장할 수 있다.
        animal.sound();
    }

    // getBiggerOne() 메서드 정의
    // 두개의 animal을 매개변수로 받아서,
    // size비교후 큰 동물을 리턴하는 메서드
    public T getBigger(T ani1, T ani2) {
        T bigger = ani1.getSize() > ani2.getSize() ? ani1 : ani2;
        return bigger;
    }
}
