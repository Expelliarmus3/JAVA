package test;

import java.util.Objects;
import java.util.Scanner;

public class OnlineLib {
    String[] availableBooks = new String[10];
    int n= availableBooks.length;
    public void addBooks(int n){
        for (int i = 0; i <n ; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter books to enter: ");
            availableBooks[i]=input.next();
        }
    }

    public void showAvailableBooks(){
        for(String book : availableBooks){
            System.out.print(book+"\t");
        }
        System.out.println();
    }

    public void issueBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter book to issue: ");
        String book= input.next();
        for (int i = 0; i <n ; i++) {
            if(Objects.equals(availableBooks[i], book)){
                System.out.println("Issue success...");
            }
        }
        for (int i = 0; i <n ; i++) {
            if(Objects.equals(availableBooks[i], book)){
                availableBooks[i]=availableBooks[i+1];
            }
            availableBooks[i+1]=availableBooks[i+2];
            n--;
        }
        //System.out.println("Not available");
    }
    public void returnBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter book to issue: ");
        String book= input.next();
        n++;
        availableBooks[n]=book;

    }

    public static void main(String[] args) {
        OnlineLib lib = new OnlineLib();
        //System.out.println("Enter number of books to add");
        lib.addBooks(10);
        lib.showAvailableBooks();
        lib.issueBook();
        lib.showAvailableBooks();
    }
}
