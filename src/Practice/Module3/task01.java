package Practice.Module3;

import java.util.Scanner;

public class task01 {

    public static void main(String[] args) {

//        Задание 1
//        Пользователь вводит 2 числа.
//        Программа сохраняет два числа в две переменных.
//        Первая переменная - А, вторая переменная - B.
//        Необходимо вывести оба числа, в обратное последовательности. Например:
//        - A = 123, B = 4246
//        - На выходе будет:
//          321 6424

        Scanner scanner = new Scanner(System.in);

        int A, B, ReversedA = 0, ReversedB = 0;

        System.out.print("Введите число A: ");
        A = scanner.nextInt();

        System.out.print("Введите число B: ");
        B = scanner.nextInt();

        System.out.printf("%nВывод через метод: %d %d", ReverseInt(A), ReverseInt(B));

        while (A > 0){
            ReversedA *= 10;
            ReversedA += A % 10;
            A /= 10;
        }

        while (B > 0){
            ReversedB *= 10;
            ReversedB += B % 10;
            B /= 10;
        }

        System.out.printf("%nВывод через циклы: %d %d", ReversedA, ReversedB);

    }

    private static int ReverseInt(int x) {

        int y = 0;
        while (x > 0){
            y *= 10;
            y += x % 10;
            x /= 10;
        }

        return y;
    }
}
