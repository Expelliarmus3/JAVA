package test;

import java.util.Scanner;

public class Library2 {
    Scanner input = new Scanner(System.in);
    String[] book= new String[10];
    int j=0;
    public void issueBook(){

    }
    public void returnBook(){

    }
    public void addBook(int number_of_books){
        while (j<10) {
            for (int i = 0; i < number_of_books; i++) {
                System.out.println("Enter book: ");
                String book = input.next();
            }
            j++;
        }
    }
    public void showAvailableBooks(){

    }
}
