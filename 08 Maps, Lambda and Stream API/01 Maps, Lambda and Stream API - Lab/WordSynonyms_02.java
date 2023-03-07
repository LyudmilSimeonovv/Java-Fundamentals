package com.company;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countInput = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> worwdSynonyms = new LinkedHashMap<>();

        for (int i = 1; i <= countInput ; i++) {
            String worwd = scanner.nextLine();
            String synonyms = scanner.nextLine();
            if (!worwdSynonyms.containsKey(worwd)){
                worwdSynonyms.put(worwd,new ArrayList<>());
                worwdSynonyms.get(worwd).add(synonyms);
            } else {
                worwdSynonyms.get(worwd).add(synonyms);
            }
        }
        worwdSynonyms.forEach((key, value) -> System.out.printf("%s - %s%n", key, String.join(", ", value)));
    }
}
