package com.study._31_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> todoList = new ArrayList<>();

        // 1. 사용자로부터 투두 입력 몇개 할건지 count변수에 입력받기
        System.out.print("todo 몇개 입력하실건가요? >");
        int count = scanner.nextInt();
        scanner.nextLine(); // 엔터

        // 2. 반복문으로 count만큼 todo를 입력받자!
        for(int i = 0; i < count; i++) {
            System.out.print("할일 입력 >>");
            String todo = scanner.nextLine();
            todoList.add(todo); // 마지막 idx + 1 자리에 추가
        }
        // 3. for문 사용하여서 전체 출력
        for (String todo: todoList) {
            System.out.println("할일: " + todo);
        }
//        todoList.forEach((todo) -> {
//            System.out.println("할일: " + todo);
//        });
        // 4. 투두 검색어를 targetTodo 변수로 입력받기
        System.out.print("검색하실 할일 입력 >");
        String targetTodo = scanner.nextLine();

        // 5. 해당 targetTodo를 리스트에서 삭제!
        if(todoList.contains(targetTodo)) {
            todoList.remove(targetTodo);
            System.out.println("삭제 완료");
        } else {
            System.out.println("해당 데이터가 존재하지 않습니다.");
        }
    }
}
