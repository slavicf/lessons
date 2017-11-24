package Practice.test;

public class charExample {

    public static void main(String[] args) {

//        Just show numbering alphabet

        char a = 'a';
        int number = 1;

        do {

            System.out.println();

            for (int i = 0; i < 13; i++){
                System.out.print("\t" + number++ + ". " + a++);
            }

            System.out.println();

        }while (a <= 'z');

    }
}
