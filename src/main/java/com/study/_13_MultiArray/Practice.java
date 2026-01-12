package com.study._13_MultiArray;

public class Practice {
    public static void main(String[] args) {
        String[] department = {"인사부", "행정부", "사업부"};
        String[][] employees = {
                {"김길동", "고길동", "박길동"},
                {"김영희", "고영희", "박영희"},
                {"김철수", "고철수", "박철수"}
        };

        // "사업부"이면서, "김길동"인 사람이 있는지 확인할 수 있는 코드
        boolean found = false; // 사업부이면서 김길동인 사람이 있으면 true
        int deptIndex = -1; // 사업부가 있는지 확인하는 변수

        // 사업부가 있는 부서인가?
        // 있으면 deptIndex 업데이트를 해야함
        for(int i = 0; i < department.length; i++) {
            String deptName = department[i];
            if(deptName.equals("사업부")) {
                deptIndex = i;
                break;
            }
        }

        // 사업부가 없다
        if(deptIndex == -1) {
            System.out.println("사업부는 없습니다.");
            return; // main메서드 즉시종료
        }

        // 여기가 실행된다는건 사업부를 찾았다는 뜻
        String[] busiDept = employees[deptIndex];
        for(String name: busiDept) {
            if (name.equals("김길동")) {
                found = true;
                break;
            }
        }

        // 김길동을 찾았으면 found에는 true
        if (found) {
            System.out.println("사업부에 김길동이 있습니다.");
        } else {
            System.out.println("사업부에 김길동이란 사람은 없습니다.");
        }

        // 다중배열
        String[] busanNames = {"부산1", "부산2", "부산3"};
        String[] ulsanNames = {"울산1", "울산2", "울산3"};
        String[] daeguNames = {"대구1", "대구2", "대구3"};

        // names[0][2] -> busanNames[2] -> "부산3"
        String[][] names = {busanNames, ulsanNames, daeguNames};
        System.out.println(names[0][2]); // 부산3



    }
}
