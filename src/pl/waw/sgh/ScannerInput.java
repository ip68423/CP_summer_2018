package pl.waw.sgh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);


        System.out.println("Please give your age: ");
        int age = scanner.nextInt();
        System.out.println("age: " + age);

        boolean success = false;
        while (!success) { //while (!succcess)
            try {
                System.out.println("Please give your age: ");
                scanner = new Scanner(System.in);
                age = scanner.nextInt();
                success = true;
            } catch (InputMismatchException ie) {
                System.out.println("Please try again!");
            }
            System.out.println("age: " + age);
        }
    }
}