package JavaCore.Module2;

import java.util.Scanner;

public class task06 {

    public static void main(String[] args) {

//      Задание 6
//      Дано 3 числа - A, B, C
//      Вывести в консоль:
//      - равняется ли A хотя бы одному из других чисел
//      - равняется ли B хотя бы одному из других чисел
//      - равняется ли C хотя бы одному из других чисел
//
//      - A больше хотя бы одного из других чисел
//      - B больше хотя бы одного из других чисел
//      - C больше хотя бы одного из других чисел

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
        int a = scanner.nextInt();

        System.out.print("Введите число B: ");
        int b = scanner.nextInt();

        System.out.print("Введите число C: ");
        int c = scanner.nextInt();

        System.out.println();

        boolean equalA = (a == b) || (a == c);
        boolean equalB = (b == a) || (b == c);
        boolean equalC = (c == a) || (c == b);

        boolean greaterA = (a > b) || (a > c);
        boolean greaterB = (b > a) || (b > c);
        boolean greaterC = (c > a) || (c > b);

        System.out.println("равняется ли A хотя бы одному из других чисел? " + equalA);
        System.out.println("равняется ли B хотя бы одному из других чисел? " + equalB);
        System.out.println("равняется ли C хотя бы одному из других чисел? " + equalC);
        System.out.println();

        System.out.println("A больше хотя бы одного из других чисел? " + greaterA);
        System.out.println("B больше хотя бы одного из других чисел? " + greaterB);
        System.out.println("C больше хотя бы одного из других чисел? " + greaterC);
        System.out.println();

    }
}
