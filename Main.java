/*
Mini Project 1
Group 3: Seth Adleta, Kyle Troyer, Luke Greely, Peter Winter
Date: February 17th 2021
*/

import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any whole positive number: ");
    int userNum = s.nextInt();

    Random r = new Random();
    int randomNum = r.nextInt(userNum);
    System.out.println("A random number to guess has been generated");

    playGame(randomNum, userNum);

  }
  static void playGame(int theRandomNum, int theUserNum) {
    System.out.println("Please guess a number between 0 and " + theUserNum);

    Scanner sc = new Scanner(System.in);

    int userGuess = sc.nextInt();
    int numTries = 1;

    while (userGuess != theRandomNum) {
      if (userGuess > theRandomNum) {
        System.out.println("Guess Lower!");
      }
      else if (userGuess < theRandomNum) {
        System.out.println("Guess Higher!");
      }
      System.out.println("Enter new guess:");
      userGuess = sc.nextInt();
      numTries++;
    }
    if (numTries > 1) {
      System.out.println("You win! It took you " + numTries + " tries.");
      }
      else {
        System.out.println("Congrats, you win! It only took you " + numTries + " try!");
      }
  }
}