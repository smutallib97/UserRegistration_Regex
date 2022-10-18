package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailsValidation {
    public static void isValidFirstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
