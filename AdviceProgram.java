package com.assignment.abhi;

import java.util.*;
import java.util.Scanner;

public class AdviceProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] List = {
            "ALL Every one Follow your mind.",
            "Stay focused on your goals and commitments",
            "Trust your self."
        };

        String q;
        String r;

        do {
            System.out.print("a question (or type 'quit'): ");
            q = sc.nextLine();

            if (!q.equalsIgnoreCase("quit")) {
                int randomIndex = random.nextInt(List.length);
                r = List[randomIndex];
                System.out.println("Advice: " + r);
            }
        } while (!q.equalsIgnoreCase("quit"));
    }
}
