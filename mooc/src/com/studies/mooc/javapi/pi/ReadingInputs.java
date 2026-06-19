package com.studies.mooc.javapi.pi;
import java.util.Scanner;

public class ReadingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a message: ");
        String message = scanner.nextLine();

        System.out.println("Your message was: " + message);
    }
}
