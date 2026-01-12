package com.study._19_Static.ticket;

public class Main {
    /*
        main함수의 역할: 실행(JVM이)

        public: 외부에서 접근해야함 - JVM
        static: 객체생성없이 실행가능해야하니까
        void: 프로그램 시작만 담당(리턴x)
        참고) String[] args -> args라는 매개변수로
        외부로부터 문자열 배열을 받아 올 수 있음
    */
    public static void main(String[] args) {
        NumberTicket ticket1 = new NumberTicket(); // num필드가 1
        NumberTicket ticket2 = new NumberTicket(); // num필드가 2
        NumberTicket ticket3 = new NumberTicket(); // num필드가 3

        System.out.println(ticket1.getNum());
        System.out.println(ticket2.getNum());
        System.out.println(ticket3.getNum());

        // 객체로 static 변수를 참조하는게 가능한 이유
        // JVM이 알아서 해당 객체의 클래스를 참조해서 찾아감
        System.out.println(NumberTicket.nextNum);

        // 참고
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
