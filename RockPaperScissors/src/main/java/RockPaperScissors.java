/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author powel
 */
public class RockPaperScissors {

    static Scanner scrn = new Scanner(System.in);

    public static void main(String[] args) {
        boolean playAgain = true;
        String ans;
        while (playAgain) { //Calls the game method, then checks if it should play again
            RPS();
            while (true && playAgain) {
                System.out.println("Would you like to play again? Yes or No");
                ans = scrn.nextLine();
                if (ans.equals("")) { //Error checking for empty string
                    ans = scrn.nextLine();
                }
                if (ans.toUpperCase().equals("NO")) {
                    playAgain = false;
                } else if (ans.toUpperCase().equals("YES")) {
                    break;
                } else {
                    System.out.println("Invalid input, enter Yes or No");
                }
            }
        }
        System.out.println("Thanks for playing!");
        System.exit(0);
    }
    
    //Method that runs the game of Rock Paper Scissors
    public static void RPS() {
        Random rand = new Random();
        int comChoice = 0; //Randomly chosen computer choice
        int choice = 0;
        int numRounds = 0;
        int[] result = new int[3]; //index 0 = numTies, 1 = numWins, 2 = numLoss

        System.out.println("How many rounds would you like to play?");
        numRounds = scrn.nextInt();
        if (numRounds > 10 || numRounds < 1) { //Makes sure number of rounds is valid
            System.out.println("ERROR: " + numRounds + " is out of range; must be between 1 and 10");
            System.exit(0);
        }
        //Iterates for each round being played
        for (int i = 0; i < numRounds; i++) {
            
            do{ //Does not continue game until valid choice is made
                System.out.println("Would you like to pick:\n\t1.Rock\n\t2.Paper\n\t3.Scissors");
                choice = scrn.nextInt();
            }while(choice < 1 || choice > 3);
                    
            comChoice = rand.nextInt(3)+1;
            //If the user chose Rock
            if (choice == 1) {
                if (comChoice == 1) {
                    System.out.println("Tie!");
                    result[0]++;
                } else if (comChoice == 2) {
                    System.out.println("Computer Win!");
                    result[2]++;
                } else {
                    System.out.println("User Win!");
                    result[1]++;
                }
            } 
            //If the user chose Paper
            else if (choice == 2) { 
                if (comChoice == 1) {
                    System.out.println("User Win!");
                    result[1]++;
                } else if (comChoice == 2) {
                    System.out.println("Tie!");
                    result[0]++;
                } else {
                    System.out.println("Computer Win!");
                    result[2]++;
                }
            }
            //If the user chose Scissors
            else {
                if (comChoice == 1) {
                    System.out.println("Computer Win!");
                    result[2]++;
                } else if (comChoice == 2) {
                    System.out.println("User Win!");
                    result[1]++;
                } else {
                    System.out.println("Tie!");
                    result[0]++;
                }
            }
        }
        //Prints out results
        System.out.println("Number of Ties: " + result[0]);
        System.out.println("Number of User wins: " + result[1]);
        System.out.println("Number of Computer wins: " + result[2]);
        //Determines winner
        if (result[1] > result[2]) {
            System.out.println("User wins!");
        } else if (result[1] < result[2]) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
