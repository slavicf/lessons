package Practice.Module2;

import java.util.Scanner;

public class task05 {

    public static void main(String[] args) {

//     Задание 5
//     Дано 3 числа - A, B, C
//     Вывести в консоль:
//     - является ли A наибольшим числом (true / false)
//     - является ли B наибольшим числом (true / false)
//     - является ли C наибольшим числом (true / false)
//
//     - является ли A наименьшим числом (true / false)
//     - является ли B наименьшим числом (true / false)
//     - является ли C наименьшим числом (true / false)
//
//     - является ли A промежуточным числом между B и C (true / false)
//     - является ли B промежуточным числом между A и C (true / false)
//     - является ли C промежуточным числом между A и B (true / false)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
        int a = scanner.nextInt();

        System.out.print("Введите число B: ");
        int b = scanner.nextInt();

        System.out.print("Введите число C: ");
        int c = scanner.nextInt();

        System.out.println();

        boolean greaterA = (a > b) && (a > c);
        boolean greaterB = (b > a) && (b > c);
        boolean greaterC = (c > a) && (c > b);

        boolean lessA = (a < b) && (a < c);
        boolean lessB = (b < a) && (b < c);
        boolean lessC = (c < a) && (c < b);

        boolean interA = ((a > b) && (a < c)) || ((a > c) && (a < b));
        boolean interB = ((b > a) && (b < c)) || ((b > c) && (b < a));
        boolean interC = ((c > a) && (c < b)) || ((c > b) && (c < a));

        System.out.println("является ли A наибольшим числом? " + greaterA);
        System.out.println("является ли B наибольшим числом? " + greaterB);
        System.out.println("является ли C наибольшим числом? " + greaterC);
        System.out.println();

        System.out.println("является ли A наименьшим числом? " + lessA);
        System.out.println("является ли B наименьшим числом? " + lessB);
        System.out.println("является ли C наименьшим числом? " + lessC);
        System.out.println();

        System.out.println("является ли A промежуточным числом между B и C? " + interA);
        System.out.println("является ли B промежуточным числом между A и C? " + interB);
        System.out.println("является ли C промежуточным числом между A и B? " + interC);
        System.out.println();

    }
}
