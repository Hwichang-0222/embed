package java_Practice_03;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> books;
	
	public Library() {
		books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book is added : " + book.getTitle());
	}
	
	public boolean removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Book is removed : " + book.getTitle());
                return true;
            }
        }
        System.out.println("Cannot find that ISBN");
        return false;
    }
	
	public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // 📋 모든 책 출력
    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No book");
        } else {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
    }
	
}
