package com.study._18_OOP;

// DB와 연결 역할
public class BookRepository {
    // DB에서 데이터를 불러왔다라고 생각
    private Book[] books; // book들을 저장할 배열(DB대용)

    // 생성할때 배열을 주입 new BookRepository(배열)
    public BookRepository(Book[] books) {
        this.books = books;
    }

    // 아래의 메서드들은 나중에 DB가 하는 내용들
    // sql쿼리(DB 언어)로 작성되어야 되는 것들

    // 비어있는 배열의 index를 찾아 준다
    int getEmptyIndex() {
        // null
        // 참조자료형이 초기화가 안될경우 -> 저장된 주소x
        // 저장된 주소가 없다는걸 표현한 값 null
        for (int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                return i;
            }
        }
        return -1; // 못찾으면 음수 리턴
    }

    // book을 배열에 저장하는 메서드
    void insert(Book book) {
        int emptyIndex = getEmptyIndex();
        if(emptyIndex < 0) {
            System.out.println("현재 저장공간이 없습니다.");
            return;
        }

        books[emptyIndex] = book;
        System.out.println("저장완료!");
    }

    // read
    Book[] getBookDatas() {
        int count = 0; // null이 아닌 book갯수 카운트
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null) {
                count++;
            }
        }

        // null아닌 book의 갯수만큼 새로 만든 배열
        Book[] newBooks = new Book[count];

        // 아래의 for문 i는 books의 데이터만큼(null or book)
        // 1씩 증가한다.
        // newBooks는 book이 있을때만 1씩 증가하는 변수가필요
        int j = 0; // 복사할때마다 1씩 증가
        for(int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                newBooks[j] = books[i];
                j++;
            }
        }
        return newBooks;
    }

}
