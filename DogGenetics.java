/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.BasicProgrammingConcepts;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author andri
 */
public class DogGenetics {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        // Initialized String array named dogs
        String[] dogs = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
        int totalPercent = 100;
        
        // Requested and stored dog's name
        System.out.print("What is your dog's name? ");
        String name = scan.nextLine();
        
        System.out.println("\nWell then, I have this highly reliable report on " + name + " prestigious background right here.\n");
        
        System.out.println(name + " is: \n");
        
        /* Used a for loop to iterate through the dog breeds in the array while randomizing what percent
            of the dog breed should be given to the user's dog. With each iteration I subtracted the 
            percent added from the total percent and only iterated up to the second to last index.
            For the last index I created a println seperate and used the remaining total percent so that
            it could all add up to 100.
        */
        for(int i = 0; i < dogs.length-1 ; i++) {
             int percent = rand.nextInt(totalPercent) + 1;
             totalPercent -= percent;
             System.out.println(percent + "% " + dogs[i]);
             // An if with a break statement has been added if total percent reaches 0 so program will not crash
             if(totalPercent==0){
                 break;
             }
        }
        System.out.println(totalPercent + "% " + dogs[dogs.length-1]);
        
        System.out.println("\nWow, that's QUITE the dog!");
    }
}
