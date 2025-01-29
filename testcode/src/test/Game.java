package test;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private boolean i=false;
    private int noOfGuesses;
    private int random;
    private int num;
    public Game(){
        Random n= new Random();
        this.random = n.nextInt(3);
        System.out.println("Welcome to Guess The number game!!!");
        System.out.println("Let's see how good your guess is");
        System.out.println("Press Y to continue");
        Scanner i = new Scanner(System.in);
        String input= i.next();
        if(input.equals("Y")){
            System.out.println("Grt to see you decided to play!! LET'S BEGIN...");
            takeUserInput();
            isCorrectNumber();
            System.out.println("Number of guesses you took is: "+getNoOfGuesses());
//            System.out.println("Wanna go another round?");
//            input=i.next();
//            if (input.equals("Y")){
//                Game();
//            }
        }
        else{
            System.out.println("See you next time!!");

        }
    }
    public void takeUserInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your input: ");
        this.num= s.nextInt();
    }
    public void isCorrectNumber(){
        while(i==false) {
            if (this.random > this.num) {
                System.out.println("Guess higher");
                this.noOfGuesses++;
                takeUserInput();
            } else if (this.random < this.num) {
                System.out.println("Guess lower");
                this.noOfGuesses++;
                takeUserInput();
            }
            else
                i=true;
        }

        System.out.println("Success "+this.random+" is same as your guess "+this.num);
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    public int getNoOfGuesses() {
        return (this.noOfGuesses+1);
    }
}
