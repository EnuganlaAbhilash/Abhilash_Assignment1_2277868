package com.assignment.abhi;

import java.util.*;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        
        int number = r.nextInt(50);
        int g;

        System.out.println("Guessing Game!");
        System.out.println("I have chosen a number between 1 to 50 " +" Guess what it is:");

        do {
            g = sc.nextInt();

            if (g < number) {
                System.out.println("low! Try again:");
            } else if (g > number) {
                System.out.println("high! Try again:");
            } else {
                System.out.println("Congratulations! it right.");
            }
        } while (g != number);
    }
}

