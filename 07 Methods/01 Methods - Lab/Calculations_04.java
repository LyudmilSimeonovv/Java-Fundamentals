package com.company;import java.util.Scanner;public class Calculations_04 {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        String command = scanner.nextLine();        int a = Integer.parseInt(scanner.nextLine());        int b = Integer.parseInt(scanner.nextLine());        printResult(command, a, b);    }    public static void printAdd(String input, int number1, int number2) {        int sum = number1 + number2;        if (input.equals("add")) {            System.out.println(sum);        }    }    public static void printMultiply(String input, int number1, int number2) {        int sum = number1 * number2;        if (input.equals("multiply")) {            System.out.println(sum);        }    }    public static void printSubtract(String input, int a, int b) {        int sum = a - b;        if (input.equals("subtract")) {            System.out.println(sum);        }    }    public static void printDivide(String input, int a, int b) {        int sum = a / b;        if (input.equals("divide")) {            System.out.println(sum);        }    }    public static void printResult(String input, int a, int b) {        switch (input) {            case "add" -> printAdd(input, a, b);            case "multiply" -> printMultiply(input, a, b);            case "divide" -> printDivide(input, a, b);            default -> printSubtract(input, a, b);        }    }}