/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobep.doggenetics;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author powel
 */
public class DogGenetics {
    static Scanner scrn = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        String name;
        System.out.println("What is your dog's name?");
        name = scrn.nextLine();
        System.out.println("Well then, I have this highly reliable report on "
                            + name + "'s prestigious background right here.\n\n"
                            + name + " is: \n");
        printOutput(generatePercents());
        
    }
    //Generates 5 random percents that sum up to 100
    public static int[] generatePercents()
    {   
        Random rand = new Random();
        int[] result = new int[5];
        int remainder = 100;
        
        for(int i = 0; i < 4; i++)
        {
            result[i] = rand.nextInt(remainder)+1;
            remainder-=result[i];
        }
        result[4] = remainder;
        
        return result;
    }
    //Print's the output of the dog's breed percentages
    public static void printOutput(int[] results)
    {
        String[] breeds = {"St. Bernard","Chihuahua","Dramatic RedNosed Asian Pug","Common Cur","King Doberman"};
        for(int i = 0; i < 5; i++)
            System.out.println(results[i] + "% " + breeds[i]);
        System.out.println("\nWow, that's QUITE the dog!");
    }
}
