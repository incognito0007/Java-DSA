package _01BasicJava.TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose one option: \n1. Convert C to F \n2.Convert F to C");
        int option = input.nextInt();

        if (option == 1){
            System.out.print("Enter the Temperature in degree C: ");
            float temp = input.nextFloat();

            float res = ((temp * 9) / 5) + 32;

            System.out.println();
            System.out.println("Temperature in degree F is " + res);
        }
        else if(option == 2) {
            System.out.print("Enter the Temperature in degree F: ");
            float temp = input.nextFloat();

            float res = ((temp - 32) * 5) / 9;

            System.out.println();
            System.out.println("Temperature in degree C is " + res);
        }
        else{
            System.out.println("Invalid option selected");
        }
    }
}
