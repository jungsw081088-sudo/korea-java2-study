package com.study._18_OOP;

import java.util.Scanner;

// 스캐너로 데이터 입력 -> main데이터 조립 -> 서비스 -> 레파지토리
// 서비스: 세부로직작성(비즈니스로직)
// 레파지토리: DB 접근
public class BookMain {
    // 서버를 모방
    // main의 역할 -> 브라우저(사용자화면출력) 겸 컨트롤러(프로그램 흐름만 제어)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[5];
        // 오로지 생성자를 통해서만 필드에 데이터를 넣을 수 있음
        // 함부로 참조해서 데이터를 변질시킬 수 없음(문법적 강제)
        BookRepository bookRepository = new BookRepository(books);
        // bookRepository.books = books; 불가능
        BookService bookService = new BookService(bookRepository);

        while(true) {
            System.out.println("--도서 관리 시스템--");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴 선택(1,2,q) >");
            String selectedMenu = scanner.nextLine();

            if ("1".equals(selectedMenu)) {
                boolean isEmpty = bookService.isEmpty();
                if(!isEmpty) {
                    System.out.println("등록불가: 공간없음");
                    continue;
                }

                System.out.print("도서 제목 >");
                String title = scanner.nextLine();
                System.out.print("도서 저자 >");
                String author = scanner.nextLine();

                // 데이터들을 객체로 포장
                Book newBook = new Book(title, author);
                bookService.append(newBook);
            } else if ("2".equals(selectedMenu)) {
                bookService.printRegisteredBooks();
            } else if ("q".equals(selectedMenu)) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else { // 나머지 입력처리
                System.out.println("잘못 입력하셨습니다.");
            }
        }

    }
}
