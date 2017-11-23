package Practice.Module2;

import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {

//      Задание 2
//      Программа принимает на вход 2 числа - ширина и высота прямоугольника.
//      Необходимо вывести в консоль площадь прямоугольника

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ширину прямоугольника: ");
        int a = scanner.nextInt();

        System.out.print("Введите высоту прямоугольника: ");
        int b = scanner.nextInt();

        System.out.println();
        System.out.println( "Площадь прямоугольника составляет " + (a * b) );

    }
}
