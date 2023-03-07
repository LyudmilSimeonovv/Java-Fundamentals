package com.company;

import java.util.Scanner;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] worwd = input.split("\\s+");

        for (String s : worwd) {
            int evenLenght = s.length();
            if (evenLenght % 2 == 0) {
                System.out.println(s);
            }
        }
    }
}
