/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author powel
 */
public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int numRounds = 0;
        
        
        
        
        System.out.println("How many rounds would you like to play?");
        numRounds = scn.nextInt();
        if(numRounds > 10 || numRounds < 1){
            System.out.println("ERROR: " + numRounds + " is out of range; must be between 1 and 10");
            System.exit(0);
        }
             
    }
}
