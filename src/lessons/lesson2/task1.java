package lessons.lesson2;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дробное A");
        float a = scanner.nextFloat();

        System.out.println("Введите дробное B");
        float b = scanner.nextFloat();

        System.out.println( a + " + " + b + " = " + (a + b) );

    }
}
