package _01BasicJava;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Automatic type conversion [when destination is greater than source]
        float num = input.nextFloat();              //even if I enter integer it will automatically get converted to float
        System.out.println(num);
        float num2 = input.nextInt();
        System.out.println(num2);
//        int num3 = input.nextFloat(); ---------> this will give error because int(destination) is smaller than float(source)

//        Type Casting
        int num4 = (int)(67.56f);
        System.out.println(num4);

        byte b = 40;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / (double)(c)) - (d * s);
//        result = float + double + double = double -------> [because double is greater than every other value]
        System.out.println((f * b) + " + " + (i / (double)(c)) + " - " + (d * s));
        System.out.println(result);
    }
}
