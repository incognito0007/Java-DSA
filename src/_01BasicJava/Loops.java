package _01BasicJava;

public class Loops {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("Using while loop");
        while(count <= 5){
            System.out.println(count);
            count++;
        }

        System.out.println();
        System.out.println("Using for loop");

        for (int x = 1; x <= 5; x++) {
            System.out.println(x);
        }
    }
}
