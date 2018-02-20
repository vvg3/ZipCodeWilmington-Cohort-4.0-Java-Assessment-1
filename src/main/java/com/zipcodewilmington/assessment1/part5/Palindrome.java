package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {
        Integer counter = input.length();

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                counter++;
            }
        }

        for (int i = 0; i < input.length() - 2; i++) {

            if (input.charAt(i) == input.charAt(i + 2)) {
                counter++;
            }
        }

        if (input.length() > 3) {
            for (int i = 0; i < input.length() - 3; i++) {
                if (input.charAt(i) == input.charAt(i + 3) && input.charAt(i + 1) == input.charAt(i + 2)){
                    counter++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(input);

        if (input.length() > 3 && input.equals(sb.reverse().toString())) {
            counter++;
        }




        return counter;

    }
}
