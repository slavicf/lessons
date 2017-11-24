package Practice.Module3;

import java.util.Scanner;

public class task04 {

    public static void main(String[] args) {

//        Задание 4
//        Программа считывает размер массива А
//        Программа считывает массив А
//
//        Отсортировать массив по убыванию и вывести в консоль

        Scanner scanner = new Scanner(System.in);
//  ---------------------- Ввод массива A ----------------------
        System.out.println("Введите размер массива А: ");
            int ALength = scanner.nextInt();
            int[] A = new int[ALength];
        System.out.println("Введите элементы массива А: ");
            for (int i = 0; i < ALength; i++) {
                A[i] = scanner.nextInt();
            }
//  ------------ Сортировка массива по убыванию ----------------
        for (int j = ALength - 1; j > 0; j--){
            for (int i = 0; i < j; i++)
                if (A[i] < A[i + 1]) {
                    A[i] ^= A[i + 1];   // -------------------------------------------------  // int temp = A[i];
                    A[i + 1] ^= A[i];   // https://tproger.ru/problems/popular-ways-to-swap/  // A[i] = A[i + 1];
                    A[i] ^= A[i + 1];   // -------------------------------------------------  // A[i + 1] = temp;
                }
        }
//  ---------------------- Вывод массива A ---------------------
        for (int element: A) {
            System.out.print(element + " ");
        }
//  ------------------------------------------------------------

    }
}
