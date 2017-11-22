package JavaCore.Module2;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

//      Задание 3
//      Программа принимает на вход 3 числа - длины сторон треугольника.
//      Необходимо вывести в консоль площадь треугольника

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сторону треугольника a:");
        double a = scanner.nextDouble();

        System.out.println("Введите сторону треугольника b:");
        double b = scanner.nextDouble();

        System.out.println("Введите сторону треугольника c:");
        double c = scanner.nextDouble();

        double p = (a + b + c) / 2;     // Вычисляем полупериметр для формулы Герона
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));  // Вычисляем площадь по формуле Герона
        System.out.println("Площадь треугольника равна " + S);
    }
}
