package java_Practice_03;

import java.util.Scanner;

public class LibraryRunEx {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n📚 도서관 관리 시스템 메뉴:");
            System.out.println("1. 책 추가");
            System.out.println("2. 책 검색");
            System.out.println("3. 책 제거");
            System.out.println("4. 전체 책 목록 보기");
            System.out.println("5. 종료");
            System.out.print("메뉴 번호를 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    System.out.print("제목 입력: ");
                    String title = scanner.nextLine();
                    System.out.print("저자 입력: ");
                    String author = scanner.nextLine();
                    System.out.print("ISBN 입력: ");
                    String isbn = scanner.nextLine();
                    Book newBook = new Book(title, author, isbn);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.print("검색할 책 제목 입력: ");
                    String searchTitle = scanner.nextLine();
                    Book found = library.findBookByTitle(searchTitle);
                    if (found != null) {
                        System.out.println("🔎 검색 결과: " + found);
                    } else {
                        System.out.println("책을 찾을 수 없습니다.");
                    }
                    break;

                case 3:
                    System.out.print("제거할 책 ISBN 입력: ");
                    String removeIsbn = scanner.nextLine();
                    library.removeBook(removeIsbn);
                    break;

                case 4:
                    System.out.println("📗 전체 책 목록:");
                    library.listAllBooks();
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }

        scanner.close();
    }
}
