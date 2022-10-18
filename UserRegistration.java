package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration extends UserDetailsValidation {
    static Scanner scanner = new Scanner(System.in);
    static String firstName, lastName, email, mobileNumber;

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem");
        userFirstName();
        userLastName();
        userEmail();
        userMobileNumber();

    }

    // UC1 - Ability to add first name
    public static void userFirstName() {
        System.out.println("Enter your First Name");
        firstName = scanner.next();
        UserDetailsValidation.isValidFirstName(firstName);
    }
    // UC2 - Ability to add last name
    public static void userLastName() {
        System.out.println("Enter your Last Name");
        lastName = scanner.next();
        UserDetailsValidation.isValidFirstName(lastName);
    }
    // UC3 - Ability to add email
    public static void userEmail() {
        System.out.println("Enter your Email");
        email = scanner.next();
        UserDetailsValidation.isValidEmail(email);
    }
    // UC4 - Ability to add mobile number
    public static void userMobileNumber() {
        System.out.println("Enter your mobile Number");
        mobileNumber = scanner.next();
        UserDetailsValidation.isValidMobileNumber(mobileNumber);
    }
}
