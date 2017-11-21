package lessons.lesson2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

//      Задание 2
//      Программа принимает на вход 2 числа - ширина и высота прямоугольника.
//      Необходимо вывести в консоль площадь прямоугольника

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ширину прямоугольника");
        int a = scanner.nextInt();

        System.out.println("Введите высоту прямоугольника");
        int b = scanner.nextInt();

        System.out.println( "Площадь прямоугольника составляет " + (a * b) );

    }
}
