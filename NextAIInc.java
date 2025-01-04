/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nextaiinc;

/**
 *
 * @TWINAMATSIKO PATRICK
 */
        
     import java.util.Scanner;

public class NextAIInc {

    // Method to calculate total weekly pay
    public static void calculatePay(String contractorName, double basePay, int hoursWorked) {
        // Check for base pay compliance
        if (basePay < 30000) {
            System.out.println("Error: Base pay must not be below UGX 30,000/hour  " +  ".");
            return;
        }

        // Check for maximum hours worked worked for
        //Remember, Normal is <=48 while any exta up to 72hrs is paid twice base pay
        if (hoursWorked > 72) {
            System.out.println("Error: Hours worked must not exceed 72 hours  " +  ".");
            return;
        }

        // Calculate regular and overtime pay
        double totalPay;
        if (hoursWorked <= 48) {
            totalPay = basePay * hoursWorked;
        } else {
            int overtimeHours = hoursWorked - 48;
            totalPay = (basePay * 48) + (overtimeHours * basePay * 2);
        }

        // Print the total pay
        System.out.println("Total weekly pay for contractor " + contractorName + ": UGX " + totalPay);
    }

    // Main method to test the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the contractor's name:");
        String contractorName = scanner.nextLine();

        System.out.println("Enter the base pay (UGX/hour):");
        double basePay = scanner.nextDouble();

        System.out.println("Enter the total hours worked:");
        int hoursWorked = scanner.nextInt();

        calculatePay(contractorName, basePay, hoursWorked);

        
    }
}

        
        
        
    
