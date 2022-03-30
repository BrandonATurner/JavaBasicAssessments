/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.BasicProgrammingConcepts;

import java.util.Scanner; // imported Scanner
/**
 *
 * @author andri
 */
public class HealthyHearts {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Requested and stored user age
        System.out.print("What is our age? ");
        int age = scan.nextInt();
        
        int maxHeartRate = 220 - age; // Maximum heart rate is always 220 - user's age
        // Max zone is 85% of max, used Math.round to round the number up if it is over .5 and caste to an int to remove decimal.
        int maxZone = (int)Math.round(maxHeartRate * 0.85); 
        int minZone = maxHeartRate / 2; // Minimum zone is 50% of max so I divided by 2.
        
        // Print Statements
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + minZone + " - " + maxZone + " beats per minute");
    }
}
