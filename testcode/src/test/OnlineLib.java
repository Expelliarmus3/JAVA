package test;

import java.util.Objects;
import java.util.Scanner;

public class OnlineLib {
    int no_of_books;
    String[] availableBooks;
    OnlineLib(){
        this.no_of_books=0;
        this.availableBooks= new String[100];
    }
    public void addBooks(String book){
        availableBooks[no_of_books]= book;
        no_of_books++;
        System.out.println(book+" has been added!");
    }

    public void showAvailableBooks(){
        for(String book : this.availableBooks){
            if(book==null)
                continue;
            System.out.println("* "+book);
        }
    }

    public void issueBook(String book){
        for(int i =0;i<this.availableBooks.length;i++){
            if(availableBooks[i].equals(book)) {
                System.out.println("The book has been issued");
                this.availableBooks[i]=null;
                return;
            }
        }
        System.out.println("The book is unavailable...");
    }

    public void returnBook(String book){
        addBooks(book);
    }

    public static void main(String[] args) {
        OnlineLib lib = new OnlineLib();
        //System.out.println("Enter number of books to add");
        lib.addBooks("Harry Potter");
        lib.addBooks("DSA");
        lib.addBooks("JAVA");
        lib.addBooks("C");
        lib.showAvailableBooks();
        lib.issueBook("DSA");
        lib.showAvailableBooks();
        lib.returnBook("DSA");
        lib.showAvailableBooks();
    }
}
