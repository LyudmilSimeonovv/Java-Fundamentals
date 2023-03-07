package com.company;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        //String input = scanner.nextLine();
        double[] number = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> finalArray = new TreeMap<>();

        for (int i = 0; i < number.length; i++) {
            if (!finalArray.containsKey(number[i])) {
                finalArray.put(number[i], 1);
            } else {
                finalArray.put(number[i], finalArray.get(number[i]) + 1);
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.#######");
        finalArray.forEach((key, value) -> System.out.printf("%s -> %d%n", decimalFormat.format(key), value));
    }
}
