package JavaCore.Module2;

import java.util.Scanner;

public class task10 {

    public static void main(String[] args) {

//        Задание 10 (дополнительное)
//        Пользователь вводит 2 строки.
//        Программа должна вывести на экран:
//        - встречается ли вторая введенная строка в первой (true / false)
//        - сколько раз встречается вторая строка в первой (int)
//        - в каком месте вторая строка встречается первый раз в первое (номер отступа от левого края, отсчет с единицы)
//
//        К примеру:
//        Ввод:		“abbccddeeff”, “bc”
//        Вывод:
//        - Встречается ли “bc” в “abbccddeeff”? - true
//        - Сколько раз встречается “bc” в “abbccddeeff”? - 1
//        - Где “bc” в “abbccddeeff” встречается в первый раз? - 3

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String string1 = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String string2 = scanner.nextLine();
        System.out.println();

        int index1 = string1.indexOf(string2);
        boolean detect = index1 != -1;
        System.out.println("1. Встречается ли \"" + string2 + "\" в \"" + string1 + "\"? - " + detect);

        int count = 0;
        int index = 0;

        do {
            index = string1.indexOf(string2, index);
            detect = index != -1;

            if (detect) count++;
            index++;

        } while (detect);

        System.out.println("2. Сколько раз встречается \"" + string2 + "\" в \"" + string1 + "\"? - " + count);

        System.out.println("3. Где \"" + string2 + "\" в \"" + string1 + "\" встречается в первый раз? - " + index1);

    }
}
