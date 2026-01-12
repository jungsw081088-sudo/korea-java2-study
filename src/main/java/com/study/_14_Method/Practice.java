package com.study._14_Method;

public class Practice {
    // 1. 숫자를 매개변수로 전달받아서, 짝수인지 아닌지 판단하는 메서드
    // 짝수면 true, 홀수면 false를 리턴
    public static boolean isEven(int num) {
        boolean result = num % 2 == 0; // 짝수면 true
        return result;
        // 리턴을 실행하면
        // 1. 메서드 즉시종료 -> 호출한 곳으로 리턴값(stack) 복사해서 전달
        // 2. 메모리 정리됨(stack 정리)
    }

    // 2. 숫자가 담긴 배열, 숫자 두가지를 매개변수로 전달 받아서
    // 숫자가 배열에 존재하는 숫자인지 확인하는 메서드
    public static boolean containsNum(int[] nums, int num) {
        // num이 nums에 있는 숫자인지?
        for (int number : nums) {
            if(number == num) {
                return true; // 찾으면 즉시 메서드 종료
            }
        }
        return false; // 못찾으면 실행됨
    }

    // 리턴하는 데이터의 자료형? 총인건비 -> int
    // 매개변수로 들어오는 데이터의 자료형? int[][]
    // [[30, 10000],..[]]
    public static int calcLaborPay(int[][] workRecords) {
        int totalWages = 0; // 총인건비

        // int[][]에서 하나씩 꺼내면 int[]자료형 데이터
        for (int[] record : workRecords) {
            int hours = record[0]; // 근무시간
            int wage = record[1]; // 시급
            int pay = hours * wage; // 주급

            totalWages += pay; // 주급을 전체인건비에 누적합
        }

        return totalWages;
    }

    public static void main(String[] args) {
        int myNum = 7;
        System.out.println(isEven(myNum));

        int[] myNums = {1, 3, 7, 9};
        System.out.println(containsNum(myNums, 7));

        // workRecords를 매개변수로 전달받아서,
        // 총 인건비를 리턴하는 함수 - calcLaborPay
        int[][] workRecords = {
                // {근무시간, 시급}
                {40, 10000}, 
                {35, 12000},
                {20, 11000},
                {45, 20000},
        };

        int totalPay = calcLaborPay(workRecords);
        System.out.println("총인건비: " + totalPay);
    }
}
