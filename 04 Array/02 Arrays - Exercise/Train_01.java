package com.company;import java.util.Scanner;public class Train_01 {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int n = Integer.parseInt(scanner.nextLine());        int[] wagon = new int[n];        int sum = 0;        for (int i = 0; i < wagon.length ; i++) {            int peopleInWagon = Integer.parseInt(scanner.nextLine());            wagon[i] = peopleInWagon;            sum += wagon[i];        }        for (int people : wagon) {            System.out.print(people + " ");        }        System.out.println();        System.out.println(sum);    }}