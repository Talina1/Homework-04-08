package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    static void task1() {

        // write your code here
        System.out.println();
        System.out.println("\u001B[33m" + "Welcome to the program!" + "\u001B[0m");
        System.out.println("\u001B[33m" + "Please enter a number:" + "\u001B[0m");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("List of odd numbers from 1 to " + number + ": ");

        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }
    static void task2() {

        System.out.println();
        System.out.println("\u001B[33m" + "Welcome to the program!" + "\u001B[0m");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\u001B[33m" + "Please input first number: " + "\u001B[0m");
        int a = scanner.nextInt();
        System.out.println("\u001B[33m" + "Please input second number: " + "\u001B[0m");
        int b = scanner.nextInt();
        int sum = 0;

        if (a > b) {
            System.out.println("Job completed");
            return;
        }

        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers from " + a + " to " + b + " is: " + sum);

        }
        static void task3() {
            System.out.println();
            System.out.println("\u001B[33m" + "Welcome to the program!" + "\u001B[0m");
            Scanner scanner = new Scanner(System.in);
            System.out.println("\u001B[33m" + "Please input positive number: " + "\u001B[0m");
            int n = scanner.nextInt();

            for (int i = 1; i <= n; i = i*2) {
                System.out.println(i);
            }
        }
    }







