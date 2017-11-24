package Practice.Module3;

import java.util.Scanner;

public class task03 {

    public static void main(String[] args) {

//        Задание 3
//        Программа считывает размер массива А
//        Программа считывает массив А
//        Программа считывает размер массива B
//        Программа считывает массив B
//
//        Необходимо просуммировать i-тый элемент массива А с i-тым элементом массива B.
//        Если i-того элемента нет - считать его нулем. Сохранить результат в массив C
//
//        Вывести массив - результат всех сумм.

        Scanner scanner = new Scanner(System.in);
//  ----------------------------------------------------------
        System.out.println("Введите размер массива А: ");
            int ALength = scanner.nextInt();
            int[] A = new int[ALength];
        System.out.println("Введите элементы массива А: ");
            for (int i = 0; i < ALength; i++) {
                A[i] = scanner.nextInt();
            }
//  ----------------------------------------------------------
        System.out.println("Введите размер массива B: ");
            int BLength = scanner.nextInt();
            int[] B = new int[BLength];
        System.out.println("Введите элементы массива B: ");
            for (int i = 0; i < BLength; i++) {
                B[i] = scanner.nextInt();
            }
//  ----------------------------------------------------------
        int CLength = ALength > BLength ? ALength : BLength;
            int[] C = new int[CLength];
            for (int i = 0; i < CLength; i++){
                int tempA = i < ALength ? A[i] : 0;
                int tempB = i < BLength ? B[i] : 0;
                    C[i] = tempA + tempB;
            }
//  ----------------------------------------------------------
        for (int element: C) {
            System.out.print(element + " ");
        }
//  ----------------------------------------------------------



    }
}
