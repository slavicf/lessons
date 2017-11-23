package JavaCore.Module2;

import java.util.Scanner;

public class task01 {

    public static void main(String[] args) {

//      Задание 1
//      Написать программу которая считывает 2 дробных числа с консоли.
//      Назовем эти числа A и B. Программа должна сложить два числа и вывести результат в формате:
//      A + B = X (все буквы должны быть заменены на числа).

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дробное A: ");
        float a = scanner.nextFloat();

        System.out.print("Введите дробное B: ");
        float b = scanner.nextFloat();

        System.out.println();
        System.out.println( a + " + " + b + " = " + (a + b) );

    }
}
