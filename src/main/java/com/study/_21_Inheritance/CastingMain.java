package com.study._21_Inheritance;

public class CastingMain {
    public static void main(String[] args) {
        // 캐스팅 - 타입을 변경하는 것
        // 상속관계에서의 캐스팅
        // 1. 업캐스팅: 자식클래스 객체 -> 부모클래스 타입으로 변경
        // 2. 다운캐스팅: 부모클래스 객체 -> 자식클래스 타입으로 변경


        // 컴파일러와 JVM을 구분해서 생각하여야 한다.
        // 객체 초기화에서 or "=" 기준으로
        // 좌변은 컴파일러 영역, 우변은 JVM이 인식하는 영역
        // 컴파일러는 변수타입만 고려해서 코드를 확인
        // JVM 실제 메모리에 올라간것만 고려해서 작동

        ElectricCar eCar1 = new ElectricCar();
        eCar1.charge(); // 전기차만 가지고 있는 메서드
        Car car1 = (Car) eCar1; // 업캐스팅 (자식객체 -> 부모타입)
        // car1.charge(); 업캐스팅 되어서, ECar의 메서드는 더이상 호출할 수 없음

        Car car2 = new GasCar(); // 생성은 자식객체, 타입은 부모객체 - 업캐스팅
        // 컴파일러는 변수타입만 고려했기 때문에
        // 아래의 코드를 허용한다. 하지만, JVM이 해당 코드를 실행할때 에러가 발생
        // ElectricCar eCar2 = (ElectricCar) car2;
        // eCar2.charge();

        // instanceof 연산자
        // car2는 ElectricCar의 인스턴스 입니까?
        // instanceof 기준으로 왼쪽객체가 오른쪽 타입정보를 가지고 있는가?
        System.out.println(car2 instanceof ElectricCar);
        System.out.println(car2 instanceof GasCar);
        System.out.println(car2 instanceof Car); // this는 super를 포함한다.

        // 안전한 다운캐스팅
        // 조건문 + instanceof 연산자를 통해 런타임오류를 피할 수 있다.
        if (car2 instanceof ElectricCar) {
            ElectricCar eCar3 = (ElectricCar) car2;
            eCar3.charge();
        } else if (car2 instanceof GasCar) {
            GasCar gCar2 = (GasCar) car2;
            // 안전하게 다운캐스팅 가능하다.
        }

    }
}
