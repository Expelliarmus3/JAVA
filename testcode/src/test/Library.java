package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList <String> availableBooks = new ArrayList<>();
    private ArrayList <String> issuedBooks = new ArrayList<>();
    Scanner n = new Scanner(System.in);

    public void addBooks(int num){
        for (int i = 0; i <num ; i++) {
            System.out.println("Enter book");
            String books = n.next();
            int p =0;
            availableBooks.add(p,books);
            p++;
        }
    }


    public void issueBooks(){
        System.out.println("Enter book you want to issue:");
        String book = n.next();
        for (int j = 0; j < availableBooks.size() ; j++) {
            if(availableBooks.get(j).equals(book)){
                System.out.println("Your book is available!");
                availableBooks.remove(book);
                issuedBooks.add(book);
            }
        }
    }


    public void returnBook(){
        System.out.println("Enter book you want to return:");
        String book=n.next();
        issuedBooks.remove(book);
        availableBooks.add(book);
        System.out.println("Book returned...Thank You!");

    }


    public void showAvailableBooks(){
        for (String availableBook : availableBooks) {
            System.out.print(availableBook + "\t");
        }
    }
}
