package com.company;import java.util.ArrayList;import java.util.List;import java.util.Scanner;import java.util.regex.Matcher;import java.util.regex.Pattern;public class Furniture_01 {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        String input = scanner.nextLine();        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)";        Pattern pattern = Pattern.compile(regex);        List<String> furniture = new ArrayList<>();        double spendMoney = 0;        while (!input.equals("Purchase")) {            Matcher matcher = pattern.matcher(input);            while (matcher.find()) {                String name = matcher.group("name");                double price = Double.parseDouble(matcher.group("price"));                int quatntity = Integer.parseInt(matcher.group("quantity"));                furniture.add(name);                spendMoney += price * quatntity;            }            input = scanner.nextLine();        }        System.out.println("Bought furniture:");        furniture.forEach(System.out::println);        System.out.printf("Total money spend: %.2f", spendMoney);    }}