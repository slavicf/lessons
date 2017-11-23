package JavaCore.Module2;

import java.util.Scanner;

public class task09 {

    public static void main(String[] args) {


//        Задание 9 (дополнительное)
//        Пользователь вводит 2 строки и число.
//        Необходимо вставить вторую строку в первую строку используя число как отступ от начала первой строки.
//        К примеру:
//        Ввод: 		“aaaaaaaa”, “00”, 3
//        Результат: 	“aa00aaaaaa”

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String string1 = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String string2 = scanner.nextLine();

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.println("Результат : " + string1.substring(0, --number) + string2 + string1.substring(number));

    }
}
