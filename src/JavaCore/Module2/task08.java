package JavaCore.Module2;

import java.util.Scanner;

public class task08 {

    public static void main(String[] args) {

//        Задание 8 (дополнительное)
//                Программа считывает с консоли три разных цвета в формате RRGGBB. После чего она рисует в консоли пирамиду. Первых три строки у основания имеет первый цвет, вторые три второй цвет введенный пользователем, а последние три соответственно третий.
//                __
//               ____
//              ______
//             ________
//            __________
//           ____________
//          ______________
//         ________________
//        __________________

//        РЕШЕНИЕ НЕ ПРЕДСТАВЛЯЕТСЯ ВОЗМОЖНЫМ, Т.К. ДОСТУПНЫ ТОЛЬКО 8 ЦВЕТОВ ТЕКСТА КОНСОЛИ

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите желаемые цвета из списка:");
        System.out.println("0 - чёрный;\n1 - красный;\n2 - зелёный;\n3 - жёлтый;\n" +
                "4 - синий;\n5 - пурпурный;\n6 - циан;\n7 - белый.");

        System.out.print("Введите первый цвет: ");
        int color1 = scanner.nextInt();

        System.out.print("Введите второй цвет: ");
        int color2 = scanner.nextInt();

        System.out.print("Введите третий цвет: ");
        int color3 = scanner.nextInt();

        if (color3 >= 0 && color3 <=7){
            System.out.print("\033[3" + color3 + "m");
        }

        System.out.println("        __");
        System.out.println("       ____");
        System.out.println("      ______");

        if (color2 >= 0 && color2 <=7){
            System.out.print("\033[3" + color2 + "m");
        }
        System.out.println("     ________");
        System.out.println("    __________");
        System.out.println("   ____________");

        if (color1 >= 0 && color1 <=7){
            System.out.print("\033[3" + color1 + "m");
        }
        System.out.println("  ______________");
        System.out.println(" ________________");
        System.out.println("__________________");

    }
}
