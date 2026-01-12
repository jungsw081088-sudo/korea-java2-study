package com.study._18_OOP;

// repository와 소통
// 서비스의 역할: 비즈니스로직 담당(구체적으로 무엇을하는가?)
public class BookService {
    private BookRepository bookRepository;

    // 의존성
    // 서로 다른객체가 필드에 존재하거나, 매개변수로 존재하면
    // 의존성이 생김
    // BookService는 BookRepository 객체에 의존하고 있다.
    // 의존성 주입(생성자 or setter를 통해 필드에 데이터를 주입)
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // book을 추가
    void append(Book book) {
        // new로 생성되었을떄 부터 bookRepo가 존재할 수 있음
        bookRepository.insert(book);
    }

    boolean isEmpty() {
        int emptyIdx = bookRepository.getEmptyIndex();
        if (emptyIdx >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // 등록된 도서를 콘솔로 출력
    void printRegisteredBooks() {
        Book[] books = bookRepository.getBookDatas();

        // repo에 있는 books가 전체 null인 경우
        if(books.length == 0) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            String title = book.getTitle();
            String author = book.getAuthor();
            System.out.println(author + ": " + title);
        }
    }



}
