/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.BasicProgrammingConcepts;

/**
 *
 * @author andri
 */
public class SummativeSums {
    
    public static void main(String[] args) {
        
        // Created 3 int arrays
        int[] numbers1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] numbers2 = { 999, -60, -77, 14, 160, 301 };
        int[] numbers3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
                            140, 150, 160, 170, 180, 190, 200, -99 };
        
        // Print statesments while running the arraySum method on each array.
        System.out.println("#1 Array Sum: " + arraySum(numbers1));
        System.out.println("#2 Array Sum: " + arraySum(numbers2));
        System.out.println("#3 Array Sum: " + arraySum(numbers3));
    }
    
    // Created an arraySum method that takes in a integer array as it parameter.
    public static int arraySum(int[] numbers){
        
        int arraySum = 0; // Initialized integer variable arraySum to 0
        
        // Ran a foreach loop on the array parameter and added the number stored at each index to the arraySum
        for(int num : numbers) {
            arraySum += num;
        }
        // Returned arraySum
        return arraySum;
    }
}
