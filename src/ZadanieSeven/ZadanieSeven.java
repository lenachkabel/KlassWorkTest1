package ZadanieSeven;

import java.util.Scanner;

public class ZadanieSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String a = scanner.nextLine();
        System.out.println("Введите контрольное слово");
        String b = scanner.nextLine();
        if (a.contains(b)) {
            System.out.println("Контрольное слово в строке");
        } else {
            System.out.println("Контрольного слова нет");
        }

    }

}
