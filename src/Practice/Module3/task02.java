package Practice.Module3;

import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {

//        Задание 2
//        Программа считывает размер массива А
//        Программа считывает массив А
//
//        Перевернуть массив (отзеркалить массив) и вывести его в консоль
//
//        Например:
//        - Вход: 1,2,3,10,8,30,5
//        - Вывод: 5,30,8,10,3,2,1

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива А: ");
        int ALength = scanner.nextInt();

        int[] A = new int[ALength];

        System.out.println("Введите элементы массива А: ");
        for (int i = 0; i < ALength; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < ALength / 2; i++){
            int temp = A[i], OppSide = -(i-ALength+1);

            A[i] = A[OppSide];
            A[OppSide] = temp;
        }

        for (int element: A) {
            System.out.print(element + " ");
        }

    }
}
