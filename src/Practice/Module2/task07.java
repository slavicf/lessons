package Practice.Module2;

import java.util.Scanner;

public class task07 {

    public static void main(String[] args) {

//        Задание 7 (дополнительное)
//        Программа считывает с консоли цвет в формате RRGGBB и выводит текст Hello World в консоль этим цветом.

//        РЕШЕНИЕ НЕ ПРЕДСТАВЛЯЕТСЯ ВОЗМОЖНЫМ, Т.К. ДОСТУПНЫ ТОЛЬКО 8 ЦВЕТОВ ТЕКСТА КОНСОЛИ

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите желаемый цвет из списка:");
        System.out.println("0 - чёрный;\n1 - красный;\n2 - зелёный;\n3 - жёлтый;\n" +
                "4 - синий;\n5 - пурпурный;\n6 - циан;\n7 - белый.");

        int color = scanner.nextInt();

        if (color >= 0 && color <=7){
            System.out.print("\033[3" + color + "m");
        }

        System.out.println("Hello World");
    }
}
