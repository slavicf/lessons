package JavaCore.Module2;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

//      Задание 4
//      Дано 2 числа - A и B.
//      Вывести в консоль:
//      равны ли эти числа между собой (true / false)
//      делиться ли A на B без остатка (true / false)
//      A больше чем B (true / false)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
        int a = scanner.nextInt();

        System.out.print("Введите число B: ");
        int b = scanner.nextInt();
        System.out.println();

        boolean equal = a == b;    // проверяем на равенство
        System.out.println("A равно B? " + equal);

        boolean remainder = (a % b) == 0; // проверяем на деление без остатка
        System.out.println("Делится ли A на B без остатка? " + remainder);

        boolean greater = a > b; // a > b?
        System.out.println("A больше B? " + greater);

    }
}
