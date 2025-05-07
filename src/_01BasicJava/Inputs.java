package _01BasicJava;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your name");
        String name = input.nextLine();

        System.out.println("Namaste "+ name);
    }
}
