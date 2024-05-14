package com.assignment.abhi;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the start number-- ");
        int start = sc.nextInt();
        System.out.print("Enter the end number-- ");
        int end = sc.nextInt();

        
        System.out.println("Numbers from " + start + " to " + end + "--");
        while (start <= end) {
            System.out.print(start + " ");
            start++;
        }
    }
}

