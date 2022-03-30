/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.BasicProgrammingConcepts;

// imported Scanner and Random
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author andri
 */
public class RockPaperScissors {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); // initialize Scanner
        int choice; // Initialize choice
        
        // Created a do-while loop set to run until user inputs "yes" or "Yes"
        do {
            choice = 0; // Reset choice to 0 at beginning of everyloop so a yes will not turn it into a endless loop.
            
            System.out.print("Please enter how many rounds you would like to play between 1 - 10: ");
            int rounds = scan.nextInt();
            if(rounds < 1 || rounds > 10) {   // If user enter anything out of range the program will print Error and end.
                System.out.println("Error: You have entered a number out of Range. Goodbye.");
                break;
            }
            
            game(scan, rounds); // Called my game method and passed the scanner and rounds variable as parameters.

            System.out.print("\nWould you like to play again? "); // Asked player if they want to continue anything except Yes exits. the game.
            String userChoice = scan.next();
            
            // If answer is yes the while loop keeps going, if anything else get a response of thanks.
           if(userChoice.equals("Yes")|| userChoice.equals("yes")){
             choice = 1;
            } else {
               System.out.println("Thanks for playing!");
           }
        } while(choice==1);    
    }
    
    // Created a method that gets called in main.
    public static void game(Scanner scan, int rounds) {
        
        // initialize Random
        Random rand = new Random();
        
        // Created variables and set to 0
        int tie = 0;
        int comWin = 0;
        int userWin = 0;
        
        // Ran a for loop to iterate through the rounds and request a user choice each round.
        for(int i = 1 ; i <= rounds ; i++) {
            System.out.print("Please make a choice, enter: 1 for Rock, 2 for Paper, 3 for Scissors: ");
            int userChoice = scan.nextInt();
            int comChoice = rand.nextInt(3)+1; // Used rand to randomize a choice of 1-3 for computer and stored in a comChoice variable.
            // use an if-else if-else structure to add to tie, userwin, and comwin variables.
            if(userChoice==comChoice) {
                tie++;
            }
            else if(userChoice==1 && comChoice==3) {
                userWin++;
            }
            else if(userChoice > comChoice) {
                userWin++;
            }
            else {
                comWin++;
            }   
        }
        
        // use print statements to output the ties and wins of each.
        System.out.println("\nTies: " + tie);
        System.out.println("User Wins: " + userWin);
        System.out.println("Computer Wins: " + comWin);
        
        // use and if-else if-else structure to determine and print the winner.
        if(comWin == userWin) {
            System.out.println("There is no winner, the results are a tie!");
        }
        else if (comWin > userWin) {
            System.out.println("The overall winner of most rounds is the Computer!");
        }
        else {
            System.out.println("The overall winner of most rounds is the User!");
        } 
    }
    
}
