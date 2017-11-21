package lessons.lesson2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ширину прямоугольника");
        int a = scanner.nextInt();

        System.out.println("Введите высоту прямоугольника");
        int b = scanner.nextInt();

        System.out.println( "Площадь прямоугольника составляет " + (a * b) );

    }
}
