package Practice.Module3;

import java.util.Scanner;

public class task05 {

    public static void main(String[] args) {

//        Задание 5 (дополнительное)
//        Пользователь вводит 2 числа. Ширину и высоту. Необходимо в консоли отрисовать прямоугольник из символов ‘+’.
//
//        Пример:
//        - Ввод: 2 3
//        - Вывод:
//            + +
//            + +
//            + +

        Scanner scanner = new Scanner(System.in);
//  ---------------------- Ввод ширины -------------------------
        System.out.println("Введите ширину: ");
        int width = scanner.nextInt();
//  ---------------------- Ввод высоты -------------------------
        System.out.println("Введите высоту: ");
        int heigth = scanner.nextInt();
//  ------------------------------------------------------------
        for (int i = 0; i < heigth; i++){
            for (int j = 0; j < width; j++){
                System.out.print("+");
            }
            System.out.println();
        }
//  ------------------------------------------------------------

    }
}
